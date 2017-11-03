package com.example.demo;

public class Fruit {
	
	private String myName;
	
	public Fruit() {}
	
	public Fruit(String myName) {
		setMyName(myName);
	}


	public String talkAboutYourself() {
		String result = "Hi I am a fruit.";
		if (myName!=null && !"".equals(myName)) {
			result+=" My name is "+myName;
		}
		return result;
	}


	public String getMyName() {
		return myName;
	}


	public void setMyName(String myName) {
		this.myName = myName;
	}
}
