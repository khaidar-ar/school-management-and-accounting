package com.project.school_management_and_accounting.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

public interface Department extends JpaRepository<Department, Integer> {

    Optional<Department> findByUuid(String uuid);

}
