package com.example.carservicecenter.repository;


import com.example.carservicecenter.entities.Individual;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface IndividualRepository extends JpaRepository<Individual, String> {

    @Override
    List<Individual> findAll();
}