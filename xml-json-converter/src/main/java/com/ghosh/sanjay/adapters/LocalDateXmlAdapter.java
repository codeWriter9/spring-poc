package com.ghosh.sanjay.adapters;

import java.time.LocalDate;

import javax.xml.bind.annotation.adapters.XmlAdapter;

import static java.time.LocalDate.parse;

public class LocalDateXmlAdapter extends XmlAdapter<String, LocalDate> {

	@Override
	public LocalDate unmarshal(String str) throws Exception {
		return parse(str);
	}

	@Override
	public String marshal(LocalDate localDate) throws Exception {
		return localDate.toString();
	}
	
}