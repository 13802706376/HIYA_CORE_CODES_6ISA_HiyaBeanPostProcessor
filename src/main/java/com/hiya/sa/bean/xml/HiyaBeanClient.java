package com.hiya.sa.bean.xml;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HiyaBeanClient
{

	public static void main(String[] args)
	{
		@SuppressWarnings("resource")
		ApplicationContext ctx = new ClassPathXmlApplicationContext("application.xml");
		HiyaInitializingBean hiyabean = (HiyaInitializingBean) ctx.getBean("hiyaInitializingBean");
		hiyabean.prints("韦德");
		System.out.println(hiyabean.getName() + "\n------------");

		HiyaPerson person = (HiyaPerson) ctx.getBean("person");
		System.out.println("person.name===="+person.getName());
		
		System.gc();
	}

}
