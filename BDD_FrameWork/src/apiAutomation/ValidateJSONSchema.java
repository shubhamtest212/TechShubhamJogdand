package apiAutomation;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class ValidateJSONSchema {

	public static void main(String[] args) {
		
		Response response = RestAssured.given()
				.when()
				.get("/users/2")
				.then()
				.assertThat()
				.body(matchesJsonSchemaInClasspath("schema.json"));

	}

}
