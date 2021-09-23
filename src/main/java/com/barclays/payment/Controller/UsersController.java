package com.barclays.payment.Controller;


import java.util.Hashtable;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import com.barclays.payment.Service.UsersService;
import com.barclays.payment.model.Users;

@CrossOrigin(origins = "http://localhost:3000/")
@RestController
@RequestMapping("/users")
public class UsersController {

	@Autowired
	private UsersService service;
	
	@GetMapping("/login-id/{login-id}")
	public Users getUserById(@PathVariable("login-id") String LoginId) {
		return service.getUserById(LoginId);
		
	}
	
	@GetMapping("/login/{login-id},{pwd}")
	public Users getUserById(@PathVariable("login-id")String LoginId, @PathVariable("pwd")String pwd) {
		return service.getUserById(LoginId, pwd);
	}
	/*@PostMapping("/login")
	public Users getUserById(@RequestBody Users credentials) {
		System.out.println("***************");
		String LoginId = credentials.getLoginId();
		String pwd = credentials.getPword();
		System.out.println(credentials + "" + LoginId + "" + pwd);
		return service.getUserById(LoginId, pwd);
		
	}*/
	
	@PostMapping
	public Users addUser(@RequestBody Users user) {
		return service.addUser(user);
	}
}
