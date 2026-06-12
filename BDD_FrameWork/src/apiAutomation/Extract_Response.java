package apiAutomation;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class Extract_Response {

	public static void main(String[] args) {

		Response response = RestAssured.given().when().get("https://reqres.in/api/users/2");

		String firstName = response.jsonPath().getString("data.firstName");
		System.out.println(firstName);

	}

}
