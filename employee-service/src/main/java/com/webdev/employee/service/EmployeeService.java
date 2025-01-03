package com.webdev.employee.service;

import com.webdev.employee.dto.EmployeeDto;

import java.util.List;

public interface EmployeeService {
    EmployeeDto save(EmployeeDto employeeDto);
    EmployeeDto getEmployeeById(Long employeeId);
    List<EmployeeDto> getAllEmployees();
}
