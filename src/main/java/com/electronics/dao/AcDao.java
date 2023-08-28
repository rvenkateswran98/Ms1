package com.electronics.dao;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.electronics.entity.Ac;
import com.electronics.repository.AcRepository;

@Repository
public class AcDao {
	@Autowired
	AcRepository as;

	
	public String setAc(Ac ac) {
		as.save(ac);
		return "Saved SuccessFull";
		
		
	}


	public String setAllAc(List<Ac> ac) {
		as.saveAll(ac);
		return "Saved All Ac's";
	}


	public List<Ac> getAllAc() {
		
		return as.findAll();
	}


	

	public Ac getById(int x) {
		
		return as.findById(x).get();
	}
}
