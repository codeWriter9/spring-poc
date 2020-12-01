package poc.spring;

import static java.lang.invoke.MethodHandles.lookup;
import static org.slf4j.LoggerFactory.getLogger;
import static org.hamcrest.Matchers.containsString;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

import poc.spring.config.AppConfig;

@RunWith(SpringRunner.class)
@WebMvcTest
@ContextConfiguration(classes = { AppConfig.class, App.class })
public class TestMVC {
	
	private static Logger LOG = getLogger(lookup().lookupClass());
	
	@Autowired
	private MockMvc mvc;	

	
	@Test
	public void checkGet() throws Exception {
		this.mvc.perform(get("/helloWorld")).andDo(print()).andExpect(status().isOk())
		.andExpect(content().string(containsString("helloWorld!")));
	}
}