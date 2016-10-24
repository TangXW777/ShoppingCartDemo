package com.tang.service;

import java.util.List;

import com.tang.dao.BookDao;
import com.tang.dao.BookDaoImpl;
import com.tang.vo.Book;
import com.tang.vo.BookItem;
import com.tang.vo.Cart;

/**
 * BussinessService  µœ÷¿‡
 * @author Administrator
 *
 */
public class BussinessServiceImpl implements BussinessService{
	BookDao dao = new BookDaoImpl();
	public void changeQuantity(String id, int quantity, Cart cart) {
		BookItem bookItem = cart.getCart().get(id);
		if(bookItem != null){
			bookItem.setQuantity(quantity);
		}
	}

	public void clearCart(Cart cart) {
		cart.getCart().clear();
		
	}

	public void deleteBookItem(String id, Cart cart) {
		BookItem bookItem = cart.getCart().get(id);
		if(bookItem != null){
			cart.getCart().remove(id);
		}
		
	}

	public Book findBook(String id) {
		return dao.findBook(id);
	}

	public List<Book> getAll() {
		return dao.getAll();
	}

}
