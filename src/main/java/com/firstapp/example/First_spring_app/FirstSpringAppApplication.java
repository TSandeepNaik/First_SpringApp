package com.firstapp.example.First_spring_app;

import com.firstapp.example.First_spring_app.model.Address;
import com.firstapp.example.First_spring_app.model.Employee;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
//model class which represents the real time entity and directly connected to the database.
//controller  package have all ur API
@SpringBootApplication
public class FirstSpringAppApplication {

	public static void main(String[] args) {

		SpringApplication.run(FirstSpringAppApplication.class, args);
		System.out.println("hello everyone welcome to first spring application");

	/*
	//this concept known as tight coupling - one object is depending on another
		Employee emp1 = new Employee();
		emp1.empId=123;
		emp1.empName="Sandeep";
		emp1.empEmail="sandeepnaikat100@gmail.com";

		Address add1 = new Address();
		add1.doorNum=10;
		add1.streetName="venkateshwara";
		add1.city="bangalore";

		emp1.address=add1;
		System.out.println(emp1);

	 */

		// loose coupling by 2 method - 1. setter injection
		//			                    2. constructor injection

		//1.setter injection

		Employee emp2 = new Employee();
		emp2.setEmpId(111);
		emp2.setEmpName("sandeep");
		emp2.setEmpEmail("sandeepnaikat100@gmail.com");

		Address addr = new Address();
		addr.setDoorNum(1);
		addr.setStreetName("vinayakaLayout");
		addr.setCity("bangalore");
		//here we are not adding the one object to another directly, but we are setting the values of address to employee
		emp2.setAddress(addr);
  //if we want employee city
		emp2.getAddress().getCity();
		//if we want to chage the city
		emp2.getAddress().setCity("mahadevpura");
		
	}
}
