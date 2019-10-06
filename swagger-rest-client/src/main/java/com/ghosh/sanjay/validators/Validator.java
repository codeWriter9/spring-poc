package com.ghosh.sanjay.validators;

import static java.lang.invoke.MethodHandles.lookup;
import static org.slf4j.LoggerFactory.getLogger;

import org.everit.json.schema.Schema;
import org.json.JSONObject;
import org.slf4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;

public class Validator {

	private static Logger LOG = getLogger(lookup().lookupClass());

	@Autowired
	private Schema schema;

	public void validate(JSONObject json) {
		schema.validate(json);
	}
}