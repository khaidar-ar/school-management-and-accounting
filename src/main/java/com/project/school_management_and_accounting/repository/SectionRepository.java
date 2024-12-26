package com.project.school_management_and_accounting.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.project.school_management_and_accounting.entity.Section;

public interface SectionRepository extends JpaRepository<SectionRepository, Integer> {

    Optional<Section> findByUuid(String uuid);

}
