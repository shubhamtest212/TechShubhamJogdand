package apiAutomation;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class No_Content_204 {

	public static void main(String[] args) {

		Response response = RestAssured.given().contentType("application/json").when()
				.delete("https://reqres.in/api/users/2");
		response.then().statusCode(204);

	}

}
