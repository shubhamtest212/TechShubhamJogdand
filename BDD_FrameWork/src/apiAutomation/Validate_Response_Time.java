package apiAutomation;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class Validate_Response_Time {

	public static void main(String[] args) {
		
		Response response = RestAssured.given()
				.when()
				.get("/users")
				.then()
				.time(lessThan(3000l));

	}

}
