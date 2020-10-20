package com.ghosh.sanjay.beans;

import java.io.IOException;
import java.io.StringReader;
import java.net.URISyntaxException;
import java.nio.file.Files;
import java.nio.file.Paths;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class UnmarshallerTest {

	private String employeeXml;
	private JAXBContext employeeContext;
	private ObjectMapper objectMapper;

	@Before
	public void before() throws IOException, URISyntaxException, JAXBException {
		employeeXml = String.join("",
				Files.readAllLines(Paths.get(getClass().getClassLoader().getResource("xmls/employee.xml").toURI())));
		employeeContext = JAXBContext.newInstance(Employee.class);
		objectMapper = new ObjectMapper();
	}

	@Test
	public void test() throws JAXBException, JsonProcessingException {
		Unmarshaller jaxbUnmarshaller = employeeContext.createUnmarshaller();
		Employee employee = (Employee) jaxbUnmarshaller.unmarshal(new StringReader(employeeXml));
		log.info(employee.toString());
		String json = objectMapper.writeValueAsString(employee);
		log.info(json);
	}

	@After
	public void after() {
		employeeXml = null;
		employeeContext = null;
		objectMapper = null;
	}

}
