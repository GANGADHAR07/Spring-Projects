package com.dxc.app;
import com.dxc.person.Person;

public class AppNoDi {

	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Address add = new Address(100,"abc","AbcStreet","AbcCity");
Person person = new Person();
person.setId(100);
person.setName("Gangadhar");
person.setEmail("gangu@gmail.com");
person.setMobile("5277262828");
person.setAddress(add);
System.out.println(person);
	}

}
