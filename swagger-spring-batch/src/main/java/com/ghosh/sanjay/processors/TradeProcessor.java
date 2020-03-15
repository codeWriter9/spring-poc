package com.ghosh.sanjay.processors;

import static java.lang.invoke.MethodHandles.lookup;
import static org.slf4j.LoggerFactory.getLogger;

import org.slf4j.Logger;
import org.springframework.batch.item.file.transform.FieldSet;
import org.springframework.batch.item.validator.ValidatingItemProcessor;
import org.springframework.batch.item.validator.ValidationException;
import org.springframework.batch.item.validator.Validator;

public class TradeProcessor extends ValidatingItemProcessor<FieldSet> {
	
	private static Logger LOG = getLogger(lookup().lookupClass());

	@Override
	public FieldSet process(FieldSet fieldSet) throws ValidationException {
		LOG.info(" processing " + fieldSet);
		return fieldSet;
	}

	@Override
	public void setValidator(Validator<? super FieldSet> validator) {
		super.setValidator(validator);
	}

}