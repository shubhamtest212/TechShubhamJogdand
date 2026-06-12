package apiAutomation;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class Unauthorized_401 {

	public static void main(String[] args) {

		Response response = RestAssured.given().contentType("application/json")
				.header("Authorization", "Bearer InvalidToken").when().get("https://api.example.com/users");
		response.then().statusCode(401);

	}

}
