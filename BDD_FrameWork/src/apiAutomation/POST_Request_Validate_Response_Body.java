package apiAutomation;

import java.util.HashMap;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;

public class POST_Request_Validate_Response_Body {

	public static void main(String[] args) {

		// Create a user and validate response.

		HashMap<String, Object> payload = new HashMap<>();

		payload.put("name", "Shubham");
		payload.put("job", "QAEngineer");
		
		Response response = RestAssured.given()
				.contentType(ContentType.JSON)
				.body(payload)
				.when()
				.post("https://reqres.in/api/users")
				response.then()
				.statusCode(201)
				.body("name", equals("Shubham"))
				.body("job",equals("QAEngineer"))
				.body("id", notNullValue())
				.body("createdAt", notNullValue());

	}

}
