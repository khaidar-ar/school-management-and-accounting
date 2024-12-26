package com.project.school_management_and_accounting.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.project.school_management_and_accounting.entity.School;

public interface SchoolRepository extends JpaRepository<SchoolRepository, Integer> {

    Optional<School> findByUuid(String uuid);

}
