package com.lhb.controller;

import com.lhb.services.GreetingsService;

/*
 * Constructor DI:
 * Best way of DI and most prefered
 * Since Spring works on Objects init
 */

/**
 * @author Lohit Barki
 *
 * lohit.barki15@gmail.com
 */
public class ConstructorInjectedController {
	
	GreetingsService greetingService;
	
	public ConstructorInjectedController(GreetingsService greetingsService) {
		this.greetingService = greetingsService;
	}

	public String greet() {
		return greetingService.getGreeting();
	}
}
