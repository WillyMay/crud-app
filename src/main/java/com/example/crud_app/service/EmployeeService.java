package com.example.crud_app.service;

import java.util.List;

import com.example.crud_app.dto.EmployeeDto;

public class EmployeeService {

    List<EmployeeDto> getAllEmployees();

    EmployeeDto creatEmployee(EmployeeDto employee);

    EmployeeDto getEmployeeById(Long employeeId);

    EmployeeDto updateEmployee(Long employeeId, EmployeeDto employeeDto);

    void deleteEmployee(Long employeeId);

}
