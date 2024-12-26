package com.project.school_management_and_accounting.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.project.school_management_and_accounting.entity.User;

public interface UserRepository extends JpaRepository<User, Integer> {

}
