package apiAutomation;

import java.util.Map;

import org.junit.Assert;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class Dynamic_Response_Validation {

	public static void main(String[] args) {

		Response response = RestAssured.given().when().get("https://reqres.in/api/users/2");

		Map<String, Object> data = response.jsonPath().getMap("data");

		Assert.assertTrue(data.containsKey("id"));
		Assert.assertTrue(data.containsKey("email"));
		Assert.assertTrue(data.containsKey("firstName"));

	}

}
