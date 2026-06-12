package apiAutomation;

import io.restassured.RestAssured;

public class Basic_Authentication {

	public static void main(String[] args) {

		RestAssured.given().auth().basic("admin", "password").when().get("/users");

	}

}
