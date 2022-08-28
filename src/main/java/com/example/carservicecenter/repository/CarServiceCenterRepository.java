package com.example.carservicecenter.repository;

import com.example.carservicecenter.entities.CarServiceCenter;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CarServiceCenterRepository extends JpaRepository<CarServiceCenter, String> {

    @Override
    List<CarServiceCenter> findAll();
}