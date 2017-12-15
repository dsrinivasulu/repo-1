
package com.slokam;

import java.util.Scanner;

public class TestpoalindreamNumber {

		public static void main(String[] args)
		{
			
			System.out.println("please enter a number");
		 
			int givenumber = new Scanner(System.in).nextInt();
			
			/*int number = givenumber;
			int reverse=0;
			
			while(number!= 0){
				
				int remainder = number%10;
				reverse = reverse*10+remainder;
			      number = number/10;
			}
			      if(givenumber==reverse)
			    	  System.out.println("Result::polindram");
			      else
			    	  System.out.println("Result::Not a polindram");
			      */
			
			int number = givenumber;
			int reverse=0;
			
			
			while(number!= 0){
				
				int reminder = number%10;
				 reverse =reverse*10+reminder;
				 number =number/10;
				
			}
			
			if(givenumber==reverse)
				System.out.println("Result::: polyindram");
			else
				System.out.println("Result::: this is not polyindram");
				
				
			
		
			
		    }
		}
		
