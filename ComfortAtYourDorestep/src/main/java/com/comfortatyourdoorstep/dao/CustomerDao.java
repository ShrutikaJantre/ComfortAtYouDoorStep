package com.comfortatyourdoorstep.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.comfortatyourdoorstep.entities.Admin;
import com.comfortatyourdoorstep.entities.CustomerSignup;

@Component
public class CustomerDao {
	
	@Autowired
	private CustomerRepository customerRepository;

	public List<CustomerSignup> getAllCustomers() {
		List<CustomerSignup> list=(List<CustomerSignup>)this.customerRepository.findAll();
		return list;
	}

}
