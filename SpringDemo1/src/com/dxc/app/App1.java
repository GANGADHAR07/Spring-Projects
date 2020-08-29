package com.dxc.app;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.dxc.beans.Student;

public class App1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
ApplicationContext ctxt = new ClassPathXmlApplicationContext("spring");
Student student = (Student)ctxt.getBean("student");
System.out.println(student);
	}

}
