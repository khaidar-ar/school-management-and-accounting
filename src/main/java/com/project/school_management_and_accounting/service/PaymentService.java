package com.project.school_management_and_accounting.service;

import java.util.Optional;

import com.project.school_management_and_accounting.entity.Payment;

public interface PaymentService {

    Optional<Payment> findById(String id);

}
