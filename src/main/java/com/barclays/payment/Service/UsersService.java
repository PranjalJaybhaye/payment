package com.barclays.payment.Service;

import java.util.List;


import com.barclays.payment.model.Users;

public interface UsersService {

	public Users getUserById(String LoginId);
	
	public void  deleteUserById(String LoginId);
	
	public Users addUser(Users user);
	public List<Users> getAllUsers();
	public Users getUserById(String LoginId, String pwd);
	
}
