package com.tang.service;

import java.util.List;

import com.tang.vo.Book;
import com.tang.vo.Cart;

/**
 * 业务逻辑层
 * 查找书本，购买，删除购物车的接口
 * @author Administrator
 *
 */
public interface BussinessService {
	// 获取全部书本
	public List<Book> getAll();
	
	// 查找某书本
	public Book findBook(String id);
	
	// 更改购买数量
	public void changeQuantity(String id, int quantity, Cart cart);
	
	// 从购物车删除某个物品
	public void deleteBookItem(String id, Cart cart);
	
	// 清空购物车
	public void clearCart(Cart cart);
}
