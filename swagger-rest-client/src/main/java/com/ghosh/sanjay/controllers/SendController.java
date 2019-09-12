package com.ghosh.sanjay.controllers;

import static org.springframework.http.MediaType.APPLICATION_JSON_VALUE;

import org.json.JSONException;
import org.json.JSONObject;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;

@RestController
@RequestMapping("/send")
@Api(value = "Guidelines")
public class SendController {

	private static Logger LOG = LoggerFactory.getLogger(SendController.class.getName());

	@Autowired
	private RestTemplate restTemplate;

	/**
	 * 
	 * 
	 * 
	 * @param file
	 * @return
	 */
	@PostMapping
	@ApiOperation(value = "Make a POST request to upload the file", produces = "application/json", consumes = APPLICATION_JSON_VALUE)
	@ApiResponses(value = { @ApiResponse(code = 200, message = "The POST call is Successful"),
			@ApiResponse(code = 500, message = "The POST call has Failed"),
			@ApiResponse(code = 404, message = "The API could not be found") })
	public ResponseEntity<String> sendName(
			@ApiParam(name = "name", value = "Enter You Name", required = true) @RequestParam("name") String name) {
		String json = "";
		try {
			json = name(name);
		} catch (JSONException e) {
			LOG.error(e.getMessage(), e);
			return new ResponseEntity<String>("Failed", HttpStatus.BAD_REQUEST);
		}
		return restTemplate.postForEntity("http://localhost:8000/atlas", json, String.class);
	}
	
	public String name(String name) throws JSONException {
		JSONObject object = new JSONObject();
		object.put("name", name);
		return object.toString();
	}

}