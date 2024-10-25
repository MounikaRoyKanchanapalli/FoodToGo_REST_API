package com.first.foodApp.model;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;


	@Entity
	@Table(name="USER")
	public class User {

		@Id
		@GeneratedValue(strategy=GenerationType.AUTO)
		private Long userId;
		private String userName;
		private String userPassword;
		private String userAge;
		private String userPhn;
		private String userEmail;
		
		@OneToOne(cascade = CascadeType.ALL)
		private Address userAddress;

		public Long getUserId() {
			return userId;
		}
		public String getUserName() {
			return userName;
		}

		public void setUserName(String userName) {
			this.userName = userName;
		}

		public String getuserPassword() {
			return userPassword;
		}

		public void setuserPassword(String userPassword) {
			this.userPassword = userPassword;
		}

		public String getUserAge() {
			return userAge;
		}

		public void setUserAge(String userAge) {
			this.userAge = userAge;
		}

		public String getUserPhn() {
			return userPhn;
		}

		public void setUserPhn(String userPhn) {
			this.userPhn = userPhn;
		}

		public String getUserEmail() {
			return userEmail;
		}

		public void setUserEmail(String userEmail) {
			this.userEmail = userEmail;
		}

		public Address getUserAddress() {
			return userAddress;
		}

		public void setUserAddress(Address userAddress) {
			this.userAddress = userAddress;
		}
		@Override
		public String toString() {
			return "User [userId=" + userId + ", userName=" + userName + ", userPassword=" + userPassword + ", userAge="
					+ userAge + ", userPhn=" + userPhn + ", userEmail=" + userEmail + ", userAddress=" + userAddress
					+ "]";
		}
		public User(Long userId, String userName, String userPassword, String userAge, String userPhn, String userEmail,
				Address userAddress) {
			super();
			this.userId = userId;
			this.userName = userName;
			this.userPassword = userPassword;
			this.userAge = userAge;
			this.userPhn = userPhn;
			this.userEmail = userEmail;
			this.userAddress = userAddress;
		}
		public User() {
			super();
			// TODO Auto-generated constructor stub
		}

		
}
