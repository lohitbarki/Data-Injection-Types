package com.lhb.controller;

import com.lhb.services.GreetingsService;


/*
 * Setter DI:
 * This type of DI is okay but not prefered
 * Better to use Constructor DI
 */

/**
 * @author Lohit Barki
 *
 * lohit.barki15@gmail.com
 */
public class SetterInjectedController {
	
	private GreetingsService greetService;
	
	public String greet() {
		return greetService.getGreeting();
	}
	
	public void setGreeting(GreetingsService greetingsService) {
		this.greetService = greetingsService;
	}
}
