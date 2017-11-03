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
		Vegetable myWegetable = (Vegetable) appContext.getBean("vegetable");
		
		System.out.println(myFruit.talkAboutYourself());
		System.out.println(myWegetable.talkAboutYourself());
		
	}
}
