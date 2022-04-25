package com.learn.spring.injecting.iterfaces;

import org.springframework.stereotype.Component;

@Component
public class OrderDAOimpl implements OrderDAO {

	public void createOrder() {
		// TODO Auto-generated method stub
		System.out.println("Inside Order DAO createOrder");
		
	}

}
