package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import com.example.demo.Entity.Book;
import com.example.demo.Service.BookService;

@Controller
public class HomeController {
	@Autowired
	private BookService bookService;
	@GetMapping("/home")
	public String hoem() {
		return "home";
	}
	@GetMapping("/book_register")
	public String bookRegister() {
		
		return "bookRegister";
	}
	@GetMapping("/availabeBooks")
 public ModelAndView getAllBooks() {
	  List<Book> list= bookService.getAllBooks();
	   ModelAndView v= new ModelAndView();
	    v.setViewName("BookList");
	    v.addObject("book", list);
		
	   return v;
 }
	@PostMapping("/save")
	public String addBooks(@ModelAttribute Book b ) {
		 bookService.saveBook(b);
		return "redirect:/availabeBooks";
	}
	
}
