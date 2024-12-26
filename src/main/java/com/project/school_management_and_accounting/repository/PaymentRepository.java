package com.project.school_management_and_accounting.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.project.school_management_and_accounting.entity.Payment;

public interface PaymentRepository extends JpaRepository<PaymentRepository, Integer> {

    Optional<Payment> findByUuid(String uuid);

}
