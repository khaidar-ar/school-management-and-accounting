package com.project.school_management_and_accounting.service.impl;

import java.io.IOException;

import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import com.project.school_management_and_accounting.dto.request.UserCreateRequest;
import com.project.school_management_and_accounting.dto.response.UserResponse;
import com.project.school_management_and_accounting.entity.User;
import com.project.school_management_and_accounting.enums.BloodGroup;
import com.project.school_management_and_accounting.enums.Gender;
import com.project.school_management_and_accounting.repository.UserRepository;
import com.project.school_management_and_accounting.service.UserService;

import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@AllArgsConstructor
@Slf4j
@Service
public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;

    private final ModelMapper modelMapper;

    @Override
    public UserResponse create(UserCreateRequest dto, MultipartFile file) throws IOException {
        log.info("start - create user | {}", this.getClass().toString());
        User user = new User();
        user.setName(dto.name());
        user.setEmail(dto.email());
        user.setPassword(dto.password());
        user.setActive(dto.active());
        user.setGender(Gender.getGender(dto.gender()));
        user.setBloodGroup(BloodGroup.getBG(dto.bloodGroup()));
        user.setNationality(dto.nationality());
        user.setPhone(dto.phone());
        user.setAddress(dto.address());
        user.setAbout(dto.about());
        user.setProfilePicture(file.getBytes());
        user.setVerified(dto.verified());
        // user.setSchool(dto.schoolId() == null ? null : dto.schoolId());
        // user.setSection(dto.sectionId()==null?null:dto.sectionId());
        // user.setDepartment(dto.departmentId()==null?null:dto.departmentId());
        // user.setStripe(dto.stripeId()==null?null:dto.stripeId());
        user.setCardBrand(dto.cardBrand());
        user.setCardLastFour(dto.cardLastFour());
        userRepository.save(user);
        UserResponse userResponse = UserResponse.builder().build();
        modelMapper.map(dto, userResponse);
        return userResponse;
    }

}
