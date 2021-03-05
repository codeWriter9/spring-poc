package com.ghosh.sanjay.beans;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;
import java.util.Objects;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.ghosh.sanjay.adapters.JsonLocalDateDeserializer;
import com.ghosh.sanjay.adapters.JsonLocalDateSerializer;
import com.ghosh.sanjay.adapters.JsonLocalDateTimeDeserializer;
import com.ghosh.sanjay.adapters.JsonLocalDateTimeSerializer;
import com.ghosh.sanjay.adapters.LocalDateTimeXmlAdapter;
import com.ghosh.sanjay.adapters.LocalDateXmlAdapter;

import lombok.Data;


@Data
@XmlRootElement(name = "employee", namespace = "http://www.internet.org/")
@XmlAccessorType(XmlAccessType.FIELD)
@JsonIgnoreProperties(ignoreUnknown = true)
public class Employee {

	@XmlElement(name = "id", namespace = "http://www.internet.org/", required = true)
	Integer id;

	@XmlElement(name = "name", namespace = "http://www.internet.org/", required = true)
	String name;

	@XmlElement(name = "salary", namespace = "http://www.internet.org/", required = true)
	Double salary;

	@XmlElement(name = "age", namespace = "http://www.internet.org/", required = true)
	Integer age;

	@XmlElement(name = "dateOfJoining", namespace = "http://www.internet.org/", required = true)
	@XmlJavaTypeAdapter(value = LocalDateXmlAdapter.class)
	@JsonSerialize(using = JsonLocalDateSerializer.class)
	@JsonDeserialize(using = JsonLocalDateDeserializer.class)
	LocalDate dateOfJoining;

	@XmlElement(name = "lastLogin", namespace = "http://www.internet.org/", required = true)
	@XmlJavaTypeAdapter(value = LocalDateTimeXmlAdapter.class)
	@JsonSerialize(using = JsonLocalDateTimeSerializer.class)
	@JsonDeserialize(using = JsonLocalDateTimeDeserializer.class)
	LocalDateTime lastLogin;

	@XmlElement(name = "address", namespace = "http://www.internet.org/", required = true)
	Address address;

	@XmlElementWrapper(name = "emailAddresses", namespace = "http://www.internet.org/", required = true)
	@XmlElement(name = "emailAddress", namespace = "http://www.internet.org/", required = true)	
	List<String> emailAddress;

	@XmlElementWrapper(name = "locations", namespace = "http://www.internet.org/", required = true)
	@XmlElement(name = "location", namespace = "http://www.internet.org/", required = true)
	List<Location> locations;

}
