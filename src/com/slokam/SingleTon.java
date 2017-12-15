package com.slokam;

public class SingleTon {
	
	private static SingleTon st=null;
	
	
	static{
		st = new SingleTon();
	}
	
	private SingleTon(){
		
	}
	
	public static synchronized SingleTon getIntance(){
		return st;
	}

}
