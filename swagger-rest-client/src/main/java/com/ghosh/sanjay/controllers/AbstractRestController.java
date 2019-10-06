package com.ghosh.sanjay.controllers;

import static java.lang.invoke.MethodHandles.lookup;
import static org.slf4j.LoggerFactory.getLogger;
import static org.springframework.http.HttpStatus.INTERNAL_SERVER_ERROR;

import org.slf4j.Logger;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

public abstract class AbstractRestController {

	private static Logger LOG = getLogger(lookup().lookupClass());

	protected ResponseEntity<String> internalServerError(String message) {
		return new ResponseEntity<String>(message, INTERNAL_SERVER_ERROR);
	}

	protected ResponseEntity<String> badRequest(String message) {
		return new ResponseEntity<String>(message, HttpStatus.BAD_REQUEST);
	}
}