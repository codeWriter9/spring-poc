package example.springdata.jpa.simple;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.Assert.assertNotNull;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.transaction.annotation.Transactional;

@RunWith(SpringRunner.class)
@Transactional
@SpringBootTest
public class CustomerRepositoryTest {
	
	@Autowired 
	private CustomerRepository repository;
	private Customer customer;
	
	@Before
	public void setUp() {
		customer = new Customer();
		customer.setFirstname("firstname");
		customer.setLastname("lastname");
	}
	
	@Test
	public void findSavedCustomerById() {
		assertNotNull(repository);
		assertNotNull(customer);
		customer = repository.save(customer);
		assertNotNull(customer);
		assertThat(repository.findById(customer.getId())).hasValue(customer);
	}
	
	
	
	@After
	public void destroy() {
		
	}

}
