package Selenium_FrameWork;

import java.util.HashMap;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.response.ResponseBody;
import io.restassured.specification.RequestSpecification;

public class RestAssuredPutMethod1 {

	@Test
	public void putMethod() {

		RestAssured.baseURI = "https://jsonplaceholder.typicode.com";
		RequestSpecification httpRequest = RestAssured.given();

		HashMap<String, String> requestParams = new HashMap<>();

		requestParams.put("firstName", "UpdatedShubham");
		requestParams.put("secondName", "UpdatedSantosh");
		requestParams.put("mobile", "8839393399");

		httpRequest.header("Content-Type", "application/json");

		httpRequest.body(requestParams.toString());

		Response resp = httpRequest.put("/users/1");

		ResponseBody body = resp.body();
	}

}
