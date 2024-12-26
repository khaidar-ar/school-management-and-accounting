package com.project.school_management_and_accounting.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

public interface School extends JpaRepository<School, Integer> {

    Optional<School> findByUuid(String uuid);

}
