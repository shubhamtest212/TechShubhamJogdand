package apiAutomation;

import java.util.Hashtable;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class PostExample1 {

	public static void main(String[] args) {

		Hashtable<String, Object> body = new Hashtable<>();
		body.put("firstName", "shubham");
		body.put("secondName", "Jogdand");

		Response response = RestAssured.given()
				.contentType("application/json")
				.when()
				.post("https://reqres.in/api/users");
		        response.then().statusCode(201);

	}

}
