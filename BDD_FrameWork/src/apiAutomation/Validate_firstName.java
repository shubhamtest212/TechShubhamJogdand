package apiAutomation;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class Validate_firstName {

	public static void main(String[] args) {

		// Direct Validation Using body()

		Response response = RestAssured.given().when().get("https://reqres.in/api/users/2");
		response.then().statusCode(200).body("data.FName", equals("Shubha"));

		System.out.println("First Name validation Successfully Validated");

	}

}
