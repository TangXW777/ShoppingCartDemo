package com.tang.dao;

import java.util.List;

import com.tang.vo.Book;

public interface BookDao {
	
	// ��ȡȫ���鱾
	public List<Book> getAll();
	
	// ��ȡĳ���鱾
	public Book findBook(String id);
}
