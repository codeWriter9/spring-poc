package com.ghosh.sanjay.mappers;

import static java.lang.invoke.MethodHandles.lookup;
import static org.slf4j.LoggerFactory.getLogger;

import org.slf4j.Logger;
import org.springframework.batch.item.file.mapping.FieldSetMapper;
import org.springframework.batch.item.file.transform.FieldSet;
import org.springframework.validation.BindException;

import com.ghosh.sanjay.builders.TradeBuilder;
import com.ghosh.sanjay.domain.Trade;

public class FieldSetToTradeMapper implements FieldSetMapper<Trade> {

	private static Logger LOG = getLogger(lookup().lookupClass());

	@Override
	public Trade mapFieldSet(FieldSet fieldSet) throws BindException {
		LOG.info(" fieldSet " + fieldSet);
		Trade trade = new Trade();	
		trade.setId(fieldSet.readString("Id"));
		trade.setRef(fieldSet.readString("Ref"));
		trade.setTradeDenom(fieldSet.readString("Trade"));
		trade.setSomeThing(fieldSet.readString("SomeThing"));
		//return new TradeBuilder(fieldSet).withId().withRef().withTrade().withSomeThing().get();
		return trade;
	}

}