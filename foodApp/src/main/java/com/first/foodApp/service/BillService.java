package com.first.foodApp.service;

import com.first.foodApp.model.Bill;

public interface BillService {

		public String createBill(Bill bill);
		public Bill getBillById(Long billId);
		public String deleteBillById(Long billId);
		public String updateBill(Bill bill);
}
