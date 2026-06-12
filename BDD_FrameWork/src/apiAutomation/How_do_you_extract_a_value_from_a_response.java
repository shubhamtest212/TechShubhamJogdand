package apiAutomation;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class How_do_you_extract_a_value_from_a_response {

	public static void main(String[] args) {

		Response response = RestAssured.given().when().get("https://reqres.in/api/users/2");

		String firstName = response.jsonPath().getString("data.firstName");

		System.out.println(firstName);

	}

}


// This API RestAssured code is used to extract response