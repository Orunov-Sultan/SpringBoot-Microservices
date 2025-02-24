package com.webdev.organization.controller;

import com.webdev.organization.dto.OrganizationDto;
import com.webdev.organization.service.OrganizationService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/organizations")
@AllArgsConstructor
public class OrganizationController {

    private final OrganizationService organizationService;

    @PostMapping
    public ResponseEntity<OrganizationDto> addOrganization(@RequestBody OrganizationDto organizationDto) {
        OrganizationDto organization = organizationService.addOrganization(organizationDto);
        return new ResponseEntity<>(organization, HttpStatus.CREATED);
    }

    @GetMapping("/{organizationCode}")
    public ResponseEntity<OrganizationDto> getOrganizationByCode(@PathVariable String organizationCode) {
        OrganizationDto organization = organizationService.getOrganizationByCode(organizationCode);
        return ResponseEntity.ok(organization);
    }

    @GetMapping
    public ResponseEntity<List<OrganizationDto>> getAllOrganizations() {
        List<OrganizationDto> organizations = organizationService.getAllOrganizations();
        return ResponseEntity.ok(organizations);
    }
}
