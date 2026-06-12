package apiAutomation;

import java.util.HashMap;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;

public class How_do_you_perform_a_POST_request {

	public static void main(String[] args) {

		HashMap<String, Object> payload = new HashMap<>();
		payload.put("FName", "Shubham");
		payload.put("SName", "Santosh");
		payload.put("LName", "Jogdand");

		System.out.println(payload.size());

		Response response = RestAssured.given().contentType(ContentType.JSON).body(payload).when()
				.post("https://reqres.in/api/users");
		response.then().statusCode(201);

	}

}
