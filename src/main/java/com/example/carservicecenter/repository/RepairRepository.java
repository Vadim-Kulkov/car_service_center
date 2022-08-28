package com.example.carservicecenter.repository;


import com.example.carservicecenter.entities.Repair;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface RepairRepository extends JpaRepository<Repair, String> {

    @Override
    List<Repair> findAll();
}