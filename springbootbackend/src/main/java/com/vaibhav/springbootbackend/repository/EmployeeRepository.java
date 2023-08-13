package com.vaibhav.springbootbackend.repository;

import com.vaibhav.springbootbackend.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository

public interface EmployeeRepository extends JpaRepository<Employee,Long> {
    //This repository performs CRUD
}
