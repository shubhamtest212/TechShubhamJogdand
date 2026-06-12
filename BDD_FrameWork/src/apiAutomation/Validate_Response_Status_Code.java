package apiAutomation;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class Validate_Response_Status_Code {

	public static void main(String[] args) {

		Response response = RestAssured.given().contentType("application/json").when().get("/users");
		response.then().statusCode(200);

	}

}
