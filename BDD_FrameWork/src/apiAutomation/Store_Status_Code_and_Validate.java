package apiAutomation;

import org.junit.Assert;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class Store_Status_Code_and_Validate {

	public static void main(String[] args) {

		Response response = RestAssured.given().contentType("application/json").when()
				.get("https://reqres.in/api/users/2");

		int statusCode = response.getStatusCode();
		
		Assert.assertTrue(
				statusCode==200 ||
				statusCode==201 ||
				statusCode==204,
				"Unexpected Status Code	: " +statusCode);


	}

}
