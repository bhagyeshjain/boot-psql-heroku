package com.bhagyesh.bootpsqlheroku.service;

import java.util.List;

import com.bhagyesh.bootpsqlheroku.model.ApplicationUser;

public interface UserService {

	void saveUser(ApplicationUser user);

	List<ApplicationUser> getUserList();
}
