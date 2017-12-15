package com.slokam;

public class SingletonTest {

	public static void main(String[] args) {
		SingleTon st =SingleTon.getIntance();
		System.out.println(st.hashCode());
		
		SingleTon st1 =SingleTon.getIntance();
		System.out.println(st1.hashCode());
	}

}
