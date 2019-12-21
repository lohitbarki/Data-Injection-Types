package com.lhb.core;

import com.lhb.controller.ConstructorInjectedController;
import com.lhb.controller.PropertyInjectedController;
import com.lhb.controller.SetterInjectedController;
import com.lhb.services.GreetingServiceImpl;


/*
 * This project gives demo on different types of
 * data injection along with JUnit test cases 
 */

/**
 * @author Lohit Barki
 *
 * lohit.barki15@gmail.com
 */
public class DataInjectionTypesSample {

	public static void main(String[] args) {
		
		//Constructor DI 
		
		ConstructorInjectedController consructDI = new ConstructorInjectedController(new GreetingServiceImpl());
		System.out.println(consructDI.greet());
		
		//Setter DI
		
		SetterInjectedController setterDI = new SetterInjectedController();
		setterDI.setGreeting(new GreetingServiceImpl());
		System.out.println(setterDI.greet());
		
		//Property DI
		
		PropertyInjectedController propertyDI = new PropertyInjectedController();
		propertyDI.greetingService = new GreetingServiceImpl();
		System.out.println(propertyDI.greet());
	}

}
