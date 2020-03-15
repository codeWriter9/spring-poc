package com.ghosh.sanjay.writers;

import static java.lang.invoke.MethodHandles.lookup;
import static org.slf4j.LoggerFactory.getLogger;

import java.util.List;

import org.slf4j.Logger;
import org.springframework.batch.item.ExecutionContext;
import org.springframework.batch.item.ItemStream;
import org.springframework.batch.item.ItemStreamException;
import org.springframework.batch.item.ItemWriter;

import com.ghosh.sanjay.domain.Trade;

public class TradeWriter implements ItemWriter<Trade>, ItemStream {
	
	private static Logger LOG = getLogger(lookup().lookupClass());

	@Override
	public void close() throws ItemStreamException {	

	}

	@Override
	public void open(ExecutionContext arg0) throws ItemStreamException {		

	}

	@Override
	public void update(ExecutionContext arg0) throws ItemStreamException {		

	}
	
	@Override
	public void write(List<? extends Trade> arg0) throws Exception {		
		LOG.info(" writing " + arg0);
	}
}