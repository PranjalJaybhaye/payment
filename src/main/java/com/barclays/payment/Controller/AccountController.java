package com.barclays.payment.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.barclays.payment.Service.AccountService;
import com.barclays.payment.model.Account;

@CrossOrigin(origins = "http://localhost:3000/")
@RestController
@RequestMapping("/account")
public class AccountController {
	
	@Autowired
	private AccountService accservice;
	
	@GetMapping("/{sequenceId}")
	public List<Account> getAccountBySeqId(@PathVariable("sequenceId") Integer SequenceId){
		return accservice.getAccountBySeqId(SequenceId);
	}
}
