package com.barclays.payment.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.barclays.payment.Service.RegisterBillerService;
import com.barclays.payment.model.RegisterBillers;

@CrossOrigin(origins = "http://localhost:3000/")
@RestController
@RequestMapping("/registerbillers")
public class RegisterController {
	
	@Autowired
	private RegisterBillerService regbillservice;
	
	@GetMapping("/register-biller")
	public List<RegisterBillers> getall(){
		System.out.println("123");
		return regbillservice.getall();
	}
	
	@PostMapping(value = "/load")
	public List<RegisterBillers> addBiller(@RequestBody final RegisterBillers value) {	
		return regbillservice.addBiller(value);
	}
	
	@GetMapping("/register-biller/{account-number}")
	public List<RegisterBillers> getAllRegisterBillersbyAccountNumber(@PathVariable("account-number") Integer AccountNumber){
		return regbillservice.getAllRegisterBillersbyAccountNumber(AccountNumber);
	}
	
	@RequestMapping("/delete-register-biller/{RegisterBillerSequenceId}")
	public void  deleteRegisterBillers(@PathVariable("RegisterBillerSequenceId") Integer RegisterBillerSequenceId) {
		regbillservice.deleteRegisterBillers(RegisterBillerSequenceId);
	}
	
}