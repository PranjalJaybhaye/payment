package com.barclays.payment.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.security.SecurityProperties.User;
import org.springframework.stereotype.Service;

import com.barclays.payment.Login.UsersDao;
import com.barclays.payment.model.Users;

@Service
public class UserServiceImpl implements UsersService{

	@Autowired
	private UsersDao dao;
	
	@Override
	public Users getUserById(String LoginId) {
		// TODO Auto-generated method stub
		Users users;
		try {
			users = dao.findById(LoginId).get();
		}catch(Exception e) {
			users = null;
		}
		return users;
	}

	@Override
	public void deleteUserById(String LoginId) {
		dao.deleteById(LoginId);
		
	}

	@Override
	public Users addUser(Users user) {
		// TODO Auto-generated method stub
		return dao.save(user);
	}

	@Override
	public List<Users> getAllUsers() {
		// TODO Auto-generated method stub
		return dao.findAll();
	}
	
	@Override
	public Users getUserById(String LoginId, String pwd) {
		Users users;
		try {
			users = dao.findById(LoginId).get();
			
		}catch(Exception e) {
			users = null;
		}
		if(users.getPwd().equals(pwd)) {
			int role = users.getRoleid();
			switch (role) {
			case 1:
				System.out.println("Bank Manager Role");
				break;
			case 2:
				System.out.println("Account Holder");
				
				break;
			case 3:
				System.out.println("Biller");
				break;
			default:
				System.out.println("Not a Valid Role");
				break;
			}
			return users;
		}
		
		return null;
	}

}
