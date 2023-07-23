package com.codegym.cms.service;

import com.codegym.cms.model.Customer;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Service;

import org.springframework.data.domain.Pageable;

@Service
public interface ICustomerService extends IGeneralService<Customer> {
    Page<Customer> findAll(Pageable pageable);

    Page<Customer> findAllByFirstNameContaining(String firstname, Pageable pageable);

}
