package com.prm.bookstore.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.prm.bookstore.service.BookService;
import com.prm.bookstore.vo.BookStore;

@RestController
@RequestMapping(value="/")
public class BookStoreController {
	
	@Autowired
	BookService service;
	
	/*@GetMapping(value="/book/{name}" , produces=MediaType.APPLICATION_JSON_VALUE+";charset=UTF-8")
	public Book getBookByName(@PathVariable  String name) {
		return service.getBookByName(name);
	}*/
	
	@GetMapping(value="/book-store/{name}" , produces=MediaType.APPLICATION_JSON_VALUE+";charset=UTF-8")
	public BookStore getBookStoreByName(@PathVariable  String name) {
		return service.getBookStoreByStoreName(name);
	}
	
}
