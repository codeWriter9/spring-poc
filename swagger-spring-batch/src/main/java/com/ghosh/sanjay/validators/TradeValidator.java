package com.ghosh.sanjay.validators;

import static java.lang.invoke.MethodHandles.lookup;
import static org.slf4j.LoggerFactory.getLogger;

import org.slf4j.Logger;
import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

public class TradeValidator implements Validator {
	
	private static Logger LOG = getLogger(lookup().lookupClass());

	@Override
	public boolean supports(Class<?> arg0) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void validate(Object arg0, Errors arg1) {
		// TODO Auto-generated method stub

	}

}
