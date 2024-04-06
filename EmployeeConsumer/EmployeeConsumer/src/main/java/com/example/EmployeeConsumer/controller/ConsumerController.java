package com.example.EmployeeConsumer.controller;

import java.io.IOException;

import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestClientException;
import org.springframework.web.client.RestTemplate;

@RestController
public class ConsumerController {
	
	@RequestMapping("/requestEmp")
	public void requestEmp() throws RestClientException, IOException {
		System.out.println("Inside consumer reques emp method");
		String url = "http://localhost:8080/employee";
		RestTemplate restTemplate = new RestTemplate();
		ResponseEntity<String> response = null;
		response = restTemplate.exchange(url, HttpMethod.GET,getHeaders(),String.class);
		System.out.println(response.getBody());
	}
	private static HttpEntity<?> getHeaders() throws IOException
	{
		HttpHeaders headers = new HttpHeaders();
		headers.set("Accept", MediaType.APPLICATION_JSON_VALUE);
		return new HttpEntity<>(headers);
	}

}
