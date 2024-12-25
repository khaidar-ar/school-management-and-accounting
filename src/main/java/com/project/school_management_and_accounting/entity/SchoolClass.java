package com.project.school_management_and_accounting.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Index;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = true)
@Entity
@Table(name = "school_class", indexes = {
        @Index(name = "class_secure_id", columnList = "uuid")
})
public class SchoolClass extends BaseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "class_number", nullable = false)
    private String classNumber;

    @Column(name = "\"group\"")
    private String group;

    @ManyToOne
    @JoinColumn(name = "school_id", nullable = false)
    private School school;

}
