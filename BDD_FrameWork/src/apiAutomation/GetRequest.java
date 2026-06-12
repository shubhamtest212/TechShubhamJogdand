package apiAutomation;

import io.restassured.RestAssured;

public class GetRequest {

	public static void main(String[] args) {

		RestAssured.given().when().get("https://reqres.in/api/users/2").then().statusCode(200);
	}

}
