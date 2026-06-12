package apiAutomation;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import static org.hamcrest.Matchers.anyOf;
import static org.hamcrest.Matchers.is;

public class Validate_Multiple_Status_Code {

	public static void main(String[] args) {

		Response response = RestAssured.given().contentType("application/json").when()
				.get("https://reqres.in/api/users/2");
		response.then().statusCode(anyOf(is(200), is(201), is(204)));

	}

}
