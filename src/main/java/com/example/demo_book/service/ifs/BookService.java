package com.example.demo_book.service.ifs;

import com.example.demo_book.entity.Book;

public interface BookService {

	// 1.�Ы� ISBN�B�ѦW�B�@�̡B����B�w�s�q�B�P��q�B����
	public Book createBook(String ISBN, String bookName, String author, int price, int inventory, 
			String kind);
//
//	// 2.�ק� �w�s�q�A���:ISBN�B�ѦW�B�@�̡B����B�w�s�q
//	public Book updateInventory(int inventory);
//
//	// 3.�ק� ����A���:ISBN�B�ѦW�B�@�̡B����B�w�s�q
//	public Book updatePrice(int price);
//
//	// 4.���y�����j�M (��ܮѦW�BISBN�B�@�̡B����B�w�s�q)
//	public Book findByKind(String kind);
//
//	// 5.���O�̷j�M���y(�z�L�ѦW��ISBN�Χ@��)��ܮѦW�BISBN�B�@�̡B����
//	public Book costomerfindByBook(String ISBN, String bookName, String author);
//
//	// 6.���y�ӷj�M���y(�z�L�ѦW��ISBN�Χ@��)��ܮѦW�BISBN�B�@�̡B����B�P��q�B�w�s�q
//	public Book sellersfindByBook(String ISBN, String bookName, String author);
//	
//	//7.���y�P��:��ܮѦW�BISBN�B�@�̡B����B�ʶR�q�B�ʶR�`����(�w�s�q-1�B�P��q+1)
//	public Book salesBook(String ISBN, String bookName, String author);
//	
//	//8.���y�Z�P�Ʀ�]
//	public Book findTop5BySales(int sales);

}
