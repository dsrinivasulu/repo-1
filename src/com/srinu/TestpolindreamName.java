package com.srinu;

import java.util.Scanner;

public class TestpolindreamName {

	public static void main(String[] args) {
		System.out.println("please enter the name");
		String givename = new Scanner(System.in).next();
		
		
		String s = givename;
		String rev ="";
		
		for(int i=givename.length()-1;i>=0;i--){
			 rev +=givename.charAt(i);
		}
		System.out.println(rev);
		if(rev.equalsIgnoreCase(givename)){
			System.out.println("Result::: this is the polindream");
		}else{
			System.out.println("Result::: this is not polindream");
		}

	}

}
