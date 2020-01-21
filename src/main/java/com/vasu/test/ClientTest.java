package com.vasu.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;

import com.vasu.bean.Bike;

public class ClientTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext ctx=null;
		//locate the cfg file
		//ClassPathResource res=new ClassPathResource("applicationContext.xml");
		
		ctx= new ClassPathXmlApplicationContext("com/vasu/cfgss/applicationContext.xml");
		
		Bike bk=ctx.getBean("pc", Bike.class);
		
		System.out.println(bk);
	}

}
