package com.webdev.employee.service;

import com.webdev.employee.dto.DepartmentDto;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(url = "http://localhost:8080", value = "DEPARTMENT-SERVICE")
public interface APIClient {

    @GetMapping("/api/departments/{code}")
    DepartmentDto getDepartmentsByCode(@PathVariable String code);
}
