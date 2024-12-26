package com.project.school_management_and_accounting.service.impl;

import org.springframework.stereotype.Service;

import com.project.school_management_and_accounting.entity.Section;
import com.project.school_management_and_accounting.exception.ResourceNotFound;
import com.project.school_management_and_accounting.repository.SectionRepository;
import com.project.school_management_and_accounting.service.SectionService;

import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@AllArgsConstructor
@Service
public class SectionServiceImpl implements SectionService {

    private final SectionRepository sectionRepository;

    @Override
    public Section findById(String id) {
        log.info("start - find section | {}", this.getClass().toString());
        Section section = sectionRepository.findByUuid(id)
                .orElseThrow(() -> new ResourceNotFound("resource with id : " + id + " not found"));
        return section;
    }

}
