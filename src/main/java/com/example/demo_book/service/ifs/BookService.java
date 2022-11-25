package com.example.demo_book.service.ifs;

import com.example.demo_book.entity.Book;

public interface BookService {

	// 1.創建 ISBN、書名、作者、價格、庫存量、銷售量、分類
	public Book createBook(String ISBN, String bookName, String author, int price, int inventory, 
			String kind);
//
//	// 2.修改 庫存量，顯示:ISBN、書名、作者、價格、庫存量
//	public Book updateInventory(int inventory);
//
//	// 3.修改 價格，顯示:ISBN、書名、作者、價格、庫存量
//	public Book updatePrice(int price);
//
//	// 4.書籍分類搜尋 (顯示書名、ISBN、作者、價格、庫存量)
//	public Book findByKind(String kind);
//
//	// 5.消費者搜尋書籍(透過書名或ISBN或作者)顯示書名、ISBN、作者、價格
//	public Book costomerfindByBook(String ISBN, String bookName, String author);
//
//	// 6.書籍商搜尋書籍(透過書名或ISBN或作者)顯示書名、ISBN、作者、價格、銷售量、庫存量
//	public Book sellersfindByBook(String ISBN, String bookName, String author);
//	
//	//7.書籍銷售:顯示書名、ISBN、作者、價格、購買量、購買總價格(庫存量-1、銷售量+1)
//	public Book salesBook(String ISBN, String bookName, String author);
//	
//	//8.書籍暢銷排行榜
//	public Book findTop5BySales(int sales);

}
