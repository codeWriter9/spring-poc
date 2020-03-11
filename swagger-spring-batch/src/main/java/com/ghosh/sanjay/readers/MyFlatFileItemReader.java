package com.ghosh.sanjay.readers;

import static java.lang.invoke.MethodHandles.lookup;
import static org.slf4j.LoggerFactory.getLogger;

import org.slf4j.Logger;
import org.springframework.batch.item.file.FlatFileItemReader;
import org.springframework.batch.item.file.LineMapper;
import org.springframework.core.io.Resource;

import com.ghosh.sanjay.domain.Trade;

public class MyFlatFileItemReader extends FlatFileItemReader<Trade> {
	
	private static Logger LOG = getLogger(lookup().lookupClass());
	
	public MyFlatFileItemReader() {
		LOG.info(" Flat File  Readers");
	}
	
	@Override
	public void setLineMapper(LineMapper<Trade> lineMapper) {
		LOG.info(" Flat File  Readers >> set Line Mappers ");
		super.setLineMapper(lineMapper);
	}
	
	@Override
	public void setResource(Resource resource) {
		LOG.info(" Flat File  Readers >> set resource");
		super.setResource(resource);
	}

}
