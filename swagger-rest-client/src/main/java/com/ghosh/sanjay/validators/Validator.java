package com.ghosh.sanjay.validators;

import org.everit.json.schema.Schema;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;

public class Validator {
	
	@Autowired
	private Schema schema;
	
	public void validate(JSONObject json) {
		schema.validate(json);
	}

}