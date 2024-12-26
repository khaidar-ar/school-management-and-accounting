package com.project.school_management_and_accounting.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

public interface SchoolRepository extends JpaRepository<SchoolRepository, Integer> {

    Optional<SchoolRepository> findByUuid(String uuid);

}
