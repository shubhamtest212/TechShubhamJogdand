package apiAutomation;

import java.util.HashMap;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class RestAssured_POST_Request1_JAVA {

	public static void main(String[] args) {

		HashMap<String, Object> payload = new HashMap<>();
		payload.put("FName", "Shubham");
		payload.put("LName", "Jogdand");
		payload.put("MobileNumber", "8830943206");

		Response response = RestAssured.given().contentType("application/json").when()
				.post("https://reqres.in/api/users/");
		response.then().statusCode(201);

	}

}
