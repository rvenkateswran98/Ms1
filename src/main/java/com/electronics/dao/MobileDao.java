package com.electronics.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.electronics.entity.Mobile;
import com.electronics.repository.MoblieRepository;

@Repository
public class MobileDao {

	@Autowired
	MoblieRepository mr;

	public String setMob(Mobile a) {
		mr.save(a);
		return "Saved Succesfull";
	}

	public String setAllMob(List<Mobile> mb) {
		mr.saveAll(mb);
		return "Save Sucessfull";
	}

	public List<Mobile> getMob() {
	
		return mr.findAll();
	}

	public Mobile getById(int a) {
		
		return mr.findById(a).get();
	}

	public List<Mobile> getBrand(String h) {
	
		return mr.getBrand(h);
	}

	public List<Mobile> getRange(int q, int w) {
		// TODO Auto-generated method stub
		return mr.getRange(q,w);
	}

}
