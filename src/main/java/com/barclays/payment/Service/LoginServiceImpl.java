package com.barclays.payment.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;



import com.barclays.payment.Login.RoleDao;
import com.barclays.payment.model.Role;

@Service
public class LoginServiceImpl implements LoginService{

	@Autowired
	private RoleDao dao;
	
	@Override
	public Role getRoleById(Integer RoleId) {
		// TODO Auto-generated method stub
		return dao.findById(RoleId).get();
	}

	@Override
	public void deleteRoleById(Integer RoleId) {
		
		dao.deleteById(RoleId);
		
	}

	@Override
	public Role addRole(Role role) {
		// TODO Auto-generated method stub
		return dao.save(role);
	}

	@Override
	public List<Role> getAllRoles() {
		// TODO Auto-generated method stub
		return dao.findAll();
	}

	
	

	

}
