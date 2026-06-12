package Selenium_FrameWork;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.specification.RequestSpecification;

public class RestAssuredPOSTMethod {

	@Test
	public void postMethod() {

		RestAssured.baseURI = "https://jsonplaceholder.typicode.com";
		RequestSpecification httpRequest = RestAssured.given();

	}
}
