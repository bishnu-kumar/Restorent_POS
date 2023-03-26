package com.pos.menu.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.pos.menu.model.Category;

@Repository
public interface ICategoryDao extends JpaRepository<Category, Integer>{

}
