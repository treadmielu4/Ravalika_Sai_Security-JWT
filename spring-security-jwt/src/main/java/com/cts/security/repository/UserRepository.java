package com.cts.security.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.cts.security.model.DaoUser;

@Repository
public interface UserRepository extends CrudRepository<DaoUser, Integer> {

	DaoUser findByUsername(String username);

}