package apiAutomation;

import org.junit.Assert;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class Case_Insensitive_Validation {

	public static void main(String[] args) {

		Response response = RestAssured.given().contentType("application/json").when()
				.get("https://reqres.in/api/users/2\"");

		String actualFirstName = response.jsonPath().getString("data.first_name");

		Assert.assertTrue(actualFirstName.equalsIgnoreCase("Shubham"));

	}

}
