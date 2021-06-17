package com.nit.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

import com.nit.service.ILocaleServiceMgmt;

public class CountryController implements Controller {

	private ILocaleServiceMgmt service;

	public CountryController(ILocaleServiceMgmt service) {
		this.service = service;
	}

	@Override
	public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response) throws Exception {

		// invoking service class method
		List<String> countries_list = service.fetchCountries();
		return new ModelAndView("result", "counytries_list", countries_list);
	}

}
