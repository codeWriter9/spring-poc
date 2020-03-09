package com.ghosh.sanjay.writers;

import static java.lang.invoke.MethodHandles.lookup;
import static org.slf4j.LoggerFactory.getLogger;

import java.util.List;

import org.slf4j.Logger;
import org.springframework.batch.item.ItemStreamSupport;
import org.springframework.batch.item.ItemWriter;

import com.ghosh.sanjay.domain.Trade;

public class TradeWriter extends ItemStreamSupport implements ItemWriter<Trade> {

	private static Logger LOG = getLogger(lookup().lookupClass());

	@Override
	public void write(List<? extends Trade> arg0) throws Exception {
		// TODO Auto-generated method stub

	}

}
