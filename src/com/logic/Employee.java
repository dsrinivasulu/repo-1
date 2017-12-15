package com.logic;

import java.util.ArrayList;
import java.util.List;

public class Employee {

	int id = 123;
	String name = "srinu";
	
	public static void main(String[] args) {
		
		
		Employee e = new Employee();
		
		List<Employee >list = new ArrayList<Employee>();
		
	list.add(e);
	System.out.println(list);

		//System.out.println(e.id);
		//System.out.println(e.id);
		//System.out.println(e.name);
		//System.out.println(list);
	}

}
