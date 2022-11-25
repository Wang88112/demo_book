package com.example.demo_book.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo_book.entity.Book;

@Repository  //用於資料處理(CRUD)讓SpringBoot託管
public interface BookDao extends JpaRepository<Book, String>  {

//	public Book findTop5BySales(int sales);
}
