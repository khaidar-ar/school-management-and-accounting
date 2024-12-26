package com.project.school_management_and_accounting.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

public interface PaymentRepository extends JpaRepository<PaymentRepository, Integer> {

    Optional<PaymentRepository> findByUuid(String uuid);

}
