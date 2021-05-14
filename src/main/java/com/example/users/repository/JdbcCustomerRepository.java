package com.example.users.repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.example.users.domain.Customer;

@Repository
@PropertySource("classpath:/sql/CustomerQueries.properties")
public class JdbcCustomerRepository implements CustomerRepository {

	@Value("${addCustomer}")
	private String queryForAddCustomer;

	@Autowired
	private JdbcTemplate jdbcTemplate;

	@Override
	public int save(Customer customer) {

		return jdbcTemplate.update(queryForAddCustomer, customer.getCustomer_id(), customer.getCustomer_name());

	}

}