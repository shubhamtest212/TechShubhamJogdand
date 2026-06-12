package apiAutomation;

import java.util.HashMap;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class PutExample {

	public static void main(String[] args) {

		HashMap<String, Object> body = new HashMap<>();

		body.put("firstName", "UpdatedShubham");
		body.put("lastName", "UpdatedJogdand");
		body.put("mobileNumber", "8830943201");

		Response response = RestAssured.given()
				.contentType("application/json")
				.body(body)
				.when()
				.put("https://reqres.in/api/users/2");
		         response.then().statusCode(200);

	}

}
