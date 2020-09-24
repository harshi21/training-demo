package com.verizontraining.springboot.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.verizontraining.springboot.demo.domain.Book;

@RestController
public class BookController {
  
	@GetMapping(value = "/books")
	public Book getBook() {
		Book book = new Book();
		book.setName("Book Name");
		book.setAuthor("Author one");
		return book;
	}
}
