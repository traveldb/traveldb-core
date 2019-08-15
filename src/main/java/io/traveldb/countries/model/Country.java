package io.traveldb.countries.model;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

@Entity
@Table(name = "countries")
public class Country extends AuditModel {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Integer country_id;

    @NotBlank
    @Size(max = 2)
    private String country_alpha2_code;

    @NotBlank
    @Size(max = 100)
    private String country_name;

    @NotBlank
    @Size(max = 3)
    private String currency_code;

    @Size(max = 2)
    private String fips_code;

    @Size(max = 4)
    private String country_numeric_code;

    @Size(max = 30)
    private String north;

    @Size(max = 30)
    private String south;

    @Size(max = 30)
    private String east;

    @Size(max = 30)
    private String west;

    @Size(max = 100)
    private String country_capital;

    @Size(max = 100)
    private String continent_name;

    @Size(max = 2)
    private String continent_code;

    @Size(max = 200)
    private String languages;

    @Size(max = 3)
    private String country_alpha3_code;

    private Integer geo_name_id;

    public Integer getCountry_id() {
        return country_id;
    }

    public void setCountry_id(Integer country_id) {
        this.country_id = country_id;
    }

    public String getCountry_alpha2_code() {
        return country_alpha2_code;
    }

    public void setCountry_alpha2_code(String country_alpha2_code) {
        this.country_alpha2_code = country_alpha2_code;
    }

    public String getCountry_name() {
        return country_name;
    }

    public void setCountry_name(String country_name) {
        this.country_name = country_name;
    }

    public String getCurrency_code() {
        return currency_code;
    }

    public void setCurrency_code(String currency_code) {
        this.currency_code = currency_code;
    }

    public String getFips_code() {
        return fips_code;
    }

    public void setFips_code(String fips_code) {
        this.fips_code = fips_code;
    }

    public String getCountry_numeric_code() {
        return country_numeric_code;
    }

    public void setCountry_numeric_code(String country_numeric_code) {
        this.country_numeric_code = country_numeric_code;
    }

    public String getNorth() {
        return north;
    }

    public void setNorth(String north) {
        this.north = north;
    }

    public String getSouth() {
        return south;
    }

    public void setSouth(String south) {
        this.south = south;
    }

    public String getEast() {
        return east;
    }

    public void setEast(String east) {
        this.east = east;
    }

    public String getWest() {
        return west;
    }

    public void setWest(String west) {
        this.west = west;
    }

    public String getCountry_capital() {
        return country_capital;
    }

    public void setCountry_capital(String country_capital) {
        this.country_capital = country_capital;
    }

    public String getContinent_name() {
        return continent_name;
    }

    public void setContinent_name(String continent_name) {
        this.continent_name = continent_name;
    }

    public String getContinent_code() {
        return continent_code;
    }

    public void setContinent_code(String continent_code) {
        this.continent_code = continent_code;
    }

    public String getLanguages() {
        return languages;
    }

    public void setLanguages(String languages) {
        this.languages = languages;
    }

    public String getCountry_alpha3_code() {
        return country_alpha3_code;
    }

    public void setCountry_alpha3_code(String country_alpha3_code) {
        this.country_alpha3_code = country_alpha3_code;
    }

    public Integer getGeo_name_id() {
        return geo_name_id;
    }

    public void setGeo_name_id(Integer geo_name_id) {
        this.geo_name_id = geo_name_id;
    }
}