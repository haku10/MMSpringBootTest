package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.demo.model.LoginUser;
import com.example.demo.repository.LoginUserRepository;

@Service
@Transactional
public class LoginUserService {

	@Autowired
	LoginUserRepository loginuserRepository;

	/**
	 * 全選択
	 *
	 */
	public List<LoginUser> findAllinfectionData(){

		return loginuserRepository.findAll();
	}

	public LoginUser findNameLoginUser(@RequestParam("name")String name){
		return loginuserRepository
				.findByName(name)
				.get(0);
	}

}
