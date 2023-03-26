package com.pos.menu.model;

import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Item {

	// Need To Discuss How to Save Image Of Product (Bishnu Daught )

	@Id
	@GeneratedValue
	private Integer itemId;
	private Integer price;
	private String itemName;

	public String getDescription() {
		return Description;
	}

	public void setDescription(String description) {
		Description = description;
	}

	private String Description;
	private Date createdTime;
	private Date updationTime;

	public Integer getPrice() {
		return price;
	}

	public void setPrice(Integer price) {
		this.price = price;
	}

	public Date getCreatedTime() {
		return createdTime;
	}

	public void setCreatedTime(Date createdTime) {
		this.createdTime = createdTime;
	}

	public Date getUpdationTime() {
		return updationTime;
	}

	public void setUpdationTime(Date updationTime) {
		this.updationTime = updationTime;
	}

	public Integer getItemId() {
		return itemId;
	}

	public void setItemId(Integer itemId) {
		this.itemId = itemId;
	}

	public String getItemName() {
		return itemName;
	}

	public void setItemName(String itemName) {
		this.itemName = itemName;
	}

}
