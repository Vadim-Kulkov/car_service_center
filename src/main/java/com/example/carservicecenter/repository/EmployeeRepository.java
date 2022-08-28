package com.example.carservicecenter.repository;

import com.example.carservicecenter.entities.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface EmployeeRepository extends JpaRepository<Employee, String> {

    @Override
    List<Employee> findAll();
}