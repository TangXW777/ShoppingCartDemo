package com.tang.vo;

/**
 *	买书数量和总价
 * @author Administrator
 *
 */
public class BookItem {
	private Book book;
	private int quantity;
	private double price;
	public Book getBook() {
		return book;
	}
	public void setBook(Book book) {
		this.book = book;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public double getPrice() {
		return book.getPrice() * this.quantity;
	}
	public void setPrice(double price) {
		this.price = book.getPrice() * this.quantity;
	}
	
	
}
