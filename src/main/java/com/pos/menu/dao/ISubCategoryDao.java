package com.pos.menu.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.pos.menu.model.SubCategory;

@Repository
public interface ISubCategoryDao extends JpaRepository<SubCategory, Integer> {

}
