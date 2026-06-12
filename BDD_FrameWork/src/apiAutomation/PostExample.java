package apiAutomation;

import java.util.HashMap;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class PostExample {

	public static void main(String[] args) {

		HashMap<String, Object> body = new HashMap<>();

		body.put("firstName", "Shubham");
		body.put("lastName", "Jogdand");
		body.put("mobileNumber", "8830943206");
		
		Response response = RestAssured.given()
				.contentType("application/json")
				.body(body)
				.when().post("https://reqres.in/api/users");
				response.then().statusCode(201);
	}

}
	