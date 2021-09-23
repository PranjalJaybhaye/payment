package com.barclays.payment.Service;

import java.util.List;

import com.barclays.payment.model.Role;

public interface LoginService {

	public Role getRoleById(Integer RoleId);
	
	public void  deleteRoleById(Integer RoleId);
	
	public Role addRole(Role role);
	public List<Role> getAllRoles();


}
