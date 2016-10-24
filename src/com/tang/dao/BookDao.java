package com.tang.dao;

import java.util.List;

import com.tang.vo.Book;

public interface BookDao {
	
	// 获取全部书本
	public List<Book> getAll();
	
	// 获取某本书本
	public Book findBook(String id);
}
