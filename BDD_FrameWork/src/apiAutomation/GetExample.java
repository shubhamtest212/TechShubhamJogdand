package apiAutomation;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class GetExample {

	public static void main(String[] args) {

		Response response = RestAssured.given().header("Content-Type", "application/json").when()
				.get("https://reqres.in/api/users/2");

		response.then().statusCode(200);

		System.out.println("status code : " + response.statusCode());
		System.out.println("Response Time : " + response.getTime() + "ms");
		System.out.println("Response body : " + response.getBody());
		System.out.println("Response body : " + response.getBody().prettyPrint());

	}

}
