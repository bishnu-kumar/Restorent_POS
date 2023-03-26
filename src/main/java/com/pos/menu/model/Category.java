package com.pos.menu.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Category {

	@Id
	@GeneratedValue
	private Integer categoryID;
	private Integer CategoryName;

	public Integer getCategoryID() {
		return categoryID;
	}

	public void setCategoryID(Integer categoryID) {
		this.categoryID = categoryID;
	}

	public Integer getCategoryName() {
		return CategoryName;
	}

	public void setCategoryName(Integer categoryName) {
		CategoryName = categoryName;
	}

}
