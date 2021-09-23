package com.barclays.payment.Login;

import org.springframework.data.jpa.repository.JpaRepository;

import com.barclays.payment.model.Role;


public interface RoleDao extends JpaRepository<Role, Integer>{

	
}
