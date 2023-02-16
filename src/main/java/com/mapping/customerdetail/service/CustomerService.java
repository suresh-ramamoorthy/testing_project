package com.mapping.customerdetail.service;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;



import lombok.AllArgsConstructor;

import org.springframework.stereotype.Service;

import com.mapping.customerdetail.entity.CustomerEntity;
import com.mapping.customerdetail.repository.CustomerRepository;


@Service
@Transactional
public class CustomerService {
	
	@Autowired 
	private CustomerRepository customerRepository;

	public CustomerEntity saveUser(CustomerEntity customerEntity) {
		
		return customerRepository.save(customerEntity);
	
		
	}

	public CustomerEntity updateUser(CustomerEntity customerEntity) {
		
		return customerRepository.save(customerEntity);
	}

}
