package apiAutomation;

import io.restassured.RestAssured;

public class ValidateJSONResponseBody {

	public static void main(String[] args) {

		RestAssured.given().when().get("https://reqres.in/api/users/2").then().statusCode(200)
				.body("data.id", equals(2)).body("data.firstName", equals("Shubham"));

	}

}
