package com.lhb.controller;

import com.lhb.services.GreetingServiceImpl;

/*
 * Property DI:
 * This way of DI is not at all prefered
 * This is just demo purpose :)
 */

/**
 * @author Lohit Barki
 *
 * lohit.barki15@gmail.com
 */
public class PropertyInjectedController {
	
	public GreetingServiceImpl greetingService;
	
	public String greet() {
		return greetingService.getGreeting();
	}
}