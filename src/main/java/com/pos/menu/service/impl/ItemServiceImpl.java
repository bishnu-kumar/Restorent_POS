package com.pos.menu.service.impl;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pos.menu.dao.ItemDao;
import com.pos.menu.model.Item;

@Service
public class ItemServiceImpl {
	
	@Autowired
	ItemDao itemDao;
	
	public Item saveItem(Item item){ 
		return itemDao.save(item);
		
	}	

	public Optional<Item> getItemById(Integer itemId){ 
		return itemDao.findById(itemId);
		
	}

	public Item updateItem(Item item){ 
		Item item1 = itemDao.getItemById(item.getItemId());
	
		if(item.getItemName()!=null) {
			item1.setItemName(item.getItemName());
		}
		if(item.getDescription()!=null) {
			item1.setDescription(item.getDescription());
		}
		
		return itemDao.save(item1);
	}

//	public Item saveItem(Integer itemId){  // delete discussion required soft or hard delete
//		
//	}

}
