package com.example.finaltest.repository;

import com.example.finaltest.model.City;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CityRepository extends PagingAndSortingRepository<City, Long>, CrudRepository<City, Long> {
}
