package com.ghosh.sanjay.beans;

import java.io.IOException;
import java.net.URISyntaxException;
import java.nio.file.Files;
import java.nio.file.Paths;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit4.SpringRunner;



import static java.lang.invoke.MethodHandles.lookup;
import static org.slf4j.LoggerFactory.getLogger;
import static java.lang.String.*;
import static java.nio.file.Files.*;
import static java.nio.file.Paths.*;


@RunWith(SpringRunner.class)
@SpringBootTest
@ActiveProfiles("test")
public class FileUtilTest {

	private static Logger LOG = getLogger(lookup().lookupClass());

	private String employeeXml;

	@Before
	public void before() throws IOException, URISyntaxException {		
		employeeXml = join("", readAllLines(get(getClass().getClassLoader().getResource("xmls/employee.xml").toURI())));
	}

	@Test
	public void testIfFileLoaded() {
		Assert.assertNotNull(employeeXml);
		LOG.info(employeeXml);
	}

	@After
	public void after() {

	}

}
