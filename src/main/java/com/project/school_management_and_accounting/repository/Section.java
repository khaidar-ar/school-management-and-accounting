package com.project.school_management_and_accounting.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

public interface Section extends JpaRepository<Section, Integer> {

    Optional<Section> findByUuid(String uuid);

}
