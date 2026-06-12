package apiAutomation;

import java.util.HashMap;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class How_will_you_create_this_payload_dynamically_in_RestAssured {

	public static void main(String[] args) {

		HashMap<String, Object> body = new HashMap<>();
		
		body.put("userId", "");
		body.put("platform", "web");
		
		
		Response response = RestAssured.given()
				.contentType("application/json")
				.when()
				.body(body)
				.post("/shipment");

	}

}
