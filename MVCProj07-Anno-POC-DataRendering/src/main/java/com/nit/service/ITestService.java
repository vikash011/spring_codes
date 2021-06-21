package com.nit.service;

import java.util.List;
import java.util.Map;
import java.util.Set;

import com.nit.dto.StudentDTO;

public interface ITestService {

	public String getData1();

	public List<String> getData2();

	public Set<Long> getData3();

	public Map<String, Object> getData4();

	public List<StudentDTO> getData5();

	public int[] getData6();

}
