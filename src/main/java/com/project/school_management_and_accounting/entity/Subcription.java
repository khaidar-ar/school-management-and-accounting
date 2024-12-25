package com.project.school_management_and_accounting.entity;

import java.time.LocalDate;

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
@Table(name = "subcription", indexes = {
        @Index(name = "subcription_secure_id", columnList = "uuid")
})
public class Subcription extends BaseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @ManyToOne
    @JoinColumn(name = "user_id", nullable = false)
    private User user;

    @Column(name = "name", nullable = false)
    private String name;

    @ManyToOne
    @JoinColumn(name = "stripe_id", nullable = false)
    private Payment payment;

    @Column(name = "stripe_plan")
    private String stripePlan;

    @Column(name = "quantity", nullable = false)
    private Integer quantity;

    @Column(name = "trial_ends_at")
    private LocalDate trialEnd;

    @Column(name = "ends_at")
    private LocalDate ends;

}
