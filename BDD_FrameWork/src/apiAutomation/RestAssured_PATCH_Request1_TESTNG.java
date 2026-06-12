package apiAutomation;

import java.util.HashMap;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class RestAssured_PATCH_Request1_TESTNG {

	@Test
	public void patchRequest() {

		HashMap<String, Object> payload = new HashMap<>();
		payload.put("FName", "UpdatedShubham");

		Response response = RestAssured.given().when().patch("https://reqres.in/api/users/2");
		response.then().statusCode(200);

	}

}
