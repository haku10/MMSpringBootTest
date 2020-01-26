package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.demo.model.Infection;
import com.example.demo.repository.InfectionRepository;

@Service
@Transactional
public class InfectionService {

	@Autowired
	InfectionRepository infectionRepository;

	/**
	 * 全選択
	 *
	 */
	  public List<Infection> findAllinfectionData(){

		    return infectionRepository.findAll();
		  }

}
