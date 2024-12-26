package com.project.school_management_and_accounting.entity;

import java.util.List;

import com.project.school_management_and_accounting.enums.BloodGroup;
import com.project.school_management_and_accounting.enums.Gender;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Index;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.Lob;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import jakarta.validation.constraints.Email;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = true)
@Entity
@Table(name = "user_app", indexes = {
        @Index(name = "user_secure_id", columnList = "uuid"),
        @Index(name = "user_name_idx", columnList = "name")
})
public class User extends BaseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "name", nullable = false)
    private String name;

    @Column(name = "email", nullable = false, unique = true)
    @Email
    private String email;

    @Column(name = "password", nullable = false)
    private String password;

    @Column(name = "active", columnDefinition = "boolean default true", nullable = false)
    private Boolean active;

    @Column(name = "code", nullable = true)
    private Integer code;

    @ManyToOne
    @JoinColumn(name = "student_code")
    private User studentCode;

    @Column(name = "gender", nullable = false)
    @Enumerated(EnumType.STRING)
    private Gender gender;

    @Column(name = "blood_group", nullable = false)
    @Enumerated(EnumType.STRING)
    private BloodGroup bloodGroup;

    @Column(name = "nationality", nullable = false)
    private String nationality;

    @Column(name = "phone", unique = true)
    private String phone;

    @Column(name = "address")
    private String address;

    @Column(name = "about", columnDefinition = "TEXT")
    private String about;

    @Lob
    @Column(name = "profile_picture")
    private Byte[] profilePicture;

    @Column(name = "verified", columnDefinition = "boolean default false", nullable = false)
    private Boolean verified;

    @Column(name = "remember_token")
    private String rememberToken;

    @ManyToOne
    @JoinColumn(name = "school_id", nullable = false)
    private School school;

    @ManyToOne
    @JoinColumn(name = "section_id", nullable = false)
    private Section section;

    @ManyToOne
    @JoinColumn(name = "department_id", nullable = false)
    private Department department;

    @ManyToOne
    @JoinColumn(name = "stripe_id")
    private Payment stripe;

    @Column(name = "card_brand")
    private String cardBrand;

    @Column(name = "card_last_four")
    private String cardLastFour;

}
