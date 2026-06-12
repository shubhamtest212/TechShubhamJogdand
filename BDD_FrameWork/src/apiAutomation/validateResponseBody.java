package apiAutomation;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class validateResponseBody {

	public static void main(String[] args) {

		try {
			Response response = RestAssured.given().when().get("https://reqres.in/api/users/2").then()
					.body("data.first_name", equals("Shubham"));
		} catch (Exception e) {

			e.printStackTrace();
		}

	}

}
