package com.example.demo.Service;

import java.util.List;

import com.example.demo.Entity.Book;

public interface BookService {
	public void  saveBook(Book b);
	public List<Book> getAllBooks();

}
