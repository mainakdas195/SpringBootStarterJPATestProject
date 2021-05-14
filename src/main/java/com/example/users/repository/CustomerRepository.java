package com.example.users.repository;

import com.example.users.domain.Customer;

public interface CustomerRepository {

    

    int save(Customer customer);

	/*
	 * 
	 * int count();
	 * 
	 * int update(Book book);
	 * 
	 * int deleteById(Long id);
	 * 
	 * List<Book> findAll();
	 * 
	 * List<Book> findByNameAndPrice(String name, BigDecimal price);
	 * 
	 * Optional<Book> findById(Long id);
	 * 
	 * String getNameById(Long id);
	 */

}