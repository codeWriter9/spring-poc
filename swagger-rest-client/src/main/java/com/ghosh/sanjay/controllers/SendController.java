package com.ghosh.sanjay.controllers;

import static org.springframework.http.HttpStatus.BAD_REQUEST;
import static org.springframework.http.HttpStatus.INTERNAL_SERVER_ERROR;
import static org.springframework.http.MediaType.APPLICATION_JSON_VALUE;

import java.lang.invoke.MethodHandles;

import org.json.JSONException;
import org.json.JSONObject;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestClientException;
import org.springframework.web.client.RestTemplate;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;

/**
 * 
 * 
 * 
 * @author Sanjay Ghosh
 *
 */
@RestController
@RequestMapping("/send")
@Api(value = "Guidelines")
public class SendController {

	private static Logger LOG = LoggerFactory.getLogger(MethodHandles.lookup().lookupClass());

	@Autowired
	private RestTemplate restTemplate;
	
	@Autowired
	private String url;

	/**
	 * 
	 * 
	 * 
	 * @param file
	 * @return ResponseEntity<String>
	 */
	@PostMapping
	@ApiOperation(value = "Make a POST request to upload the file", produces = "application/json", consumes = APPLICATION_JSON_VALUE)
	@ApiResponses(value = { @ApiResponse(code = 200, message = "The POST call is Successful"),
			@ApiResponse(code = 500, message = "The POST call has Failed"),
			@ApiResponse(code = 404, message = "The API could not be found") })
	public ResponseEntity<String> sendName(
			@ApiParam(name = "name", value = "Enter You Name", required = true) @RequestParam("name") String name) {
		String json = "";
		ResponseEntity<String> response = null;
		try {
			json = name(name);
			response = restTemplate.exchange(url, HttpMethod.POST,
					new HttpEntity<String>(json), String.class);
		} catch (RestClientException e) {
			LOG.error(e.getMessage(), e);
			return new ResponseEntity<String>("Failed", INTERNAL_SERVER_ERROR);
		} catch (JSONException e) {
			LOG.error(e.getMessage(), e);
			return new ResponseEntity<String>("Failed", BAD_REQUEST);
		}
		return response;
	}

	/**
	 * 
	 * 
	 * @param name
	 * @return
	 * @throws JSONException
	 */
	public String name(String name) throws JSONException {
		JSONObject object = new JSONObject();
		object.put("name", name);
		return object.toString();
	}
}