package com.kongsophanit.CheckException;
/*
 * Checked Exception
 * */
public class InvalidAgeException extends Exception {
	public InvalidAgeException(){
		super();
	}
	public InvalidAgeException(String s){
		super(s);
	}
}
