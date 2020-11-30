package com.ghosh.sanjay.beans;

import java.io.IOException;
import java.io.StringWriter;
import java.net.URISyntaxException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;


import lombok.extern.slf4j.Slf4j;

import static com.ghosh.sanjay.beans.DataUtil.location;
import static com.ghosh.sanjay.beans.DataUtil.address;
import static com.ghosh.sanjay.beans.DataUtil.employee;

@Slf4j
public class MarshallerTest {
	
	private String originalEmployeeXml;
	private String employeeXml;
	private JAXBContext employeeContext;
	private ObjectMapper objectMapper;
	private Address address;
	private Employee employee;
	private Location location;
	
	@Before
	public void before() throws IOException, URISyntaxException, JAXBException {
		employeeXml = String.join("",
				Files.readAllLines(Paths.get(getClass().getClassLoader().getResource("xmls/employee.xml").toURI())));
		location = location(true, "Pune");
		address = address("", "", "", "", "", "", "");
		employee = employee(0, "", 0.0, 0, LocalDate.now(), LocalDateTime.now(), address, 
				Arrays.asList(new String[] {"sanjayxghosh@gmail.com"}), Arrays.asList(new Location[] {location}));
		employeeContext = JAXBContext.newInstance(Employee.class);
		objectMapper = new ObjectMapper();
	}	
	

	@Test
	public void test() throws JAXBException, JsonProcessingException {
		Marshaller jaxbMarshaller = employeeContext.createMarshaller();
		StringWriter writer = new StringWriter();
		jaxbMarshaller.marshal(employee, writer);
		String str = null;
		writer.write(str);
		log.info(str);
	}
	
	@After
	public void after() {
		employeeXml = null;
		originalEmployeeXml = null;
		employeeContext = null;
		objectMapper = null;
	}
}