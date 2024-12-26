package com.project.school_management_and_accounting.service;

import java.util.Optional;

import com.project.school_management_and_accounting.entity.School;

public interface SchoolService {

    Optional<School> findById(String id);

}
