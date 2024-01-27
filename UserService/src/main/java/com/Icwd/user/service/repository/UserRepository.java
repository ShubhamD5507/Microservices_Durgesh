package com.Icwd.user.service.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Icwd.user.service.entity.User;

public interface UserRepository extends JpaRepository<User, String>{

}
