package com.electronics.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.electronics.dao.AcDao;
import com.electronics.entity.Ac;
@Service
public class AcService {
	@Autowired
	
	AcDao da;

	public String setAc(Ac ag) {
		return da.setAc(ag);
	}
	
	public String setAllAc(List<Ac> ac) {
		return da.setAllAc(ac);
		
	}

	public List<Ac> getAllAc() {
		
		return da.getAllAc();
	}

	public Ac getById(int x) {
		
		return da.getById(x);
	}

}
