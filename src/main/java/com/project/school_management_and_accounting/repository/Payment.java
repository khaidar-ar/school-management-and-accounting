package com.project.school_management_and_accounting.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

public interface Payment extends JpaRepository<Payment, Integer> {

    Optional<Payment> findByUuid(String uuid);

}
