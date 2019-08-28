package io.traveldb.core.controller;

import io.traveldb.core.exception.ResourceNotFoundException;
import io.traveldb.core.model.Country;
import io.traveldb.core.repository.CountryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import javax.validation.Valid;

@RestController
public class CountryController {
    @Autowired
    private CountryRepository countryRepository;


    @GetMapping("/countries")
    public Page<Country> getAllCountries(Pageable pageable) {
        return countryRepository.findAll(pageable);
    }

    @GetMapping("/countries/{countryId}")
    public ResponseEntity<Country> getAllCountryById(@PathVariable Integer countryId) throws ResourceNotFoundException{
        Country country = countryRepository.findById(countryId)
                .orElseThrow(() -> new ResourceNotFoundException("Country not found for id" + countryId));

        return ResponseEntity.ok().body(country);
    }

    @PostMapping("/countries")
    public Country createCountry(@Valid @RequestBody Country Country) {
        return countryRepository.save(Country);
    }


    @PutMapping("/countries/{countryId}")
    public Country updateCountry(@PathVariable Integer countryId,
                                   @Valid @RequestBody Country CountryRequest) throws ResourceNotFoundException {
        return countryRepository.findById(countryId)
                .map(Country -> {
                    Country.setCountry_name(CountryRequest.getCountry_name());
                    Country.setCountry_alpha2_code(CountryRequest.getCountry_alpha2_code());
                    return countryRepository.save(Country);
                }).orElseThrow(() -> new ResourceNotFoundException("Country not found with id " + countryId));
    }


    @DeleteMapping("/countries/{countryId}")
    public ResponseEntity<?> deleteCountry(@PathVariable Integer countryId) throws ResourceNotFoundException {
        return countryRepository.findById(countryId)
                .map(Country -> {
                    countryRepository.delete(Country);
                    return ResponseEntity.ok().build();
                }).orElseThrow(() -> new ResourceNotFoundException("Country not found with id " + countryId));
    }
}