package apiAutomation;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class Authorization_Token {

	public static void main(String[] args) {
		
		Response response = RestAssured.given()
				.when()
				.get("Authorization", "Bearer" + token)
				.when()
				.get("/users")
				.then()
				.statusCode(200);

	}

}
