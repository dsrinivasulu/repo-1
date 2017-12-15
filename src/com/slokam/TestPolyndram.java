package com.slokam;

import java.util.Scanner;

public class TestPolyndram {

	public static void main1(String[] args) {
	
		System.out.println("please enter the name");
		String givename = new Scanner(System.in).next();
		String s = "givename";
		String rev ="";
		
		for(int i=givename.length()-1;i>=0;i--){
			
			rev +=givename.charAt(i);
		}
		//System.out.println(rev);
			if(rev.equalsIgnoreCase(givename)){
				
				System.out.println("this is polindream");
				
			}
			else{
				System.out.println("this is not  polindram");
			}
			

	}
	public static void main(String[] args) {
		
		
		System.out.println("Please enter a name");
		String givenumber = new Scanner(System.in).nextLine();
		
		String s = givenumber;
		   String rev= "";
		   
		   for(int i=givenumber.length()-1;i>=0;i--){
			   rev += givenumber.charAt(i);
			  
		   }
		   System.out.println(rev);
		   
		   if(rev.equalsIgnoreCase(givenumber)){
		   System.out.println("Result::::This is the polyndram");
		   } else{
			   System.out.println("Result::::This is the not polyndram");
		   }
	}

}
