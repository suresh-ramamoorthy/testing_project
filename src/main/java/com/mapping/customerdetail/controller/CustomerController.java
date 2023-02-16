package com.mapping.customerdetail.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mapping.customerdetail.entity.CustomerEntity;
import com.mapping.customerdetail.service.CustomerService;

@RestController
@RequestMapping("/customerdetail")
public class CustomerController {
	
	@Autowired  private CustomerService customerService;
	
	
@PostMapping( "/createdata")
public CustomerEntity createUser (@RequestBody CustomerEntity customerEntity) {
	
	
	return customerService.saveUser(customerEntity);
	
}

@PutMapping("/update")
public CustomerEntity updateUser (@RequestBody CustomerEntity customerEntity ) {
	
	return customerService.updateUser(customerEntity);
}


}
