package apiAutomation;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class Retry_Request {

	public static void main(String[] args) {

		Response response = RestAssured.given().header("Authorization", "Bearer", +token).when().get("/users");

		if (response.getStatusCode() == 401) {

			token = TokenManager.getToken();

			response = given().header("Authorization", "Bearer" + token).when().get("/users");
		}

	}

}
