package com.ghosh.sanjay.beans;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;

public class DataUtil {
	
	public static Location location(boolean current, String city) {
		Location location = new Location();
		location.setCurrent(current);
		location.setCity(city);
		return location;
	}
	
	public static Address address(String houseOrFlatName, String streetName, String city,
			String postOffice, String pin, String state, String country) {
		Address address =new Address();
		address.setHouseOrFlatName(houseOrFlatName);
		address.setStreetName(streetName);
		address.setCity(city);
		address.setPostOffice(postOffice);
		address.setPin(pin);
		address.setState(state);
		address.setCountry(country);
		return address;
	}
	
	public static Employee employee(Integer id, String name, Double salary, 
			Integer age, LocalDate dateOfJoining, LocalDateTime lastLogin,
			Address address, List<String> emailAddress, List<Location> locations) {
		Employee employee = new Employee();
		employee.setId(id);
		employee.setName(name);
		employee.setSalary(salary);
		employee.setAge(age);
		employee.setDateOfJoining(dateOfJoining);
		employee.setLastLogin(lastLogin);
		employee.setAddress(address);
		employee.setEmailAddress(emailAddress);
		employee.setLocations(locations);
		return employee;
	}
}
