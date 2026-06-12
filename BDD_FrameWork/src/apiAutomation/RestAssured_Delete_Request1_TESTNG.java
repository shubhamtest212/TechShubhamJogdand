package apiAutomation;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class RestAssured_Delete_Request1_TESTNG {

	@Test
	public void deleteRequest() {

		Response response = RestAssured.given().contentType("application/json").when()
				.delete("https://reqres.in/api/users/2");
		response.then().statusCode(204);

	}

}
