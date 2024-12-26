package com.project.school_management_and_accounting.dto.response;

import java.time.LocalDate;

import org.springframework.http.HttpStatus;

import com.fasterxml.jackson.databind.PropertyNamingStrategies;
import com.fasterxml.jackson.databind.annotation.JsonNaming;

import lombok.Builder;

@Builder
@JsonNaming(PropertyNamingStrategies.SnakeCaseStrategy.class)
public record Response<T>(
        String url,
        LocalDate timestamp,
        HttpStatus status,
        T message

) {
}
