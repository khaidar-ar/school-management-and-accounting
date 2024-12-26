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
@Table(name = "grade", indexes = {
        @Index(name = "grade_secure_id", columnList = "uuid")
})
public class Grade extends BaseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "marks", nullable = false)
    private Double marks;

    @Column(name = "gpa", nullable = false)
    private Double gpa;

    @Column(name = "attendance", nullable = false)
    private Double attendance;

    @Column(name = "quiz1")
    private Double quiz1;

    @Column(name = "quiz2")
    private Double quiz2;

    @Column(name = "quiz3")
    private Double quiz3;

    @Column(name = "quiz4")
    private Double quiz4;

    @Column(name = "quiz5")
    private Double quiz5;

    @Column(name = "ct1")
    private Double ct1;

    @Column(name = "ct2")
    private Double ct2;

    @Column(name = "ct3")
    private Double ct3;

    @Column(name = "ct4")
    private Double ct4;

    @Column(name = "ct5")
    private Double ct5;

    @Column(name = "assignment1")
    private Double assignment1;

    @Column(name = "assignemnt2")
    private Double assignemnt2;

    @Column(name = "assignment3")
    private Double assignment3;

    @Column(name = "written")
    private Double written;

    @Column(name = "mcq")
    private Double mcq;

    @Column(name = "practical")
    private Double practical;

    @ManyToOne
    @JoinColumn(name = "exam_id", nullable = false)
    private Exam exam;

    @ManyToOne
    @JoinColumn(name = "student_id", nullable = false)
    private User student;

    @ManyToOne
    @JoinColumn(name = "teacher_id", nullable = false)
    private User teacher;

    @ManyToOne
    @JoinColumn(name = "course_id", nullable = false)
    private Course course;

    @ManyToOne
    @JoinColumn(name = "user_id", nullable = false)
    private User user;

}
