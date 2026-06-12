package apiAutomation;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class Get_Request {

	public static void main(String[] args) {

		Response response = RestAssured.given().when().get("https://reqres.in/api/users/2");

		System.out.println("Status code : " + response.getStatusCode());
		System.out.println("Response Body : " + response.getBody());

	}

}

// For API Automation interviews, you should know this standard syntax:
