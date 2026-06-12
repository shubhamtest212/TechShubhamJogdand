package apiAutomation;

import io.restassured.RestAssured;

public class Given {

	public static void main(String[] args) {

		RestAssured.given().contentType("application/json").queryParam("page", 2).auth().basic("admin", "password");

	}

}
