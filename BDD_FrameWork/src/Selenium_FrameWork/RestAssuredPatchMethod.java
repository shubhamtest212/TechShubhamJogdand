package Selenium_FrameWork;

import java.util.HashMap;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.response.ResponseBody;
import io.restassured.specification.RequestSpecification;

public class RestAssuredPatchMethod {
	
	@Test
	public void postMethod() throws Exception {

		// Base URI
		RestAssured.baseURI = "https://jsonplaceholder.typicode.com";

		// Request object
		RequestSpecification httpRequest = RestAssured.given();

		// Create JSON request body
		HashMap<String, String> requestParams = new HashMap<>();

		requestParams.put("mobile", "8899009988");

		// Add header
		httpRequest.header("Content-Type", "application/json");

		// Add JSON body
		httpRequest.body(requestParams.toString());

		// Send POST request
		Response resp = httpRequest.patch("/users/1");

		// Print status code
		System.out.println("Status Code : " + resp.statusCode());

		// Get response body
		ResponseBody body = resp.getBody();

		// Print response
		System.out.println("Body as String : " + body.asString());

		// Pretty print response
		System.out.println("Pretty Body : ");
		body.prettyPrint();
	}
}

