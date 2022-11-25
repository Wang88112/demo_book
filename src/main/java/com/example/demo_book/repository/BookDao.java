package com.example.demo_book.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo_book.entity.Book;

@Repository  //�Ω��ƳB�z(CRUD)��SpringBoot�U��
public interface BookDao extends JpaRepository<Book, String>  {

//	public Book findTop5BySales(int sales);
}
