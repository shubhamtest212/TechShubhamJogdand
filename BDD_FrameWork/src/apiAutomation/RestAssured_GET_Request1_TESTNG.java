package apiAutomation;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class RestAssured_GET_Request1_TESTNG {

	@Test
	public void getRequest() {
		Response response = RestAssured.given().contentType("application/json").when()
				.get("https://reqres.in/api/users/2");
		response.then().statusCode(200);

	}
}
