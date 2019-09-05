package com.cg.springwithangular.dao;

import java.util.*;
import org.springframework.stereotype.Repository;

import com.cg.springwithangular.beans.Country;
import com.cg.springwithangular.staticdb.CountryDB;

@Repository
public class CountryDAOImpl implements ICountryDAO {

	@Override
	public List<Country> getAllCountries() {
		
		return CountryDB.getCountryList();
	}

	@Override
	public void addCountry(Country country) {
		CountryDB.getCountryList().add(country);
		

	}

	@Override
	public Country deleteCountry(int id) {
		return CountryDB.getCountryList().remove(id);
	}

	@Override
	public Country searchCountry(int id) {
		return CountryDB.getCountryList().stream().filter(c->Integer.parseInt(c.getCountryId())==id).findFirst().get();
	}

}
