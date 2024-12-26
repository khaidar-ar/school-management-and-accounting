package com.project.school_management_and_accounting.service;

import java.util.Optional;

import com.project.school_management_and_accounting.entity.Department;

public interface DepartmentService {

    Optional<Department> findById(String id);
}
