package com.example.demo.devops.java.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.devops.java.entity.User;

@Repository
public interface repo extends JpaRepository<User, Integer>{

}
