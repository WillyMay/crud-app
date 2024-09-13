package com.example.crud_app.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.crud_app.model.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {

}
