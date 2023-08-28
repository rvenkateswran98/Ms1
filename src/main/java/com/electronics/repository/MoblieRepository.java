package com.electronics.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.electronics.entity.Mobile;

public interface MoblieRepository extends JpaRepository<Mobile, Integer> {

	@Query(value = "select * from mob_details where brand like ?", nativeQuery = true)
	List<Mobile> getBrand(String h);

	@Query(value="select * from mob_details where price>? and price<?;", nativeQuery = true)
	List<Mobile> getRange(int q, int w);

}
