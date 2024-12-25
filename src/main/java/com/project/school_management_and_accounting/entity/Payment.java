package com.project.school_management_and_accounting.entity;

import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Index;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = true)
@Entity
@Table(name = "payment",indexes = {
    @Index(name="payment_secure_id",columnList = "uuid")
})
public class Payment extends BaseEntity{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @OneToMany
    @JoinColumn(name = "payment_id")
    private List<Payment> payment;

    @Column(name = "payment_status")
    private String paymentStatus;

    @Column(name="amout")
    private Double amount;

    @OneToMany(mappedBy = "stripe")
    private List<User> users;

    @Column(name = "charge_for")
    private String chargeFor;

}
