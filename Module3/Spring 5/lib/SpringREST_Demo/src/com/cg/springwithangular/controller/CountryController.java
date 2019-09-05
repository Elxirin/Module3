package com.cg.springwithangular.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.cg.springwithangular.beans.Country;
import com.cg.springwithangular.service.ICountryService;

@RestController
public class CountryController {

	@Autowired
	ICountryService service;

	@RequestMapping(value="/countries/search/{id}",method=RequestMethod.GET,
			headers="Accept=application/json")
	public Country getCountry(@PathVariable int id)
	{
		return service.searchCountry(id);
	}
	
	@RequestMapping(value="/countries",method=RequestMethod.GET,
			headers="Accept=application/json")
	public List<Country> getAllCountries(Model model)
	{
		return service.getAllCountries();
	}
		
}
