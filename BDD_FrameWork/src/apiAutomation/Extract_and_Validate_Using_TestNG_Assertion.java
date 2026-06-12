package apiAutomation;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import junit.framework.Assert;

public class Extract_and_Validate_Using_TestNG_Assertion {

	public static void main(String[] args) {

		Response response = RestAssured.given().when().get("https://reqres.in/api/users/2");

		String actualFirstName = response.jsonPath().getString("data.firstName");

		Assert.assertEquals(actualFirstName, "Shubham");

		System.out.println("Validation Passed");

	}

}
