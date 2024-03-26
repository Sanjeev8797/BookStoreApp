package com.example.demo.Repositry;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.Entity.Book;

public interface BookRepositry extends JpaRepository<Book, Integer>{

}
