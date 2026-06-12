package apiAutomation;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class RestAssured_GET_Request1_JAVA {

	public static void main(String[] args) {

		Response response = RestAssured.given().when().get("https://reqres.in/api/users/2");
		response.then().statusCode(200);

	}

}
