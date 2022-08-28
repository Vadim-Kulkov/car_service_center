package com.example.carservicecenter.repository;


import com.example.carservicecenter.entities.Company;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CompanyRepository extends JpaRepository<Company, String> {

    @Override
    List<Company> findAll();
}