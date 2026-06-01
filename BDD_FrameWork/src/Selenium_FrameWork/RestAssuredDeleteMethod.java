package Selenium_FrameWork;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class RestAssuredDeleteMethod {

	@Test
	public void deleteMethod() {

		RestAssured.baseURI = "https://jsonplaceholder.typicode.com";
		RequestSpecification httpRequest = RestAssured.given();
		Response resp = httpRequest.delete("/users/1");
		System.out.println("Statuc Code : " + resp.statusCode());
		System.out.println("Status Line : " + resp.statusLine());
		System.out.println("Pretty Print Message : " + resp.prettyPrint());

	}
}
