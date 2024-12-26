package com.project.school_management_and_accounting.service.impl;

import org.springframework.stereotype.Service;

import com.project.school_management_and_accounting.entity.Department;
import com.project.school_management_and_accounting.exception.ResourceNotFound;
import com.project.school_management_and_accounting.repository.DepartmentRepository;
import com.project.school_management_and_accounting.service.DepartmentService;

import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@AllArgsConstructor
@Service
public class DepartmentServiceImpl implements DepartmentService {

    private final DepartmentRepository departmentRepository;

    @Override
    public Department findById(String id) {
        log.info("start - find department | {}", this.getClass().toString());
        Department department = departmentRepository.findByUuid(id)
                .orElseThrow(() -> new ResourceNotFound("resource with id : " + id + "not found"));
        return department;
    }

}
