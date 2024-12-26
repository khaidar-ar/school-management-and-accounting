package com.project.school_management_and_accounting.service;

import java.io.IOException;

import org.springframework.web.multipart.MultipartFile;

import com.project.school_management_and_accounting.dto.request.UserCreateRequest;
import com.project.school_management_and_accounting.dto.response.Response;
import com.project.school_management_and_accounting.dto.response.UserResponse;

public interface UserService {

    Response<UserResponse> create(UserCreateRequest dto, MultipartFile file) throws IOException;

}
