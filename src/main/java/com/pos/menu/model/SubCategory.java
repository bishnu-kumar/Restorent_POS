package com.pos.menu.model;

import javax.persistence.Entity;

@Entity
public class SubCategory {

	private Integer subCategoryId;
	private String SubCategoryName;

	public Integer getSubCategoryId() {
		return subCategoryId;
	}

	public void setSubCategoryId(Integer subCategoryId) {
		this.subCategoryId = subCategoryId;
	}

	public String getSubCategoryName() {
		return SubCategoryName;
	}

	public void setSubCategoryName(String subCategoryName) {
		SubCategoryName = subCategoryName;
	}

}
