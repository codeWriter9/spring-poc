package com.ghosh.sanjay.beans;

import java.util.Objects;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.Getter;
import lombok.Setter;


@XmlAccessorType(XmlAccessType.FIELD)
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown=true)
public class Address {
	
	@XmlElement(name = "houseOrFlatName", namespace = "http://www.internet.org/", required = true)
	String houseOrFlatName;
	
	@XmlElement(name = "streetName", namespace = "http://www.internet.org/", required = true)
	String streetName;
	
	@XmlElement(name = "city", namespace = "http://www.internet.org/", required = true)
	String city;
	
	@XmlElement(name = "postOffice", namespace = "http://www.internet.org/")
	String postOffice;
	
	@XmlElement(name = "pin", namespace = "http://www.internet.org/")
	String pin;
	
	@XmlElement(name = "state", namespace = "http://www.internet.org/", required = true)
	String state;
	
	@XmlElement(name = "country", namespace = "http://www.internet.org/", required = true)
	String country;
	
	@Override
	public String toString() {
		return new StringBuffer("Address=(")
				.append(Objects.toString(houseOrFlatName)).append(Objects.toString(", "))
				.append(Objects.toString(streetName)).append(Objects.toString(", "))
				.append(Objects.toString(city)).append(Objects.toString(", "))
				.append(Objects.toString(postOffice)).append(Objects.toString(", "))
				.append(Objects.toString(pin)).append(Objects.toString(", "))
				.append(Objects.toString(state)).append(Objects.toString(", "))
				.append(Objects.toString(country)).append(Objects.toString(")"))	
				.toString();
	}
	

}
