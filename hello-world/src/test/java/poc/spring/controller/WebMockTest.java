package poc.spring.controller;

import static org.assertj.core.api.Assertions.assertThat;
import static org.hamcrest.Matchers.containsString;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

import poc.spring.App;
import poc.spring.config.AppConfig;
import poc.spring.controller.HelloWorldController;

@RunWith(SpringRunner.class)
@WebMvcTest(HelloWorldController.class)
@ContextConfiguration(classes = { AppConfig.class, App.class })
public class WebMockTest {
	
	@Autowired
	private MockMvc mockMvc;

	@Autowired
	private HelloWorldController controller;
	
	@Test
	public void checkNotNull() throws Exception {
		assertThat(controller).isNotNull();		
		assertThat(mockMvc).isNotNull();		
	}
	

	@Test
	public void checkHelloWorldGetMethod() throws Exception {		
		this.mockMvc.perform(get("/helloWorld")).andDo(print()).andExpect(status().isOk())
				.andExpect(content().string(containsString("helloWorld!")));
	}

	@Test
	public void checkHelloPostMethod() throws Exception {
		this.mockMvc.perform(post("/hello").content("Coder")).andDo(print()).andExpect(status().isOk())
			.andExpect(content().string(containsString("Hello Coder")));
	}
}
