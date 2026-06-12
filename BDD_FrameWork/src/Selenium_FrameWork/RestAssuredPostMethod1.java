package Selenium_FrameWork;

import java.util.HashMap;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.response.ResponseBody;
import io.restassured.specification.RequestSpecification;

public class RestAssuredPostMethod1 {

	@Test
	public void postMethod() {

		// base uri
		RestAssured.baseURI = "https://jsonplaceholder.typicode.com";

		// Request Object
		RequestSpecification httpRequest = RestAssured.given();

		// create request json body
		HashMap<String, String> requestParams = new HashMap<>();

		requestParams.put("firstName", "Shubham");
		requestParams.put("secondName", "Santosh");
		requestParams.put("lastName", "Jogdand");
		requestParams.put("mobileNumber", "8830943206");

		// add header
		httpRequest.header("Content-Type", "application/json");

		// add json body
		httpRequest.body(requestParams.toString());

		// send POST request
		Response resp = httpRequest.post("/users");

		// print status code
		System.out.println("status coe" + resp.statusCode());

		// get response body
		ResponseBody body = resp.body();

		// print response
		System.out.println("body as string" + body.asString());

		// pretty print body
		System.out.println("pretty print body" + body.prettyPrint());

	}
}
