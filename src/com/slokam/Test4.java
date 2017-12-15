package com.slokam;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Test4 {
	
	public static void main1(String[] args) {
		List<String> list = new LinkedList<String>();
		

		list.add("A");
		list.add("D");
		list.add("C");
		list.add("B");
		list.add("F");
		//list.remove(2);
		
		System.out.println(list.size());
	}

	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		
		
		list.add("A");
		list.add("D");
		list.add("C");
		list.add("B");
		list.add("F");
		
		System.out.println(list);

	}

}
