package com.barclays.payment.Service;

import java.util.List;

import org.springframework.web.bind.annotation.RequestBody;

import com.barclays.payment.model.RegisterBillers;

public interface RegisterBillerService {
	public List<RegisterBillers> getAllRegisterBillersbyAccountNumber(Integer AccountNumber);
	public List<RegisterBillers> getall();
	public void  deleteRegisterBillers(Integer RegisterBillerSequenceId);
	public List<RegisterBillers> addBiller(@RequestBody final RegisterBillers value);
	//public void addU(RegisterBillers registerbiller);
	
}
