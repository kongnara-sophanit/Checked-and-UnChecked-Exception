package com.kongsophanit.CheckException;

public class Students {
	private String name;
	private int age;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	//It needs to throws the exception in this stage;
	public void setAge(int age) throws InvalidAgeException {
		if(age < 25) throw new InvalidAgeException("Invalid ages input!!");
		this.age = age;
	}
}
