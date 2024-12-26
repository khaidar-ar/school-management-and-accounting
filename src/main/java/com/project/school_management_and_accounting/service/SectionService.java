package com.project.school_management_and_accounting.service;

import java.util.Optional;

import com.project.school_management_and_accounting.entity.Section;

public interface SectionService {

    Optional<Section> findById(String id);

}
