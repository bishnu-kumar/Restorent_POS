package com.pos.menu.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.pos.menu.model.Item;

@Repository
public interface ItemDao extends JpaRepository<Item, Integer> {
	
	@Query("select I from Item I where I.itemId=:? ")
	public Item getItemById(Integer itemId);

}
