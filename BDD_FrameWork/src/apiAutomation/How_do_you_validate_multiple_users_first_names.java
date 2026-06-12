package apiAutomation;

import java.util.List;

import org.junit.Assert;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class How_do_you_validate_multiple_users_first_names {

	public static void main(String[] args) {

		Response response = RestAssured.given().contentType("application/json").when()
				.get("https://reqres.in/api/users/2");

		List<String> firstNames = response.jsonPath().getList("data.first_name");

		Assert.assertTrue(firstNames.contains("Shubham"));

	}

}
