package com.ghosh.sanjay.beans;

import java.io.IOException;
import java.io.StringReader;
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


import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.context.junit.jupiter.SpringExtension;


import static com.ghosh.sanjay.beans.DataUtil.location;
import static com.ghosh.sanjay.beans.DataUtil.address;
import static com.ghosh.sanjay.beans.DataUtil.employee;
import static java.lang.invoke.MethodHandles.lookup;
import static org.slf4j.LoggerFactory.getLogger;
import static java.lang.String.*;
import static java.nio.file.Files.*;
import static java.nio.file.Paths.*;


@ExtendWith(SpringExtension.class)
@SpringBootTest
@ActiveProfiles("test")
public class FileUtilTest {

	private static Logger LOG = getLogger(lookup().lookupClass());

	private String employeeXml;

	private Employee employee;

	private Employee anotherEmployee;
	
	private Address address;
        
        private Location location;

	private JAXBContext employeeContext;

	@BeforeEach
	public void before() throws IOException, URISyntaxException {		
		employeeXml = join("", readAllLines(get(getClass().getClassLoader().getResource("xmls/employee.xml").toURI())));
		employee = employee(123, "Rajesh", 1000.0, 1000, LocalDate.of(2007,7, 2), LocalDateTime.of(2020, 10, 1, 9, 31, 32), address("ShivDham Apartments", "Western Express HighWay", "Mumbai", null, null, "Maharashtra", "India"),
                                Arrays.asList(new String[] {"abc@gmail.com", "abracadabra@gmail.com"}), Arrays.asList(new Location[] {location(true, "Delhi")}));
		anotherEmployee = employee(124, "Mahesh", 1000.0, 1000, LocalDate.of(2007,7, 2), LocalDateTime.of(2020, 10, 1, 9, 31, 32), address("ShivDham Apartments", "Western Express HighWay", "Mumbai", null, null, "Maharashtra", "India"),
                                Arrays.asList(new String[] {"abc@gmail.com", "abracadabra@gmail.com"}), Arrays.asList(new Location[] {location(true, "Delhi")}));
	}

	@Test
	public void testIfFileLoaded() throws javax.xml.bind.JAXBException {
		employeeContext = JAXBContext.newInstance(Employee.class);
		Unmarshaller jaxbUnmarshaller = employeeContext.createUnmarshaller();
                Employee employee2 = (Employee) jaxbUnmarshaller.unmarshal(new StringReader(employeeXml));
		Assertions.assertEquals(employee, employee2);
		Assertions.assertNotEquals(employee, new Object());
		Assertions.assertNotEquals(employee, anotherEmployee);
	}

	@AfterEach
	public void after() {

	}

}
