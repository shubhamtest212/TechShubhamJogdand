package apiAutomation;

import java.util.HashMap;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class Dynamic_Payload_Request {

	public static void main(String[] args) {

		HashMap<String, Object> body = new HashMap<>();

		body.put("firstName", "Shubham");
		body.put("lastName", "Jogdand");
		body.put("email", "Shubham" + System.currentTimeMillis() + "@gmail.com");
		
		
		Response response = RestAssured.given()
				.contentType("application/json")
				.body(body)
				.when()
				.post("/users");
		
		

	}

}
