package com.example.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.model.LoginUser;

@Repository
public interface LoginUserRepository extends JpaRepository<LoginUser, Integer>{

	List<LoginUser> findByName(String name) ;
}

