package apiAutomation;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class GET_Request_Using_HashMap1 {

	public static void main(String[] args) {

		Response response = RestAssured.given().contentType("application/json").when().get("/users/2");
		response.then().statusCode(200);
	}

}
