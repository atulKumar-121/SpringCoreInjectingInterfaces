package com.learn.spring.injecting.iterfaces;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("orderBOimpl")
public class OrderBOimpl implements OrderBO{
	
	@Autowired
	private OrderDAO dao;

	public OrderDAO getDao() {
		return dao;
	}

	public void setDao(OrderDAO dao) {
		this.dao = dao;
	}

	public void placeOrder() {
		// TODO Auto-generated method stub
		System.out.println("Inside Order BO");
		dao.createOrder();
	}

	@Override
	public String toString() {
		return "OrderBOimpl [dao=" + dao + "]";
	}

}
