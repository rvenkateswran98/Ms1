package com.electronics.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.electronics.dao.MobileDao;
import com.electronics.entity.Mobile;

@Service
public class MobileService {

	@Autowired
	MobileDao md;

	public String setMob(Mobile a) {

		return md.setMob(a);
	}

	public String setAllMob(List<Mobile> mb) {

		return md.setAllMob(mb);
	}

	public List<Mobile> getMob() {
		// TODO Auto-generated method stub
		return md.getMob();
	}

	public Mobile getById(int a) {
	
		return md.getById(a);
	}

	public List<Mobile> getBrand(String h) {
		
		return md.getBrand(h);
	}

	public List<Mobile> getRange(int q, int w) {
		// TODO Auto-generated method stub
		return md.getRange(q,w);
	}

}
