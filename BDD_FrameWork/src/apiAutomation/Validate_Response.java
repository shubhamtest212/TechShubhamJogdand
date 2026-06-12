package apiAutomation;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class Validate_Response {

	public static void main(String[] args) {
		
		Response response = RestAssured.given()
				.when()
				.get("/users/s")
				.then()
				.header("Content-Type", containsString("application/json"));

	}

}
