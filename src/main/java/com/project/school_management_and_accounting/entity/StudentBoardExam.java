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
@Table(name = "student_board_exam", indexes = {
        @Index(name = "student_board_exam_secure_id", columnList = "uuid")
})
public class StudentBoardExam extends BaseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "exam_name", nullable = false)
    private String examName;

    @Column(name = "groups")
    private String groups;

    @Column(name = "roll")
    private Integer roll;

    @Column(name = "registration")
    private Integer registration;

    @Column(name = "session")
    private String session;

    @Column(name = "board")
    private String board;

    @Column(name = "passing_year", nullable = false)
    private Integer passingYear;

    @Column(name = "institution_name", nullable = false)
    private String institutionName;

    @Column(name = "gpa", nullable = false)
    private Double gpa;

    @ManyToOne
    @JoinColumn(name = "user_id", nullable = false)
    private User user;

    @ManyToOne
    @JoinColumn(name = "student_id", nullable = false)
    private User student;

}