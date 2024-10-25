package com.first.foodApp.model;

import java.time.LocalDateTime;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Bill {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long billId;
	private LocalDateTime billDate;
	private Double totalBill;
	private int totalItems;
	public Bill(Long billId, LocalDateTime billDate, Double totalBill, int totalItems) {
		super();
		this.billId = billId;
		this.billDate = billDate;
		this.totalBill = totalBill;
		this.totalItems = totalItems;
	}
	public Bill() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Long getBillId() {
		return billId;
	}
	public void setBillId(Long billId) {
		this.billId = billId;
	}
	public LocalDateTime getBillDate() {
		return billDate;
	}
	public void setBillDate(LocalDateTime billDate) {
		this.billDate = billDate;
	}
	public Double getTotalBill() {
		return totalBill;
	}
	public void setTotalBill(Double totalBill) {
		this.totalBill = totalBill;
	}
	public int getTotalItems() {
		return totalItems;
	}
	public void setTotalItems(int totalItems) {
		this.totalItems = totalItems;
	}
	@Override
	public String toString() {
		return "Bill [billId=" + billId + ", billDate=" + billDate + ", totalBill=" + totalBill + ", totalItems="
				+ totalItems + "]";
	}
	
	
}
