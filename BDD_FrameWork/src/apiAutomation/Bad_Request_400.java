package apiAutomation;

import java.util.HashMap;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class Bad_Request_400 {

	public static void main(String[] args) {

		HashMap<String, Object> body = new HashMap<>();
		body.put("firstName", "Shubham");

		Response response = RestAssured.given().contentType("application/json").body(body).when()
				.post("https://api.example.com/users");
		response.then().statusCode(400).body("message", equals("Name is required"));
	}

}
