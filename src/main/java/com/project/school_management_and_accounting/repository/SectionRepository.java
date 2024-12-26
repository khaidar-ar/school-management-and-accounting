package com.project.school_management_and_accounting.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

public interface SectionRepository extends JpaRepository<SectionRepository, Integer> {

    Optional<SectionRepository> findByUuid(String uuid);

}
