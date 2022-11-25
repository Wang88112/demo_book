package com.example.demo_book.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo_book.entity.Book;
import com.example.demo_book.service.ifs.BookService;
import com.example.demo_book.vo.BookReq;
import com.example.demo_book.vo.BookRes;

@RestController
public class BookController {
	
	@Autowired
	private BookService bookService;
	
	@PostMapping(value = "/api/createBook")
	public BookRes createBook(@RequestBody BookReq req) {
//		String ISBN, String bookName, String author, int price, int inventory, 
//		String kind
		
				return null;
		
	}

}
