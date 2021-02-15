package com.enigma.test7maret.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.enigma.test7maret.entity.Account;

@Repository
public interface AccountRepository extends JpaRepository<Account, Long> {

	public Account findByAccount(String accountNumber);
	public Account findByNameIgnoreCase(String name);
	public List<Account> findByNameContainsIgnoreCase(String name);
}
