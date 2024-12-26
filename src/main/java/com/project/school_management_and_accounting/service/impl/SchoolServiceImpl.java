package com.project.school_management_and_accounting.service.impl;

import org.springframework.stereotype.Service;

import com.project.school_management_and_accounting.entity.School;
import com.project.school_management_and_accounting.exception.ResourceNotFound;
import com.project.school_management_and_accounting.repository.SchoolRepository;
import com.project.school_management_and_accounting.service.SchoolService;

import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@AllArgsConstructor
@Service
public class SchoolServiceImpl implements SchoolService {

    private final SchoolRepository schoolRepository;

    @Override
    public School findById(String id) {
        log.info("start - find school | {}", this.getClass().toString());
        School school = schoolRepository.findByUuid(id)
                .orElseThrow(() -> new ResourceNotFound("resource with id " + id + ", not found"));
        return school;
    }

}
