package com.webdev.departmentservice.service;

import com.webdev.departmentservice.dto.DepartmentDto;

import java.util.List;

public interface DepartmentService {
    DepartmentDto addDepartment(DepartmentDto departmentDto);
    DepartmentDto findDepartmentByCode(String code);
    List<DepartmentDto> getAllDepartments();
}
