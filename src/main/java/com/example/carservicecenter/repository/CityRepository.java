package com.example.carservicecenter.repository;


import com.example.carservicecenter.entities.City;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CityRepository extends JpaRepository<City, String> {

    @Override
    List<City> findAll();
}