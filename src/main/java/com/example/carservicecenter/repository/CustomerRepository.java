package com.example.carservicecenter.repository;

import com.example.carservicecenter.entities.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CustomerRepository extends JpaRepository<Customer, String> {

    @Override
    List<Customer> findAll();
}