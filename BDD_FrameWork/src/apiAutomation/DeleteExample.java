package apiAutomation;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class DeleteExample {

	public static void main(String[] args) {

		Response response = RestAssured.given()
				.when()
				.delete("https://reqres.in/api/users/2");
		         response.then().statusCode(204);

	}

}
