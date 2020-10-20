package com.ghosh.sanjay.beans;

import java.io.IOException;
import java.net.URISyntaxException;
import java.nio.file.Files;
import java.nio.file.Paths;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class FileUtilTest {

	private String employeeXml;

	@Before
	public void before() throws IOException, URISyntaxException {
		employeeXml = String.join("", Files.readAllLines(Paths.get(getClass().getClassLoader().getResource("xmls/employee.xml").toURI())));
	}

	@Test
	public void testIfFileLoaded() {
		Assert.assertNotNull(employeeXml);
		log.info(employeeXml);
	}

	@After
	public void after() {

	}

}
