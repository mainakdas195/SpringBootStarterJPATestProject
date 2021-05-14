package com.example.users;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.jdbc.core.JdbcTemplate;

import com.example.users.domain.Customer;
import com.example.users.repository.CustomerRepository;
import com.example.users.repository.JdbcCustomerRepository;

@SpringBootApplication
public class SpringBootStarterJpaTestApplication implements CommandLineRunner{

	@Autowired
    JdbcTemplate jdbcTemplate;

    @Autowired
    private JdbcCustomerRepository customerRepository;
    
	public static void main(String[] args) {
		SpringApplication.run(SpringBootStarterJpaTestApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		Customer c = new Customer();
		
		//db call to get next sequence.
		//https://stackoverflow.com/questions/55006231/query-to-get-nextval-from-sequence-with-spring-jpa
		c.setCustomer_id(new Long(1));
		c.setCustomer_name("Mainak");
		
		customerRepository.save(c);
	}

}
