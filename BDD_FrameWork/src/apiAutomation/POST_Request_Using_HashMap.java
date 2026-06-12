package apiAutomation;

import java.util.HashMap;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class POST_Request_Using_HashMap {

	public static void main(String[] args) {

		HashMap<String, Object> data = new HashMap<>();

		data.put("name", "Shubham");
		data.put("lastName", "Jogdand");

		Response response = (Response) RestAssured.given().contentType("application/json").body(data).when().post()
				.then().statusCode(201);

	}

}
