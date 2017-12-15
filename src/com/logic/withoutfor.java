package com.logic;

public class withoutfor {

	public static void main(String[] args) {
		
		withoutfor(1);
	
	}
	public static void withoutfor(int n){
	if(n<=100){
		System.out.print(n+" ");
		withoutfor(n+1);
	
	}
		
	}
	
}

