package com.learn.spring.injecting.iterfaces;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext ctx=new ClassPathXmlApplicationContext("com/learn/spring/injecting/iterfaces/config2.xml");
//		OrderBOimpl bo = (OrderBOimpl) ctx.getBean("bo");
//		System.out.println(bo.toString());
//		bo.placeOrder();
		OrderBOimpl orderBOimpl = (OrderBOimpl) ctx.getBean("orderBOimpl");
		System.out.println(orderBOimpl.toString());
		orderBOimpl.placeOrder();

	}

}
