package com.ghosh.sanjay.handlers;

import static java.lang.invoke.MethodHandles.lookup;
import static org.slf4j.LoggerFactory.getLogger;

import java.io.File;

import org.slf4j.Logger;

public class FileCopyHandler {

	private static Logger LOG = getLogger(lookup().lookupClass());

	public String handleString(String input) {
		LOG.info("Copying text: " + input);
		return input.toUpperCase();
	}

	public File handleFile(File input) {
		LOG.info("Copying file: " + input.getAbsolutePath());
		return input;
	}

	public byte[] handleBytes(byte[] input) {
		LOG.info("Copying " + input.length + " bytes ...");
		return new String(input).toUpperCase().getBytes();
	}

}