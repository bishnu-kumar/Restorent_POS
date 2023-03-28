package com.pos.menu.service;

import com.pos.menu.model.Item;

public interface IItemService {

	public Item saveItem(Item item);	

	public Item getItemById(Integer itemId);

	public Item updateItem(Item item);

	public Item saveItem(Integer itemId);

}
