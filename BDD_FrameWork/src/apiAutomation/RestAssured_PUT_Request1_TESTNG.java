package apiAutomation;

import java.util.HashMap;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class RestAssured_PUT_Request1_TESTNG {

	@Test
	public void putRequest() {

		HashMap<String, Object> payload = new HashMap<>();
		payload.put("FName", "ShubhamUpdated");
		payload.put("LName", "JogdandUpdated");

		Response response = RestAssured.given().when().put("https://reqres.in/api/users/2");
		response.then().statusCode(200);

	}

}
