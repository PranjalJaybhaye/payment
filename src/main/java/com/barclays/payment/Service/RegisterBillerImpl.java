package com.barclays.payment.Service;

import java.util.List;
import java.util.ListIterator;
import java.util.Optional;

import javax.persistence.TypedQuery;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import com.barclays.payment.Login.RegisterBillersDao;
import com.barclays.payment.model.RegisterBillers;
import com.barclays.payment.model.Users;

@Service
public class RegisterBillerImpl implements RegisterBillerService{
	
	@Autowired
	private RegisterBillersDao regbilldao;
	
	@Override
	public List<RegisterBillers> getall(){
		try {
			return regbilldao.findAll();
		} catch (Exception e) {
			throw new RuntimeException("Something went wrong");
		}
		
	}
	
	@Override
	public List<RegisterBillers> getAllRegisterBillersbyAccountNumber(Integer AccountNumber){
		if (AccountNumber == null) {
            throw new RuntimeException("AccountNumber is null...");
        }
		
		try {
			List<RegisterBillers> listOfRegisterredBillers = regbilldao.findByAccountNumber(AccountNumber);
			if(listOfRegisterredBillers == null) {
				System.out.println("No registered Billers...");
			}
			return listOfRegisterredBillers;
        } catch (Exception e) {
            throw new RuntimeException("Not valid AccountNumber");
        }
		
		
	}
	
	@Override
	public void  deleteRegisterBillers(Integer RegisterBillerSequenceId) {
		try {
			regbilldao.deleteById(RegisterBillerSequenceId);
		} catch (Exception e) {
			throw new RuntimeException("Not valid register biller in db...");
		}
		
	}
	
	@Override
	public List<RegisterBillers> addBiller(@RequestBody final RegisterBillers value) {	
		regbilldao.save(value);
		return regbilldao.findAll();
	}
	
	
}
