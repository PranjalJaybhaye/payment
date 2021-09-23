package com.barclays.payment.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import com.barclays.payment.Service.LoginService;
import com.barclays.payment.model.Role;


@RestController
@RequestMapping("/role")
public class RoleController {
	
	@Autowired
	private LoginService service;
	
	@GetMapping("/role-id/{role-id}")
	public Role getRoleById(@PathVariable("role-id") Integer roleid) {
		return service.getRoleById(roleid);
	}

	
	@PostMapping
	public Role addRole(@RequestBody Role roleid) {
		return service.addRole(roleid);
	}

}
