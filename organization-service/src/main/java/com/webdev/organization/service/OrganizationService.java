package com.webdev.organization.service;

import com.webdev.organization.dto.OrganizationDto;

import java.util.List;

public interface OrganizationService {
    OrganizationDto addOrganization(OrganizationDto organizationDto);
    OrganizationDto getOrganizationByCode(String organizationCode);
    List<OrganizationDto> getAllOrganizations();
}
