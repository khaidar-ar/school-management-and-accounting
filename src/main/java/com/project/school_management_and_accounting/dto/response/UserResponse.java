package com.project.school_management_and_accounting.dto.response;

import com.fasterxml.jackson.databind.PropertyNamingStrategies;
import com.fasterxml.jackson.databind.annotation.JsonNaming;

@JsonNaming(PropertyNamingStrategies.SnakeCaseStrategy.class)
public record UserResponse(
                String name,
                String email,
                Boolean active,
                String studentCode,
                String gender,
                String bloodGroup,
                String nationality,
                String phone,
                String address,
                String about,
                Byte[] profilePicture,
                Boolean verified,
                String rememberToken,
                String schoolId,
                String sectionId,
                String departmentId,
                String stripeId,
                String cardBrand,
                String cardLastFour) {
}
