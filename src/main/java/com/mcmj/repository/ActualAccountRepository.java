package com.mcmj.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.mcmj.model.Account;

@Repository
public interface ActualAccountRepository extends CrudRepository<Account, Integer> {

	
}
