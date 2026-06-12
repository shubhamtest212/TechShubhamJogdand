package apiAutomation;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class API_Chaining {

	public static void main(String[] args) {

		Response response = RestAssured.given()
				.body(payload)
				.when()
				.post("/users/");
		
		int id = response.jsonPath().getInt("id");
		
		response
		.pathParam("id",id)
		.when()
		.get("/users/{id}")
		.then()
		.statusCode(200);
		
		
		
	}
	
	

}
