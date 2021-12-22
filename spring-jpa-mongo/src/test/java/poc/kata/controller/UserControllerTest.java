package poc.kata.controller;

import static java.lang.invoke.MethodHandles.lookup;
import static org.slf4j.LoggerFactory.getLogger;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.slf4j.LoggerFactory.getLogger;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.junit.jupiter.SpringJUnitConfig;

import org.slf4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.junit.jupiter.SpringJUnitConfig;


import poc.kata.App;
import poc.kata.config.AppConfig;
import poc.kata.domain.User;
import poc.kata.repository.UserRepository;

@SpringJUnitConfig(classes = {User.class, App.class, AppConfig.class, UserController.class, UserRepository.class})
public class UserControllerTest {

	private static Logger LOG = getLogger(lookup().lookupClass());

	@Autowired
	private UserController userController;

	@BeforeEach
	public void setUp() {
		LOG.info(" UserController = " + userController);
	}

	@Test
	public void testUserController() {
		assertNotNull(userController);
	}

	@AfterEach
	public void destroy() {
		userController = null;
	}


}

