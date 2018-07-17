package com.example.demo;

import com.example.demo.persistence.entities.Customer;
import com.example.demo.persistence.repositories.CustomerRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;
import java.util.Optional;

import static org.junit.Assert.assertEquals;

@RunWith(SpringRunner.class)
@SpringBootTest
public class DemoApplicationTests {

	@Autowired
	CustomerRepository customerRepository;

//	@Test
//	public void contextLoads() {
//	}

	@Test
	public void testSaveAndInsert(){

		// Create a new customer
		Customer joe = new Customer("Joe", "Greene", "joe@gmail.com","123");
		System.out.println("\n>> Create a new customer: " + joe);
		customerRepository.save(joe);

		// Get a single customer
		Optional<Customer> extractedJoe = customerRepository.findById(joe.getId());

		assertEquals(joe.getEmail(),extractedJoe.get().getEmail());

		// Update customer
		joe.setLastName("Montana");
		joe.setEmail("jmontana@gmail.com");
		customerRepository.save(joe);

		// Display updated customer
		Optional<Customer> updatedJoe = customerRepository.findById(joe.getId());
		System.out.println("\n>> Updated customer: " + updatedJoe.get());

//		// Delete customer
//		System.out.println("\n>> Delete customer: " + allCustomers.get(0));
//		customerRepository.delete(allCustomers.get(0));

		// Again get all customers
		List<Customer> allCustomers = customerRepository.findAll();
		System.out.println("\n>> All customers from database: ");
		for (Customer c : allCustomers) {
			System.out.println(c);
		}
	}

	public void testExcel(){

    }
}
