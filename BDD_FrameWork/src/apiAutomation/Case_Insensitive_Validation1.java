package apiAutomation;

import org.junit.Assert;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class Case_Insensitive_Validation1 {

	public static void main(String[] args) {

		Response response = RestAssured.given().contentType("application/json").when()
				.get("https://reqres.in/api/users/2");

		String actualFName = response.jsonPath().getString("data.firstName");

		Assert.assertTrue(actualFName.equalsIgnoreCase("shubham"));

	}

}
