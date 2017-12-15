package com.slokam;

public final class ImmutableTest {
	
	
	private String name;
	private Integer age;
	
  public ImmutableTest(String name,Integer age){
	  
	  this.name=name;
	  this.age=age;
	  
  }

public String getName() {
	return name;
}

public ImmutableTest setName(String name) {
	this.name = name;
	return null;
}

public Integer getAge() {
	return age;
}

public void setAge(Integer age) {
	this.age = age;
}
	
	

}
