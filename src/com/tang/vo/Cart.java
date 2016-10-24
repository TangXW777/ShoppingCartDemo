package com.tang.vo;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;


/**
 * ���ﳵ
 * @author Administrator
 *
 */
public class Cart {
	private Map<String, BookItem> cart = new HashMap<String, BookItem>();
	private double price;
	
	// ����鱾�����ﳵ
	public void add(Book book){
		if(this.cart.get(book.getId()) == null){
			// ������ﳵ��û���Ȿ��
			BookItem bookItem = new BookItem();
			bookItem.setBook(book);
			bookItem.setQuantity(1);
			cart.put(book.getId(), bookItem);
		}else{
			// �ٴι���+1
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
	
	// ��ȡ���ﳵ���ܶ�
	public void setPrice(double price) {
		double sum = 0.0;
		for(Entry<String, BookItem> ontCart : cart.entrySet()){
			sum += ontCart.getValue().getPrice();
		}
		this.price = sum;
	}
	
	
	
	
}
