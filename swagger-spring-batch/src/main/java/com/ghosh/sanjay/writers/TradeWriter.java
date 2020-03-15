package com.ghosh.sanjay.writers;

import java.util.List;

import org.springframework.batch.item.ExecutionContext;
import org.springframework.batch.item.ItemStream;
import org.springframework.batch.item.ItemStreamException;
import org.springframework.batch.item.ItemWriter;

import com.ghosh.sanjay.domain.Trade;

public class TradeWriter implements ItemWriter<Trade>, ItemStream {

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
		
	}
}