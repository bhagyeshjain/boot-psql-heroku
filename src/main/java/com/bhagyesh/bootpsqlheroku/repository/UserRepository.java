package com.bhagyesh.bootpsqlheroku.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.bhagyesh.bootpsqlheroku.model.ApplicationUser;

@Repository
public interface UserRepository extends CrudRepository<ApplicationUser, Long> {

	List<ApplicationUser> findAllByOrderByFullName();
}
