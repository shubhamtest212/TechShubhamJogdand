package Selenium_FrameWork;

import org.junit.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.response.ResponseBody;
import io.restassured.specification.RequestSpecification;

public class RestAssuredValidateResponse {

	@Test
	public void getMethod() {

		RestAssured.baseURI = "https://jsonplaceholder.typicode.com";
		RequestSpecification httpRequest = RestAssured.given();
		Response resp = httpRequest.get("/users/1");
		ResponseBody body = resp.getBody();
		String validateResponse = body.toString();

		// Validate name from response body
		Assert.assertEquals(validateResponse.contains("Leanne Graham"), true);
		System.out.println("Leanne Graham found in response");

		// Validate status code
		Assert.assertEquals(resp.statusCode(), 200);
		System.out.println("Status Code 200 verified");

	}

}
