package com.hcl.bulid;

public class Test {

	public static void main(String[] args) {
		
		Wall w = new Wall();
		Brick b= new Brick();

      Sand s = new Sand();
      
      w.additems(b);
      w.additems(s);
      w.bulid();
       
      


	}

}
