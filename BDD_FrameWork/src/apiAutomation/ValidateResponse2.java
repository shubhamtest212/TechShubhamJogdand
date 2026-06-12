package apiAutomation;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class ValidateResponse2 {

	public static void main(String[] args) {

		Response response = RestAssured.given().when().get("/users/2");

		String firstName = response.jsonPath().getString("data.first_name");

		System.out.println(firstName);

	}

}
