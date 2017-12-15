package com.logic;

public class printevennumbers {

	public static void main(String[] args) {
		int a[] ={1,4,7,8,9,6,3,55};
		
		for(int i=0;i<a.length;i++){
			if(a[i]%2 != 0){
				System.out.print(a[i]+" ");
			}
		}

	}

}
