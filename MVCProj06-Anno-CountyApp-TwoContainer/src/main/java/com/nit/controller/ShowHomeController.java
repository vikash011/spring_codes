package com.nit.controller;

import java.time.LocalDateTime;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.nit.service.ILocaleServiceMgmt;

@Controller("controller")
public class ShowHomeController {

	@Autowired
	private ILocaleServiceMgmt service;

	@RequestMapping("/welcome")
	public ModelAndView showHome() {

//		creating current Date and Time
		LocalDateTime ldt = LocalDateTime.now();
		return new ModelAndView("welcome", "sysdate", ldt);
	}

	@RequestMapping("/about")
	public String aboutUsPage() {
		return "about_us";
	}

	@RequestMapping("/contact")
	public String contactUsPage() {
		return "contact_us";
	}

	@RequestMapping("/countries_list")
	public ModelAndView getCountrieslist() {
		List<String> counytries_list = service.fetchCountries();

		return new ModelAndView("list_countries", "counytries_list", counytries_list);
	}

}
