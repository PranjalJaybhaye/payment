package com.barclays.payment.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.barclays.payment.Login.AccountDao;
import com.barclays.payment.model.Account;

@Service
public class AccountServiceImpl implements AccountService{
	@Autowired
	private AccountDao accountdao;
	
	public List<Account> getAccountBySeqId(Integer SequenceId){
		return accountdao.findBySeqId(SequenceId);
	}
}
