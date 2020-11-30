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

import static java.lang.String.*;
import static java.nio.file.Files.*;
import static java.nio.file.Paths.*;


@Slf4j
public class FileUtilTest {

	private String employeeXml;

	@Before
	public void before() throws IOException, URISyntaxException {		
		employeeXml = join("", readAllLines(get(getClass().getClassLoader().getResource("xmls/employee.xml").toURI())));
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
