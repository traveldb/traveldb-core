package io.traveldb.countries.repository;

import io.traveldb.countries.model.Country;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CountryRepository extends JpaRepository<Country, Integer> {
    List<Country> findBycountry_alpha2_codeIgnoreCaseContaining(String alpha2_code);
}
