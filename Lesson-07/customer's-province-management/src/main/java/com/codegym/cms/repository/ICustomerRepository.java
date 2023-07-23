package com.codegym.cms.repository;

import com.codegym.cms.model.Customer;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ICustomerRepository extends PagingAndSortingRepository<Customer, Long> {
    @Query("select c from Customer c where c.isActive = true")
    List<Customer> findAll();

    @Modifying
    @Query("update Customer c set c.isActive = false where c.id = :id")
    void deleteById(@Param("id") Long id);

    Page<Customer> findAllByFirstNameContaining(String firstname, Pageable pageable);

}
