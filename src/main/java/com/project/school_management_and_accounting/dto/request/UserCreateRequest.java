package com.project.school_management_and_accounting.dto.request;

import com.fasterxml.jackson.databind.PropertyNamingStrategies;
import com.fasterxml.jackson.databind.annotation.JsonNaming;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotEmpty;

@JsonNaming(PropertyNamingStrategies.SnakeCaseStrategy.class)
public record UserCreateRequest(
                @NotBlank @NotEmpty String name,
                @NotBlank @NotEmpty String email,
                @NotBlank @NotEmpty String password,
                @NotBlank @NotEmpty Boolean active,
                String studentCode,
                @NotBlank @NotEmpty String gender,
                @NotBlank @NotEmpty String bloodGroup,
                @NotBlank @NotEmpty String nationality,
                @NotBlank @NotEmpty String phone,
                @NotBlank @NotEmpty String address,
                String about,
                Byte[] profilePicture,
                @NotBlank @NotEmpty Boolean verified,
                @NotBlank @NotEmpty String rememberToken,
                String schoolId,
                String sectionId,
                String departmentId,
                String stripeId,
                String cardBrand,
                String cardLastFour) {
}
