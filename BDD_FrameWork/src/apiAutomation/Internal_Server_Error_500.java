package apiAutomation;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class Internal_Server_Error_500 {

	public static void main(String[] args) {

		Response response = RestAssured.given().contentType("application/json").when()
				.get("https://api.example.com/internal-error");
		response.then().statusCode(500);

	}

}
