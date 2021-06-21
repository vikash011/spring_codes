package com.nit.controller;

import java.time.LocalDateTime;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.nit.model.Employee;

@Controller("empController")
public class EmployeeController {

	@GetMapping("/welcome")
	public String showForm() {// form Launching
		System.out.println("EmployeeController.showForm()");
		return "register_employee";
	}

	@PostMapping("/welcome")
	public String showRegsiterForm(Map<String, Object> map, @ModelAttribute("emp") Employee empl) {// form Page
		System.out.println("EmployeeController.showRegsiterForm()");
		map.put("sysdate", LocalDateTime.now());
		return "result";
	}

}
