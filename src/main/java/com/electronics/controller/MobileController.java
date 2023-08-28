package com.electronics.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.electronics.entity.Mobile;
import com.electronics.service.MobileService;

@RestController
@RequestMapping("/mob")
public class MobileController {
	@Autowired
	MobileService ms;

	@PostMapping(value = "/setmob")

	public String setMob(@RequestBody Mobile a) {
		return ms.setMob(a);
	}

	@PostMapping(value = "/setAllMob")

	public String setAllMob(@RequestBody List<Mobile> mb) {
		return ms.setAllMob(mb);
	}

	@GetMapping(value = "getMob")
	public List<Mobile> getMob() {
		return ms.getMob();
	}

	@GetMapping(value = "getById/{a}")
	public Mobile getById(@PathVariable int a) {
		return ms.getById(a);
	}

	@GetMapping(value = "getbyBrand/{h}")
	public List<Mobile> getBrand(@PathVariable String h) {
		return ms.getBrand(h);
	}

	@GetMapping(value = "getRange/{q}/{w}")
	public List<Mobile> getRange(@PathVariable int q, @PathVariable int w) {
		return ms.getRange(q, w);
	}
	
	@GetMapping(value = "getBrandbycolor/{h}")
	public List<Mobile> getBrandbycolor(@PathVariable String h) {
		return ms.getBrand(h);
	}
	
	

}
