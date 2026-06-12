package Selenium_FrameWork;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class RestAssuredGetMethod1 {

	@Test
	public void getMethod() {

		RestAssured.baseURI = "https://jsonplaceholder.typicode.com"; // This defines the server URL.
		RequestSpecification requestParams = RestAssured.given(); // This creates a request specification that will be
																	// used to send the API request.

		Response resp = httpRequest.get("/users/1");

		System.out.println("response code" + resp.statusCode());
		System.out.println("status line" + resp.getStatusLine());
		System.out.println(resp.prettyPrint());

	}

}
