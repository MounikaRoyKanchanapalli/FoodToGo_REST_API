package com.first.foodApp.serviceImpl;

import org.springframework.stereotype.Service;

import com.first.foodApp.model.Bill;
import com.first.foodApp.repository.BillRepo;
import com.first.foodApp.service.BillService;

@Service
public class BillImpl implements BillService{
	
	
	BillRepo billRepo;
	
	public BillImpl(BillRepo billRepo) {
		super();
		this.billRepo = billRepo;
	}

	@Override
	public String createBill(Bill bill) {
		// TODO Auto-generated method stub
		billRepo.save(bill);
		return "Created";
	}

	@Override
	public Bill getBillById(Long billId) {
		// TODO Auto-generated method stub
		return billRepo.findById(billId).get();
	}

	@Override
	public String deleteBillById(Long billId) {
		// TODO Auto-generated method stub
		billRepo.deleteById(billId);
		return "Deleted bill";
	}

	@Override
	public String updateBill(Bill bill) {
		// TODO Auto-generated method stub
		billRepo.save(bill);
		return null;
	}

	
}
