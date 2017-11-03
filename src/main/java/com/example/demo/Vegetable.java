package com.example.demo;

public class Vegetable {
	
	private String myName;
	
	public String getMyName() {
		return myName;
	}


	public void setMyName(String myName) {
		this.myName = myName;
	}
	
	public String talkAboutYourself() {
		String result = "Hi I am a vegetable.";
		if (myName!=null && !"".equals(myName)) {
			result+=" My name is "+myName;
		}
		return result;
	}

}
