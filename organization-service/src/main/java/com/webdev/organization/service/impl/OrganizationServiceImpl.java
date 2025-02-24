package com.webdev.organization.service.impl;

import com.webdev.organization.dto.OrganizationDto;
import com.webdev.organization.entity.Organization;
import com.webdev.organization.repository.OrganizationRepository;
import com.webdev.organization.service.OrganizationService;
import lombok.AllArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class OrganizationServiceImpl implements OrganizationService {

    private final OrganizationRepository organizationRepository;
    private final ModelMapper modelMapper;

    @Override
    public OrganizationDto addOrganization(OrganizationDto organizationDto) {
        Organization organization = modelMapper.map(organizationDto, Organization.class);
        Organization savedOrganization = organizationRepository.save(organization);
        return modelMapper.map(savedOrganization, OrganizationDto.class);
    }

    @Override
    public OrganizationDto getOrganizationByCode(String organizationCode) {
        Organization organization = organizationRepository.findByOrganizationCode(organizationCode);
        return modelMapper.map(organization, OrganizationDto.class);
    }

    @Override
    public List<OrganizationDto> getAllOrganizations() {
        List<Organization> organizations = organizationRepository.findAll();
        return organizations
                .stream()
                .map(organization -> modelMapper.map(organization, OrganizationDto.class))
                .toList();
    }
}
