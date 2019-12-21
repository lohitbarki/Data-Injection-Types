package com.lhb.Controller.Test;

import com.lhb.constants.Constants;
import com.lhb.controller.PropertyInjectedController;
import com.lhb.services.GreetingServiceImpl;
import org.junit.*;

/**
 * @author Lohit Barki
 *
 * lohit.barki15@gmail.com
 */
public class PropertyInjectedControllerTest {

	private PropertyInjectedController propertyInjcetionController;
	
	@Before
	public setUp() throws Exception{
		
		this.propertyInjcetionController = new PropertyInjectedController();
		propertyInjcetionController.greetingService = new GreetingServiceImpl();
	}
	
	@Test
	public void testGreeting() throws Exception{
		assertEquals(Constants.NICEDAY, propertyInjcetionController.greet());
	}
}
