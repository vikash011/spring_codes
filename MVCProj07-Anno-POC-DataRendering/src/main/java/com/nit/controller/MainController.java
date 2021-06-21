package com.nit.controller;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import com.nit.dto.StudentDTO;
import com.nit.service.ITestService;

@Controller("controller")
public class MainController {

	@Autowired
	private ITestService service;

	@GetMapping("/welcome")
	public String showData(Map<String, Object> map) {

//		use service class 
		String val1 = service.getData1();
		List<String> val2 = service.getData2();
		Set<Long> val3 = service.getData3();
		Map<String, Object> val4 = service.getData4();
		List<StudentDTO> val5 = service.getData5();
		int[] val6 = service.getData6();
		map.put("data1", val1);
		map.put("data2", val2);
		map.put("data3", val3);
		map.put("data4", val4);
		map.put("data5", val5);
		map.put("data6", Arrays.toString(val6));

		return "result1";

	}

}
