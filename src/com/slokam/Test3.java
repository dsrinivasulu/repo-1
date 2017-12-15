package com.slokam;

import java.util.ArrayList;
import java.util.List;

public class Test3 {

	public static void main(String[] args) {
		List<String> list = new ArrayList<String>(){
		
		@Override
		public boolean add(String e){
			
			if(!contains(e))
				return super.add(e);
			else
				return false;
			
		}
		
		};
		list.add("1");
		list.add("2");
		list.add("1");
		list.add("3");
		list.add("2");
		list.add("#");
		list.add("#");
		
		
		System.out.println(list);
	}

}
