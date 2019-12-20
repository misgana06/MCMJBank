package com.mcmj.service;


import java.util.List;
import java.util.Optional;

import javax.persistence.EntityManager;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.data.jpa.repository.Query;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Service;

import com.mcmj.model.Account;
import com.mcmj.repository.ActualAccountRepository;

@Service
public class ActualAccountDAO {

	@Autowired
	private EntityManager em;
	
	private Session getSession() {
		return em.unwrap(Session.class);
	}
	
	public List<Account> findByAccount(int accNum) {
		return getSession().createQuery("from Account where account_number = "+accNum,Account.class).list();
	}
}
