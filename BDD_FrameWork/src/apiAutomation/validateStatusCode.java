package apiAutomation;

import org.junit.Assert;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class validateStatusCode {

	public static void main(String[] args) {

		Response response = (Response) RestAssured.given().when().get("https://reqres.in/api/users/2").then()
				.statusCode(200);

		// How do you validate multiple status code
		int statusCode = response.getStatusCode();
		Assert.assertTrue(statusCode == 200 || statusCode == 201);

	}

}
