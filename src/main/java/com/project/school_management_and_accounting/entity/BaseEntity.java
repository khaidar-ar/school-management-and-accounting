package com.project.school_management_and_accounting.entity;

import java.time.LocalDate;
import java.util.UUID;
import org.hibernate.annotations.SQLRestriction;
import jakarta.persistence.Column;
import jakarta.persistence.MappedSuperclass;
import lombok.Data;

@Data
@SQLRestriction("deleted <> true")
@MappedSuperclass
public abstract class BaseEntity {

    private String uuid = UUID.randomUUID().toString();

    @Column(name = "deleted", nullable = false, columnDefinition = "boolean default false")
    private Boolean deleted;

    @Column(name = "created_at", nullable = false)
    private LocalDate createdAt = LocalDate.now();

    @Column(name = "updated_at")
    private LocalDate updatedAt;
}
