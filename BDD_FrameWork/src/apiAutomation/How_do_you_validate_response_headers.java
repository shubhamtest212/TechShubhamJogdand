package apiAutomation;

import org.hamcrest.Matcher;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class How_do_you_validate_response_headers {

	public static void main(String[] args) {

		Response response = RestAssured.given().when().get("https://reqres.in/api/users/2").then()
				.header("Content-Type", containsString("application/json"));

	}

}
