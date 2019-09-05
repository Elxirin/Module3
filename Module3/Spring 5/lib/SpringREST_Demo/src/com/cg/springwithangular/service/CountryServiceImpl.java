package com.cg.springwithangular.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.springwithangular.beans.Country;
import com.cg.springwithangular.dao.ICountryDAO;

@Service
public class CountryServiceImpl implements ICountryService {

	@Autowired
	ICountryDAO countryDAO;
	
	@Override
	public List<Country> getAllCountries() {
		
		return countryDAO.getAllCountries();
	}

	@Override
	public void addCountry(Country country) {
		countryDAO.addCountry(country);

	}

	@Override
	public Country deleteCountry(int id) {
		return countryDAO.deleteCountry(id);
	}

	@Override
	public Country searchCountry(int id) {
		return countryDAO.searchCountry(id);
	}

}
