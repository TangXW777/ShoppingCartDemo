package com.tang.vo;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;


/**
 * 购物车
 * @author Administrator
 *
 */
public class Cart {
	private Map<String, BookItem> cart = new HashMap<String, BookItem>();
	private double price;
	
	// 添加书本到购物车
	public void add(Book book){
		if(this.cart.get(book.getId()) == null){
			// 如果购物车中没有这本书
			BookItem bookItem = new BookItem();
			bookItem.setBook(book);
			bookItem.setQuantity(1);
			cart.put(book.getId(), bookItem);
		}else{
			// 再次购买+1
			BookItem bookItem = cart.get(book.getId());
			bookItem.setQuantity(bookItem.getQuantity() + 1);
		}
	}

	public Map<String, BookItem> getCart() {
		return cart;
	}

	public void setCart(Map<String, BookItem> cart) {
		this.cart = cart;
	}

	public double getPrice() {
		double sum = 0.0;
		for(Entry<String, BookItem> ontCart : cart.entrySet()){
			sum += ontCart.getValue().getPrice();
		}
		return sum;
	}
	
	// 获取购物车的总额
	public void setPrice(double price) {
		double sum = 0.0;
		for(Entry<String, BookItem> ontCart : cart.entrySet()){
			sum += ontCart.getValue().getPrice();
		}
		this.price = sum;
	}
	
	
	
	
}
