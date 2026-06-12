package apiAutomation;

import io.restassured.RestAssured;

public class ResponseValidation {

	public static void main(String[] args) {

		RestAssured.given().contentType("application/json").when().get("https://reqres.in/api/users/2\"").then()
				.statusCode(200);

	}

}
