package com.project.school_management_and_accounting.dto.response;

import java.time.LocalDate;

import org.springframework.http.HttpStatus;

public record Response<T>(
                String url,
                LocalDate timestamp,
                HttpStatus status,
                T message

) {
}
