package com.tang.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.tang.dbc.DBManager;
import com.tang.vo.Book;

/**
 * BookDao 实现类
 * @author Administrator
 *
 */
public class BookDaoImpl implements BookDao{

	public Book findBook(String id) {
		Book book = null;  // 没有则返回null
		Connection conn = DBManager.getConnection();
		String sql = "SELECT * FROM book WHERE id = ?";
		PreparedStatement pstmt;
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, id);
			ResultSet rs = pstmt.executeQuery();
			if(rs.next()){
				book = new Book();
				book.setId(rs.getString("id"));
				book.setName(rs.getString("name"));
				book.setAuthor(rs.getString("author"));
				book.setPrice(rs.getDouble("price"));
				book.setDescription(rs.getString("description"));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return book;
	}

	public List<Book> getAll() {
		List<Book> list = new ArrayList<Book>();
		Connection conn = DBManager.getConnection();
		String sql = "SELECT * FROM book";
		PreparedStatement pstmt;
		try {
			pstmt = conn.prepareStatement(sql);
			ResultSet rs = pstmt.executeQuery();
			Book book = null;
			while(rs.next()){
				book = new Book();
				book.setId(rs.getString("id"));
				book.setName(rs.getString("name"));
				book.setAuthor(rs.getString("author"));
				book.setPrice(rs.getDouble("price"));
				book.setDescription(rs.getString("description"));
				list.add(book);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return list;
	}
	
}
