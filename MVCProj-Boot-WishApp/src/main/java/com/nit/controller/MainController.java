package com.nit.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.nit.service.IWishMessageService;

@Controller
public class MainController {

	@Autowired
	private IWishMessageService service;

	@RequestMapping("/welcome")
	public String showHome() {
//		return logical view name
		return "home";
	}

	@RequestMapping("/wish")
	public String generateMessage(Map<String, Object> map) {

//		use service
		String msg = service.wishMessageGenerator();

//		putting data in ModelAttribute
		map.put("wmsg", msg);

//		return lvn
		return "result";
	}

}
