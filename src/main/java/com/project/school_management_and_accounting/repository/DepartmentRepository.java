package com.project.school_management_and_accounting.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.project.school_management_and_accounting.entity.Department;

public interface DepartmentRepository extends JpaRepository<DepartmentRepository, Integer> {

    Optional<Department> findByUuid(String uuid);

}
