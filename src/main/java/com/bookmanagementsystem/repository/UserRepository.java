package com.bookmanagementsystem.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bookmanagementsystem.model.User;

public interface UserRepository extends JpaRepository<User,Long> {
    User findByEmail(String email);

    User findByPhoneNumber(int phonenumber);

}
