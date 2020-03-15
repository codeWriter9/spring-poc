package com.ghosh.sanjay.processors;

import static java.lang.invoke.MethodHandles.lookup;
import static org.slf4j.LoggerFactory.getLogger;

import org.slf4j.Logger;
import org.springframework.batch.item.validator.ValidatingItemProcessor;
import org.springframework.batch.item.validator.ValidationException;
import org.springframework.batch.item.validator.Validator;

import com.ghosh.sanjay.domain.Trade;

public class TradeProcessor extends ValidatingItemProcessor<Trade> {

	private static Logger LOG = getLogger(lookup().lookupClass());

	@Override
	public Trade process(Trade trade) throws ValidationException {
		LOG.info(" processing " + trade);
		return trade;
	}

	@Override
	public void setValidator(Validator<? super Trade> validator) {
		super.setValidator(validator);
	}

}