package example.springdata.jpa.simple;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface CustomerRepository extends CrudRepository<Customer, Long> {
	
	//public List<Customer> findByCustomer(Customer customer);

	public Customer findById(long id);

}
