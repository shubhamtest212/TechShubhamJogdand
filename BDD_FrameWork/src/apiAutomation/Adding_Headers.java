package apiAutomation;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class Adding_Headers {

	public static void main(String[] args) {

		Response response = RestAssured.given()
				.header("Authorization", "Bearer token")
				.header("Content-Type", "application/json")
				.when().get("https://api.example.com/users");
		         response.then().statusCode(200);

	}

}
