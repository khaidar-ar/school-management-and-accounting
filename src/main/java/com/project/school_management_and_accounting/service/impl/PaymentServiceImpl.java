package com.project.school_management_and_accounting.service.impl;

import org.springframework.stereotype.Service;

import com.project.school_management_and_accounting.entity.Payment;
import com.project.school_management_and_accounting.exception.ResourceNotFound;
import com.project.school_management_and_accounting.repository.PaymentRepository;
import com.project.school_management_and_accounting.service.PaymentService;

import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@AllArgsConstructor
@Service
public class PaymentServiceImpl implements PaymentService {

    private final PaymentRepository paymentRepository;

    @Override
    public Payment findById(String id) {
        log.info("start - find payment | {}", this.getClass().toString());
        Payment payment = paymentRepository.findByUuid(id)
                .orElseThrow(() -> new ResourceNotFound("resource with id : " + id + " not found"));
        return payment;
    }

}
