package com.lhb.Controller.Test;

import static org.junit.*;
import com.lhb.constants.Constants;
import com.lhb.controller.SetterInjectedController;
import com.lhb.services.GreetingServiceImpl;

/**
 * @author Lohit Barki
 *
 * lohit.barki15@gmail.com
 */
public class SetterInjectedControllerTest {
	
	private SetterInjectedController setterInjectedController;
	
	@Before
	public setUp() throws Exception{
		
		this.setterInjectedController = new SetterInjectedController();
		setterInjectedController.setGreeting(new GreetingServiceImpl());
	}
	
	@Test
	public void testGreeting() throws Exception{
		assertEquals(Constants.NICEDAY, setterInjectedController.greet());
	}
}
