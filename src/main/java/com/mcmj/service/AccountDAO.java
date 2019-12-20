package com.mcmj.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mcmj.model.Account;
import com.mcmj.model.Customer;
import com.mcmj.repository.Accountrepository;
import com.mcmj.repository.ActualAccountRepository;

@Service
public class AccountDAO {
	
@Autowired
private Accountrepository ar;


public void addCustomer(Customer c) {
	
}



}
