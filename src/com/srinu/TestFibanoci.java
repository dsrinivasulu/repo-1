package com.srinu;

public class TestFibanoci {

	public static void main(String[] args) {
		 int a =1;
		 int b =1;
		 int c =0;
		 System.out.println(a);
		 
		 while(c<=100){
			 c = a+b;
			 System.out.print("");
		 
         if(c<=100){
        	 System.out.println(c);
         }
         a=b;
         b=c;
		 }
	}

}
