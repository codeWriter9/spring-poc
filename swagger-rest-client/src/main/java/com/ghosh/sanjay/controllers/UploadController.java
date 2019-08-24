package com.ghosh.sanjay.controllers;

import static org.springframework.http.HttpStatus.INTERNAL_SERVER_ERROR;
import static org.springframework.http.HttpStatus.OK;
import static org.springframework.http.MediaType.MULTIPART_FORM_DATA_VALUE;

import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;
import java.util.Arrays;
import java.util.Iterator;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.multipart.MultipartFile;

import com.opencsv.CSVReader;
import com.opencsv.CSVReaderBuilder;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;

@RestController
@RequestMapping("/upload")
@Api(value = "Guidelines")
public class UploadController {

	private static Logger LOG = LoggerFactory.getLogger(UploadController.class.getName());
	private Reader reader;

	@Autowired
	private RestTemplate restTemplate;

	@PostMapping
	@ApiOperation(value = "Make a POST request to upload the file", produces = "application/json", consumes = MULTIPART_FORM_DATA_VALUE)
	@ApiResponses(value = { @ApiResponse(code = 200, message = "The POST call is Successful"),
			@ApiResponse(code = 500, message = "The POST call is Failed"),
			@ApiResponse(code = 404, message = "The API could not be found") })

	public ResponseEntity<String> uploadFile(
			@ApiParam(name = "file", value = "Select the file to Upload", required = true) @RequestPart("file") MultipartFile file) {

		try {			
			if (file == null || file.getBytes() == null || file.getBytes().length == 0)
				throw new IOException(" File is empty.  ");
			else 
				reader = new InputStreamReader(file.getInputStream());			
			Iterator<String[]> itr = csvReader().iterator();
			if(itr.hasNext()) {
				LOG.info(Arrays.toString(itr.next()));			}			

		} catch (IOException e) {
			LOG.error(e.getMessage(), e);
			return new ResponseEntity<String>("Failed", INTERNAL_SERVER_ERROR);
		}

		return restTemplate.postForEntity("http://localhost:8000/atlas", json(), String.class);
	}
	
	public CSVReader csvReader() {
		return new CSVReaderBuilder(reader).build();
	}
	
	public String json() {
		return "{parameter:helloWorld}";
	}
}