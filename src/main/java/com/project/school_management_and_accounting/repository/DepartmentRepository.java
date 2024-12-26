package com.project.school_management_and_accounting.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

public interface DepartmentRepository extends JpaRepository<DepartmentRepository, Integer> {

    Optional<DepartmentRepository> findByUuid(String uuid);

}
