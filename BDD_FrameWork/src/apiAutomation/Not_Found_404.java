package apiAutomation;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class Not_Found_404 {

	public static void main(String[] args) {

		Response response = RestAssured.given().contentType("application/json").when()
				.get("https://reqres.in/api/users/9999");
		response.then().statusCode(404);

	}

}
