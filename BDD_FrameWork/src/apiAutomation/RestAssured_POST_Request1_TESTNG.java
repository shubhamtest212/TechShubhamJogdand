package apiAutomation;

import java.util.HashMap;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class RestAssured_POST_Request1_TESTNG {

	@Test
	public void postRequest() {

		HashMap<String, Object> payload = new HashMap<>();
		payload.put("FName", "Shubham");
		payload.put("LName", "Jogdand");
		payload.put("MobileNumber", "8830943206");

		Response response = RestAssured.given().contentType("application/json").body(payload).when()
				.post("https://reqres.in/api/users/");
		response.then().statusCode(201);

	}

}
