package com.tang.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.tang.service.BussinessService;
import com.tang.service.BussinessServiceImpl;
import com.tang.vo.Book;

public class ListBookServlet extends HttpServlet{
	BussinessService service = new BussinessServiceImpl();
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		List<Book> books = service.getAll();
		req.setAttribute("books", books);
		req.getRequestDispatcher("../WEB-INF/jsp/listbook.jsp").forward(req, resp);
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		this.doGet(req, resp);
	}
}
