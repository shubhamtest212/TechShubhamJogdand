package apiAutomation;

import java.util.HashMap;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class POST_Request_Using_HashMap1 {

	public static void main(String[] args) {

		HashMap<String, Object> body = new HashMap<>();

		body.put("firstName", "Shubham");
		body.put("secondName", "Santosh");
		body.put("lastName", "Jogdand");

		Response response = RestAssured.given().contentType("application/json").when()
				.post("https://reqres.in/api/users/");
		response.then().statusCode(201);

	}

}
