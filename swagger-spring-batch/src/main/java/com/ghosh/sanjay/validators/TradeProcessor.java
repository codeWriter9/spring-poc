package com.ghosh.sanjay.validators;

import org.springframework.batch.item.file.transform.FieldSet;
import org.springframework.batch.item.validator.ValidatingItemProcessor;
import org.springframework.batch.item.validator.ValidationException;
import org.springframework.batch.item.validator.Validator;

public class TradeProcessor extends ValidatingItemProcessor<FieldSet> {

	@Override
	public FieldSet process(FieldSet fieldSet) throws ValidationException {

		return fieldSet;
	}

	@Override
	public void setValidator(Validator<? super FieldSet> validator) {
		super.setValidator(validator);
	}

}