package com.pos.menu.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.pos.menu.model.Item;
import com.pos.menu.service.IItemService;

@RestController
public class ItemController {

	@Autowired
	IItemService itemService;

	@PostMapping
	Item saveItem(@RequestBody Item item) {
		return null;

	}

	@GetMapping
	Item getItemById(@PathVariable Integer itemId) {
		return null;

	}

	@PutMapping
	Item updateItem(@RequestBody Item item) {
		return null;
	}

	@DeleteMapping
	Item saveItem(@PathVariable Integer itemId) {
		return null;

	}

}
