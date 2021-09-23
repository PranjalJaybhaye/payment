package com.barclays.payment.Controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.barclays.payment.Service.BillService;
import com.barclays.payment.model.Bills;

import java.util.List;

@CrossOrigin(origins = "http://localhost:3000/")
@RestController
@RequestMapping("/bills")
public class BillsController {
	
	@Autowired
	private BillService billService; 
	
	@GetMapping("/")
	public ResponseEntity<List<Bills>> viewBills() {
			return billService.getAllBills();
	}
	
	@PostMapping("/update")
	public ResponseEntity<Bills> createBill(@RequestBody final Bills bill) {
		return billService.addBill(bill);
	}
	
	@PutMapping("/create")
	public ResponseEntity<Bills> modifyBill(@RequestBody final Bills bill) {
		return billService.addBill(bill);
	}
	
	@DeleteMapping("/delete/{id}")
	public ResponseEntity<Void> deleteBill(@PathVariable int id) {
		return billService.removeBill(id);
	}
}