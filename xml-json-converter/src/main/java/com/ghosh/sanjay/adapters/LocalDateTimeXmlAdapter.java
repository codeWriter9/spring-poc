package com.ghosh.sanjay.adapters;

import static java.time.LocalDateTime.parse;

import java.time.LocalDateTime;

import javax.xml.bind.annotation.adapters.XmlAdapter;

public class LocalDateTimeXmlAdapter extends XmlAdapter<String, LocalDateTime> {
	
	@Override
	public LocalDateTime unmarshal(String str) throws Exception {
		return parse(str);
	}

	@Override
	public String marshal(LocalDateTime localDateTime) throws Exception {
		return localDateTime.toString();
	}

}
