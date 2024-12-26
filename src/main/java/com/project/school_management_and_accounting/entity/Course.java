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

@EqualsAndHashCode(callSuper = true)
@Entity
@Table(name = "course", indexes = {
        @Index(name = "course_secure_id", columnList = "uuid")
})
public class Course extends BaseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "course_name", nullable = false)
    private String courseName;

    @ManyToOne
    @JoinColumn(name = "class_id", nullable = false)
    private SchoolClass schoolClass;

    @Column(name = "course_type", nullable = false)
    private String courseType;

    @Column(name = "course_time", nullable = false)
    private String courseTime;

    @Column(name = "grade_system_name", nullable = false)
    private String gradeSystemName;

    @Column(name = "quiz_count", nullable = false)
    private Integer quizCount;

    @Column(name = "assignment_count")
    private Integer assignmentCount;

    @Column(name = "quiz_percent")
    private Integer quizPercent;

    @Column(name = "attendance_percent")
    private Integer attendancePercent;

    @Column(name = "assignment_percent")
    private Integer assignmentPercent;

    @Column(name = "ct_percent")
    private Integer ctPercent;

    @Column(name = "final_exam_percent")
    private Integer finalExamPercent;

    @Column(name = "practical_percent")
    private Integer practicalPercent;

    @Column(name = "att_fullmark")
    private Integer attFullmark;

    @Column(name = "quiz_fullmark")
    private Integer quizFullmark;

    @Column(name = "a_fullmark")
    private Integer aFullmark;

    @Column(name = "ct_fullmark")
    private Integer ctFullmark;

    @Column(name = "final_fullmark")
    private Integer finalFullmark;

    @ManyToOne
    @JoinColumn(name = "scholl_id", nullable = false)
    private School school;

    @ManyToOne
    @JoinColumn(name = "exam_id", nullable = false)
    private Exam exam;

    @ManyToOne
    @JoinColumn(name = "teacher_id", nullable = false)
    private User teacher;

    @ManyToOne
    @JoinColumn(name = "section_id", nullable = false)
    private Section section;

    @ManyToOne
    @JoinColumn(name = "user_id", nullable = false)
    private User user;

}
