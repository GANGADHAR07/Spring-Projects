package com.dxc.app;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.dxc.person.Person;

public class App_2_Di {
	public static void main(String[] args) {
		ApplicationContext ctxt = new ClassPathXmlApplicationContext("spring.xml");
		Person person = (Person)ctxt.getBean("person");
		System.out.println(person);
	}
}
