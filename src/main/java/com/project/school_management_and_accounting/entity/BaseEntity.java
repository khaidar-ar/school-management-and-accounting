package com.project.school_management_and_accounting.entity;

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
}
