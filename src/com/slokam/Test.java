package com.slokam;

public class Test {
	
	
	public static void main(String[] args) {
     String s1 = new String("vamsi");
		 s1.concat("akhil");
		 System.out.println(s1);
		 
		 
		 StringBuffer s2 = new StringBuffer("srinu");
		 s2.append("akhil");
		 System.out.println(s2);
		 
		 StringBuilder s3= new StringBuilder("anji");
		 s3.append("vikki");
		 System.out.println(s3);
	}
	
	public static void main2(String[] args) {
		
		 String s1 = new String("akhil");
		 String s2=s1.intern();
		 System.out.println(s1==s2);
		 
		 
		 String s3="akhil";
		 System.out.println(s3==s2);
		 
		 
		 
		
	}
	
	public static void main1(String[] args) {
		
		ImmutableTest test = new ImmutableTest("srinu",23);
		System.out.println(test.getName().hashCode());
		System.out.println(test.getAge());
		
		
		ImmutableTest test1 = test.setName("akhil");
		System.out.println(test.getName().hashCode());
		
	
		
		
	}

}
