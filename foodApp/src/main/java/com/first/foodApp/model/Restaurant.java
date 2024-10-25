package com.first.foodApp.model;

import java.util.ArrayList;
import java.util.List;


import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;

@Entity
public class Restaurant {

		@Id
		@GeneratedValue(strategy=GenerationType.AUTO)
		private Long restId;
		private String restName;
		private String restManager;
		private String restPhn;
		
		@OneToOne(cascade = CascadeType.ALL)
		private Address address;
		

		@OneToMany(targetEntity = Item.class,cascade = CascadeType.ALL)
		private List<Item> itemList = new ArrayList<>();
		
		

		public Restaurant(Long restId, String restName, String restManager, String restPhn, Address address,
				List<Item> itemList) {
			super();
			this.restId = restId;
			this.restName = restName;
			this.restManager = restManager;
			this.restPhn = restPhn;
			this.address = address;
			this.itemList = itemList;
		}
		
		

		public Restaurant() {
			super();
			// TODO Auto-generated constructor stub
		}

		

		public Long getRestId() {
			return restId;
		}

		public void setRestId(Long restId) {
			this.restId = restId;
		}

		public String getRestName() {
			return restName;
		}

		public void setRestName(String restName) {
			this.restName = restName;
		}

		public String getRestManager() {
			return restManager;
		}

		public void setRestManager(String restManager) {
			this.restManager = restManager;
		}

		public String getRestPhn() {
			return restPhn;
		}

		public void setRestPhn(String restPhn) {
			this.restPhn = restPhn;
		}

		public Address getAddress() {
			return address;
		}

		public void setAddress(Address address) {
			this.address = address;
		}

		public List<Item> getItemList() {
			return itemList;
		}

		public void setItemList(List<Item> itemList) {
			this.itemList = itemList;
		}



		@Override
		public String toString() {
			return "Restaurant [restId=" + restId + ", restName=" + restName + ", restManager=" + restManager
					+ ", restPhn=" + restPhn + ", address=" + address + ", itemList=" + itemList + "]";
		}
		
		
	
}
