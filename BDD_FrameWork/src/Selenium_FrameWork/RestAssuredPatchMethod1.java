package Selenium_FrameWork;

import java.util.HashMap;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.response.ResponseBody;
import io.restassured.specification.RequestSpecification;

public class RestAssuredPatchMethod1 {

	@Test
	public void patchMethod() {

		RestAssured.baseURI = "https://jsonplaceholder.typicode.com";
		RequestSpecification httpRequest = RestAssured.given();

		HashMap<String, String> requestParams = new HashMap<>();

		requestParams.put("mobileNumber", "9921716454");

		httpRequest.header("Content-Type", "application/json");

		Response resp = httpRequest.patch("/users/1");

		System.out.println("status code" + resp.statusCode());
		System.out.println("statusLine" + resp.statusLine());

		ResponseBody body = resp.getBody();
	}

}
