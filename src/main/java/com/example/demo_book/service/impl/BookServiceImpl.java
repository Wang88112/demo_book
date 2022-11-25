package com.example.demo_book.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo_book.entity.Book;
import com.example.demo_book.repository.BookDao;
import com.example.demo_book.service.ifs.BookService;

@Service
public class BookServiceImpl implements BookService {
	
	@Autowired
	private BookDao bookDao;

	@Override
	public Book createBook(String ISBN, String bookName, String author, int price, int inventory, String kind) {
		
		Book book = new Book(ISBN, bookName, author, price, inventory, kind);
		return bookDao.save(book);
	}
	
	

}
