package com.ghosh.sanjay.validators;

import org.springframework.batch.item.file.transform.FieldSet;
import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

public class TradeValidator implements Validator {

	@Override
	public boolean supports(Class<?> trade) {		
		return FieldSet.class.equals(trade);
	}

	@Override
	public void validate(Object arg0, Errors arg1) {

	}
}