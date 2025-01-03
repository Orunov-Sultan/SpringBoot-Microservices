package com.webdev.employee.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class APIResponseDto {
    private EmployeeDto employee;
    private DepartmentDto department;
}
