package restAssured;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class GetRequest {

	public static void main(String[] args) {

		Response response = (Response) RestAssured.given().when().get("https://reqres.in/api/users/2").then()
				.statusCode(200);
		System.out.println(response.statusCode());
		System.out.println(response.getBody().asString());

	}

}
