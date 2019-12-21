package com.lhb.services;

import com.lhb.constants.Constants;

/**
 * @author Lohit Barki
 *
 * lohit.barki15@gmail.com
 */
public class GreetingServiceImpl implements GreetingsService{

	@Override
	public String getGreeting() {
		return Constants.NICEDAY;
	}

}
