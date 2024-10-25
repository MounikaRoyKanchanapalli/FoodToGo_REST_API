package com.first.foodApp.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.first.foodApp.model.Bill;
import com.first.foodApp.service.BillService;

@RestController
@RequestMapping("/bill")
public class BillController {
	
	BillService billService;

	public BillController(BillService billService) {
		super();
		this.billService = billService;
	}

	@PostMapping("/billGenerate")
	public String createBill(@RequestBody Bill bill) {
		billService.createBill(bill);
		return "Bill Generated";
	}
	
	@GetMapping("{billId}")
	public Bill getBillById(@PathVariable("billId")Long billId) {
		return billService.getBillById(billId);
	}
	public String deleteBillById(@PathVariable("billId")Long billId) {
		billService.deleteBillById(billId);
		return "Bill Deleted";
	}
	@PutMapping("/billUpdate")
	public String updateBill(@RequestBody Bill bill) {
		return "Bill Generated";
	}
}
