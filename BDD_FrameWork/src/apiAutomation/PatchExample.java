package apiAutomation;

import java.util.HashMap;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class PatchExample {

	public static void main(String[] args) {

		HashMap<String, Object> body = new HashMap<>();

		body.put("firstName", "ShubhamJogdand");

		Response response = RestAssured.given()

				.contentType("application/json").body(body).when().patch("https://reqres.in/api/users/2");
		response.then().statusCode(200);
		response.getBody();

	}

}
