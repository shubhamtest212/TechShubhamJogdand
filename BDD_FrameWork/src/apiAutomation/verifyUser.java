package apiAutomation;

import org.testng.annotations.Test;

import io.restassured.RestAssured;

public class verifyUser {

	@Test
	public void verifyUser2() {

		RestAssured.given().when().get("https://reqres.in/api/users/2").then().statusCode(200);

	}

}
