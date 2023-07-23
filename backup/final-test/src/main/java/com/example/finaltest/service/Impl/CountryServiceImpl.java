package com.example.finaltest.service.Impl;

import com.example.finaltest.model.Country;
import com.example.finaltest.repository.CountryRepositiory;
import com.example.finaltest.service.CountryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;
@Service
public class CountryServiceImpl implements CountryService {
    @Autowired
    CountryRepositiory countryRepositiory;
    @Override
    public Iterable<Country> findAll() {
        return countryRepositiory.findAll();
    }

    @Override
    public Optional<Country> findById(Long id) {
        return countryRepositiory.findById(id);
    }

    @Override
    public void save(Country country) {
        countryRepositiory.save(country);
    }

    @Override
    public void remove(Long id) {
        countryRepositiory.deleteById(id);
    }
}
