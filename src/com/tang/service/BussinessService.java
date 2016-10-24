package com.tang.service;

import java.util.List;

import com.tang.vo.Book;
import com.tang.vo.Cart;

/**
 * ҵ���߼���
 * �����鱾������ɾ�����ﳵ�Ľӿ�
 * @author Administrator
 *
 */
public interface BussinessService {
	// ��ȡȫ���鱾
	public List<Book> getAll();
	
	// ����ĳ�鱾
	public Book findBook(String id);
	
	// ���Ĺ�������
	public void changeQuantity(String id, int quantity, Cart cart);
	
	// �ӹ��ﳵɾ��ĳ����Ʒ
	public void deleteBookItem(String id, Cart cart);
	
	// ��չ��ﳵ
	public void clearCart(Cart cart);
}
