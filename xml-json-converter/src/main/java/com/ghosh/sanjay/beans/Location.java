package com.ghosh.sanjay.beans;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.Data;

@Data
@XmlAccessorType(XmlAccessType.FIELD)
@JsonIgnoreProperties(ignoreUnknown = true)
public class Location {
	
	@XmlElement(name = "current", namespace = "http://www.internet.org/", required = true)	
	boolean current;
	
	@XmlElement(name = "city", namespace = "http://www.internet.org/", required = true)
	String city;

}
