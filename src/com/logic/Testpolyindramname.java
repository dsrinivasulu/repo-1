package com.logic;

import java.util.Scanner;

public class Testpolyindramname {

	public static void main(String[] args) {
		
		System.out.println("Enter any name");
		String givename = new Scanner(System.in).nextLine();
		
		String s =givename;
		String rev ="";
		
		for(int i=givename.length()-1;i>=0;i--){
			
			rev +=givename.charAt(i);
			
		}
		System.out.println(rev);
		
		
		if(rev.equalsIgnoreCase(givename))
			System.out.println("Result::: this a polyindram");
		else
			System.out.println("Result::: this a not  polyindram");

	}

}
