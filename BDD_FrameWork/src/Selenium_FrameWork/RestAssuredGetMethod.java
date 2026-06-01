package Selenium_FrameWork;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class RestAssuredGetMethod {

	@Test
	public void getMethod() {

		RestAssured.baseURI = "https://jsonplaceholder.typicode.com";
		RequestSpecification httpRequest = RestAssured.given();

		Response resp = httpRequest.get("/users/1");
		System.out.println("Status Code : " + resp.statusCode());
		System.out.println("Status Line : " + resp.getStatusLine());
		System.out.println(resp.prettyPrint());

	}

}
