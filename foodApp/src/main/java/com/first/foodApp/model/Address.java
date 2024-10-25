package com.first.foodApp.model;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

	@Entity
	@Table(name="ADDRESS")
	public class Address {

		@Id
		@GeneratedValue(strategy=GenerationType.AUTO)
		private Long addId;
		private String area;
		private String city;
		private String state;
		private String country;
		private String pincode;
		

		public Long getAddId() {
			return addId;
		}

		public void setAddId(Long addId) {
			this.addId = addId;
		}

		public String getArea() {
			return area;
		}

		public void setArea(String area) {
			this.area = area;
		}

		public String getCity() {
			return city;
		}

		public void setCity(String city) {
			this.city = city;
		}

		public String getState() {
			return state;
		}

		public void setState(String state) {
			this.state = state;
		}

		public String getCountry() {
			return country;
		}

		public void setCountry(String country) {
			this.country = country;
		}

		public String getPincode() {
			return pincode;
		}

		public void setPincode(String pincode) {
			this.pincode = pincode;
		}

		
		@Override
		public String toString() {
			return "Address [addId=" + addId + ", area=" + area + ", city=" + city + ", state=" + state + ", country="
					+ country + ", pincode=" + pincode + "]";
		}

		public Address(Long addId, String area, String city, String state, String country, String pincode) {
			super();
			this.addId = addId;
			this.area = area;
			this.city = city;
			this.state = state;
			this.country = country;
			this.pincode = pincode;
			
		}

		public Address() {
			super();
			
		}
		
		
}
