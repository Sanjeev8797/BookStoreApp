package com.example.demo.Service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Entity.Book;
import com.example.demo.Repositry.BookRepositry;
import com.example.demo.Service.BookService;
@Service
public class BookServiceImpl implements BookService {
	@Autowired
	private BookRepositry bookRepo;

	@Override
	public void saveBook(Book b) {
	   bookRepo.save(b);
		
	}

	@Override
	public List<Book> getAllBooks() {
		// TODO Auto-generated method stub
		return bookRepo.findAll();
	}

}
