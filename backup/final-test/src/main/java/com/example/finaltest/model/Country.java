package com.example.finaltest.model;


import javax.persistence.*;
import java.util.List;
@Entity
public class Country {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String country;

    @OneToMany(targetEntity = City.class)
    private List<City> cityList;

    public Country() {
    }

    public Country(long id, String country, List<City> cityList) {
        this.id = id;
        this.country = country;
        this.cityList = cityList;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public List<City> getCityList() {
        return cityList;
    }

    public void setCityList(List<City> cityList) {
        this.cityList = cityList;
    }
}
