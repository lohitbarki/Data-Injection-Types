package com.lhb.Controller.Test;

import com.lhb.constants.Constants;
import com.lhb.controller.ConstructorInjectedController;
import com.lhb.services.GreetingServiceImpl;

/**
 * @author Lohit Barki
 *
 * lohit.barki15@gmail.com
 */
public class ConstructorInjectedControllerTest {
private ConstructorInjectedController constructorInjectedController;
	
	@Before
	public setUp() throws Exception{
		constructorInjectedController = new ConstructorInjectedController(new GreetingServiceImpl);
	}
	
	@Test
	public void testGreeting() throws Exception{
		assertEquals(Constants.NICEDAY, ConstructorInjectedController.greet());
	}
}
