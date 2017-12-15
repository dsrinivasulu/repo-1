package com.logic;

public class TestFibanaci {

	public static void main(String[] args) {
		
		
		int a =1;
		int b= 1;
		System.out.print(a);
		
		int c =0;
		while(c<=100){
			c = a+b;
			System.out.println(" ");
			if(c<=100)
				System.out.print(c);
			a=b;
			b=c;
		}
		 System.out.println(" ");

	}

}
