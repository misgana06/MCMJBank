package com.mcmj.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.mcmj.model.Account;
import com.mcmj.model.Customer;
import com.mcmj.service.AccountDAO;
import com.mcmj.service.ActualAccountDAO;


@RestController
public class PostController {
	
	@Autowired
	private AccountDAO ad;
	
	@Autowired
	private ActualAccountDAO aad;
	

	
	@RequestMapping("/hello")
	public String getAllProductDetails() {
		return "Hello";
	}
	
	@RequestMapping(value="/add",method=RequestMethod.POST)
	public void addProduct(@RequestBody Customer c) {
		ad.addCustomer(c);
	}
	
	@GetMapping("/{accNum}")
	public Account getAccount(@PathVariable int accNum) {
		return aad.findByAccount(accNum).get(0);
	}
	

}
