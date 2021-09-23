package com.barclays.payment.Service;

import org.springframework.http.HttpHeaders;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.barclays.payment.Login.BillsDao;
import com.barclays.payment.Login.RegisterBillersDao;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import com.barclays.payment.model.Bills;
import com.barclays.payment.model.RegisterBillers;

@Service
public class BillService {
	
	@Autowired
	private BillsDao dao;
	
	@Autowired
	private RegisterBillersDao billerDao;;
	

	public ResponseEntity<Bills> addBill(Bills bill) {
		Bills addedBill;
		try {			
				addedBill = dao.save(bill);
				return ResponseEntity.ok(addedBill);
		}
		catch(Exception e) {
			addedBill = null;
			HttpHeaders responseHeaders = new HttpHeaders();
			responseHeaders.set("error", e.getLocalizedMessage());
			return new ResponseEntity <> (responseHeaders, HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
	
	
	public ResponseEntity<List<Bills>> getAllBills() {
		List<Bills> bills;
		try {
			bills = dao.findAll();
			return ResponseEntity.ok(bills);
			
		}
		catch(Exception e) {
			bills = null;
			HttpHeaders responseHeaders = new HttpHeaders();
			responseHeaders.set("error", e.getLocalizedMessage());
			return new ResponseEntity <> (responseHeaders, HttpStatus.NOT_FOUND);
		}
	}
	
	public ResponseEntity<Void> removeBill(int id) {
		try {
			if(dao.existsById(id)) {
				dao.deleteById(id);
				return ResponseEntity.ok().build();
			}
			else {
				HttpHeaders responseHeaders = new HttpHeaders();
				responseHeaders.set("error", "No bill present with given Id.");
				return new ResponseEntity <> (responseHeaders, HttpStatus.NOT_FOUND);
			}
		}
		catch(Exception e) {
			HttpHeaders responseHeaders = new HttpHeaders();
			responseHeaders.set("error", e.getLocalizedMessage());
			return new ResponseEntity <> (responseHeaders, HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
}
