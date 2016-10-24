package com.tang.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.tang.service.BussinessService;
import com.tang.service.BussinessServiceImpl;
import com.tang.vo.Cart;

public class DeleteBookItemServlet extends HttpServlet{
	BussinessService service = new BussinessServiceImpl();
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		String id = req.getParameter("id");
		service.deleteBookItem(id, (Cart)req.getSession().getAttribute("cart"));
		resp.sendRedirect(req.getContextPath() + "/servlet/ListCartServlet");
	
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		this.doGet(req, resp);
	}
	
}
