package poc.spring.controller;

import static org.assertj.core.api.Assertions.assertThat;
import static org.springframework.boot.test.context.SpringBootTest.WebEnvironment.RANDOM_PORT;

import java.util.HashMap;
import java.util.Map;
import org.junit.jupiter.api.Test;
//import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.boot.web.server.LocalServerPort;
import org.springframework.test.context.junit4.SpringRunner;

import poc.spring.controller.HelloWorldController;
import poc.spring.service.HelloWorldService;

@SpringBootTest(webEnvironment = RANDOM_PORT)
//@RunWith(SpringRunner.class)
public class SmokeTest {
	
	@Autowired
	private HelloWorldController controller;

	@Autowired
	private HelloWorldService service;
	
	@LocalServerPort
	private int port;

	@Autowired
	private TestRestTemplate restTemplate;

	
	@Test
	public void contextLoads() throws Exception {
		assertThat(controller).isNotNull();
		assertThat(service).isNotNull();
		assertThat(port).isNotNull();
		assertThat(restTemplate).isNotNull();
		assertThat(this.restTemplate.getForObject("http://localhost:" + port + "/helloWorld",
				String.class)).contains("helloWorld!");
		assertThat(this.restTemplate.postForObject("http://localhost:" + port + "/hello", (Object)"Coder", 
				String.class, (Map)new HashMap<>())).contains("Hello Coder");
	}

}
