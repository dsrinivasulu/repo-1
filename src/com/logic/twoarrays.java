package com.logic;

public class twoarrays {

	public static void main(String[] args) {
		int a[]={1,2,3,4,5,95,66,};
		int b[]={4,58,6,78,9,10};
		int c[]=new int[a.length+b.length];
		
		int count=0;
		
		for(int i=0; i<a.length; i++)
		{
			c[i]=a[i];
			count++;
		}
		for(int i=0; i<b.length; i++)
		{
			c[count++]=b[i];
		}
		for(int i=0; i<c.length; i++)
		{
			System.out.print(c[i]+" ");
		}
		
		
		
		//sorting
		for(int i=0; i<c.length; i++)
		{
			for(int j=0; j<c.length; j++)
			{
				if(c[i]<c[j]){
				int tem=c[i];
				   c[i]=c[j];
				   c[j]=tem;
				   }
			}
		}
		System.out.println();
		System.out.println("shorting of C array");
		for(int i=0; i<c.length; i++)
			
		{
			System.out.print(c[i]+" ");
		}

	}

}
