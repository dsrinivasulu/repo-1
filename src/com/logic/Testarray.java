package com.logic;



public class Testarray {

	public static void main(String[] args) {
		
		
		int a[] = {1,2,3,4,5};
		int b[] ={6,7,8,9,3};
		int sum =0;

		int x =0;
		
		for (int i : a) {
			
			if( i%2== 0){
				
				x=x+i;
				x++;
				sum = sum+i;
			}
			
		
	}
		
		System.out.println(sum);
		
		/////////////////////////////////////
		 sum =0;
		int y=0;
		for(int i : b){
			if(i%2!=0){
				y=y+i;
				y++;
				sum=sum+i;
			}
		}
		System.out.println(sum);
		
		

}
}
