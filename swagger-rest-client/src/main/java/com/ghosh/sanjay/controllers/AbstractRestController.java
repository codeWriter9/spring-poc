package com.ghosh.sanjay.controllers;

import static org.springframework.http.HttpStatus.INTERNAL_SERVER_ERROR;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

public abstract class AbstractRestController {

	protected ResponseEntity<String> internalServerError(String message) {
		return new ResponseEntity<String>(message, INTERNAL_SERVER_ERROR);
	}
	
	protected ResponseEntity<String> badRequest(String message) {
		return new ResponseEntity<String>(message, HttpStatus.BAD_REQUEST);
	}
}