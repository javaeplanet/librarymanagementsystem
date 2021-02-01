package com.javaeplanet.library.repos;

import org.springframework.data.repository.CrudRepository;

import com.javaeplanet.library.entity.Account;

public interface AccountRepository extends CrudRepository<Account, Integer> {

}
