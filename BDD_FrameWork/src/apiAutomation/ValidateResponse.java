package apiAutomation;

import static org.hamcrest.Matchers.equalTo;
import io.restassured.RestAssured;

public class ValidateResponse {

	public static void main(String[] args) {
		
		RestAssured.given()
		.when()
		.get("https://reqres.in/api/users/2")
		.then()
		.statusCode(200)
		.body("data.first_name", equals("Shubham"));

	}

}
