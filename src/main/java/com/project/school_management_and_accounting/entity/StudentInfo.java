package com.project.school_management_and_accounting.entity;

import java.time.LocalDate;

import com.project.school_management_and_accounting.enums.Religion;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
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
@Table(name = "student_info", indexes = {
        @Index(name = "student_secure_id", columnList = "uuid")
})
public class StudentInfo extends BaseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @ManyToOne
    @JoinColumn(name = "student_id", nullable = false)
    private User student;

    @Column(name = "session")
    private String session;

    @Column(name = "version")
    private String version;

    @Column(name = "groups")
    private String groups;

    @Column(name = "birthdate", nullable = false)
    private LocalDate birthdate;

    @Enumerated(EnumType.STRING)
    @Column(name = "religion", nullable = false)
    private Religion religion;

    @Column(name = "father_name", nullable = false)
    private String fatherName;

    @Column(name = "father_phone_number", nullable = false, unique = true)
    private String fatherPhoneNumber;

    @Column(name = "father_national_id")
    private String fatherNationalId;

    @Column(name = "father_occupation")
    private String fatherOccupation;

    @Column(name = "father_designation")
    private String fatherDesignation;

    @Column(name = "father_annual_income")
    private Integer fatherAnnualIncome;

    @Column(name = "mother_name", nullable = false)
    private String motherName;

    @Column(name = "mother_phone_number", nullable = false, unique = true)
    private String motherPhoneNumber;

    @Column(name = "mother_national_id")
    private String motherNationalId;

    @Column(name = "mother_occupation")
    private String motherOccupation;

    @Column(name = "mother_designation")
    private String motherDesignation;

    @Column(name = "mother_annual_income")
    private String motherAnnualIncome;

    @ManyToOne
    @JoinColumn(name = "user_id", nullable = false)
    private User userApp;

}
