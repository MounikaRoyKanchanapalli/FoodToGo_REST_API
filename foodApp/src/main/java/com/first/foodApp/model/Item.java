package com.first.foodApp.model;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table
public class Item {
		
		@Id
		@GeneratedValue(strategy=GenerationType.AUTO)
		private Long itemId;
		private String itemName;
		private int itemQuantity;
		private int itemCost;
		private boolean itemAvailability;
	

		public Long getItemId() {
			return itemId;
		}

		public void setItemId(Long itemId) {
			this.itemId = itemId;
		}

		public String getItemName() {
			return itemName;
		}

		public void setItemName(String itemName) {
			this.itemName = itemName;
		}

		public int getItemQuantity() {
			return itemQuantity;
		}

		public void setItemQuantity(int itemQuantity) {
			this.itemQuantity = itemQuantity;
		}

		public int getItemCost() {
			return itemCost;
		}

		public void setItemCost(int itemCost) {
			this.itemCost = itemCost;
		}

		public boolean isItemAvailability() {
			return itemAvailability;
		}

		public void setItemAvailability(boolean itemAvailability) {
			this.itemAvailability = itemAvailability;
		}

		public Item(Long itemId, String itemName, int itemQuantity, int itemCost, boolean itemAvailability,
				Restaurant rest) {
			super();
			this.itemId = itemId;
			this.itemName = itemName;
			this.itemQuantity = itemQuantity;
			this.itemCost = itemCost;
			this.itemAvailability = itemAvailability;
		}

		public Item() {
			super();
			// TODO Auto-generated constructor stub
		}

		@Override
		public String toString() {
			return "Item [itemId=" + itemId + ", itemName=" + itemName + ", itemQuantity=" + itemQuantity
					+ ", itemCost=" + itemCost + ", itemAvailability=" + itemAvailability + "]";
		}
		
		
}
