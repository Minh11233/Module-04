package com.example.finaltest.model;


import javax.persistence.*;

@Entity
public class City {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private String cityName;
    @ManyToOne
    @JoinColumn(name = "country_id")
    private Country country;
    private String acreage;
    private long population;
    private long GDP;
    private String description;

    public City(long id, String cityName, Country country, String acreage, long population, long GDP, String description) {
        this.id = id;
        this.cityName = cityName;
        this.country = country;
        this.acreage = acreage;
        this.population = population;
        this.GDP = GDP;
        this.description = description;
    }

    public City() {
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }
    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    public String getAcreage() {
        return acreage;
    }

    public void setAcreage(String acreage) {
        this.acreage = acreage;
    }

    public long getPopulation() {
        return population;
    }

    public void setPopulation(long population) {
        this.population = population;
    }

    public long getGDP() {
        return GDP;
    }

    public void setGDP(long GDP) {
        this.GDP = GDP;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Country getCountry() {
        return country;
    }

    public void setCountry(Country country) {
        this.country = country;
    }
}
