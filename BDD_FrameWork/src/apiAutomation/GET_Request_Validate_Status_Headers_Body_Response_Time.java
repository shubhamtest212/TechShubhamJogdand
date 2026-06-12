package apiAutomation;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class GET_Request_Validate_Status_Headers_Body_Response_Time {

	// Write a RestAssured script to validate user details from API.

	@Test
	public void validateUser() {
		
		Response response = RestAssured.given()
				.when()
				.get("https://reqres.in/api/users/2")
				response.then().statusCode(200)
				.header("Content-Type",containsString("application/json"))
				.body("data.id", equals(2))
				.body("data.first_name",equals("Shubham"))
				.body("data.email",containsString("shubhamtest@gmail.com"))
				.time(lessThan(3000L));
		
	}

}
