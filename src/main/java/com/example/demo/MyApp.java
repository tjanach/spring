package com.example.demo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class MyApp {

	public static void main(String[] args) {
		
//		Fruit myFruit = new Fruit();
//		Vegetable myWegetable = new Vegetable();
		
		//ApplicationContext appContext = new FileSystemXmlApplicationContext("appContext.xml");
		ApplicationContext appContext = new ClassPathXmlApplicationContext("myTestPackage/appContext.xml");
		
		Fruit myFruit = appContext.getBean("fruit",Fruit.class);
		Fruit myAnotherFruit = appContext.getBean("fruitWithName",Fruit.class);
		Vegetable myVegetable = (Vegetable) appContext.getBean("vegetable");
		Vegetable myOtherVeg = (Vegetable) appContext.getBean("vegWithName");
		
		System.out.println(myFruit.talkAboutYourself());
		System.out.println(myVegetable.talkAboutYourself());
		System.out.println(myAnotherFruit.talkAboutYourself());
		System.out.println(myOtherVeg.talkAboutYourself());
		
		
	}
}
