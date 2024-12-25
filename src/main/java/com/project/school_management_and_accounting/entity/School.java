package com.project.school_management_and_accounting.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Index;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "school", indexes = {
        @Index(name = "school_secure_id", columnList = "uuid")
})
public class School extends BaseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "name", nullable = false)
    private String name;

    @Column(name = "established", nullable = false)
    private String established;

    @Column(name = "about", nullable = false, columnDefinition = "TEXT")
    private String about;

    @Column(name = "code", unique = true)
    private Integer code;

    @Column(name = "theme", nullable = false)
    private String theme;

}
