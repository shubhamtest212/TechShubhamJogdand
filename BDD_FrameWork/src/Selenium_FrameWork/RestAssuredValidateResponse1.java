package Selenium_FrameWork;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.response.ResponseBody;
import io.restassured.specification.RequestSpecification;
import junit.framework.Assert;

public class RestAssuredValidateResponse1 {

	@Test
	public void validateResponse() {

		RestAssured.baseURI = "https://jsonplaceholder.typicode.com";
		RequestSpecification httpRequest = RestAssured.given();
		Response resp = httpRequest.get("/users/1");
		ResponseBody body = resp.getBody();

		String validateResponse = body.toString();

		// Validate name from response body
		Assert.assertEquals(validateResponse.contains("Shubham Jogdand"), true);
		System.out.println("Shubham Jogdand found in response");
	}

}
