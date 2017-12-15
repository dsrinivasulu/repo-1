package com.slokam;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Test2 {
	

	public static void main(String[] args) {
		
		// @SuppressWarnings("serial")
		    List<String> list = new ArrayList<String>(){
		     
		        public boolean add(String e) {
		            if(!contains(e))
		            return super.add(e);
		            else
		            return false;
		        }
		   };
		
		
	//List<Integer> list =new ArrayList<Integer>();
	    list.add("1");
	    list.add("2");
	    list.add("2");
	    list.add("3");
	    list.add("1");
	    list.add("#");
	    list.add("#");

	    System.out.println(list);
	
	
}
}
