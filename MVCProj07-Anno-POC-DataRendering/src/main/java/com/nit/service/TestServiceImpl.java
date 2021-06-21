package com.nit.service;

import java.util.List;
import java.util.Map;
import java.util.Set;

import org.springframework.stereotype.Service;

import com.nit.dto.StudentDTO;


@Service("testService")
public class TestServiceImpl implements ITestService {

	@Override
	public String getData1() {

		return "Raja";
	}

	@Override
	public List<String> getData2() {

		return List.of("Vikash", "Kumar", "Gupta", "Lucknow");
	}

	@Override
	public Set<Long> getData3() {

		return Set.of(9999999999l, 888888888l, 777777777l);
	}

	@Override
	public Map<String, Object> getData4() {

		return Map.of("Shirt", "PeterEngland", "Shoes", "Addidas", "Watch", "Fastrack");
	}

	@Override
	public List<StudentDTO> getData5() {

		return List.of(new StudentDTO(1001, "Raja", 77.7, "A"), new StudentDTO(1002, "Rani", 88.5, "B"));
	}

	@Override
	public int[] getData6() {

		return new int[] { 11, 22, 33, 44, 55 };
	}

}
