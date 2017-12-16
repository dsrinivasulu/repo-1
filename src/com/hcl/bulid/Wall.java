package com.hcl.bulid;

import java.util.ArrayList;
import java.util.List;

public class Wall implements bulidingproject {
	
	
	List<bulidingproject> list = new ArrayList<bulidingproject>();

	@Override
	public void bulid() {
		
		System.out.println("starting the wall");
		for (bulidingproject bulidingproject : list) {
			
			bulidingproject.bulid();
			
		}
		
		System.out.println("ending the wall");
		
	}
	
	
	public void additems(bulidingproject items){
		
		list.add(items);
		
	}

}
