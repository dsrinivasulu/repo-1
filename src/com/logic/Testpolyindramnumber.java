package com.logic;

import java.util.Scanner;

public class Testpolyindramnumber {

	public static void main(String[] args) {
		
		
		System.out.println("Enter any number");
		int givenumber = new Scanner(System.in).nextInt();
		
		int number=givenumber;
		int reverse=0;
		
		while(number!= 0){
			int reminder = number%10;
			reverse = reverse*10+reminder;
			number =number/10;
		}
		
		if(givenumber==reverse)
			System.out.println("Result::: this is a polyindram");
		else
			System.out.println("Result::: this is a not  polyindram");
		

	}

}
