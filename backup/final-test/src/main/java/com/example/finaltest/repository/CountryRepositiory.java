package com.example.finaltest.repository;

import com.example.finaltest.model.Country;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface CountryRepositiory extends PagingAndSortingRepository<Country, Long>, CrudRepository<Country, Long> {
}
