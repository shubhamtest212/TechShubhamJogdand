package apiAutomation;

import java.util.HashMap;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;

public class PUT_Request_Complete_Update {

	@Test
	public void getRequest() {

		HashMap<String, Object> payload = new HashMap<>();

		payload.put("name", "shubham");
		payload.put("surname", "jogdand");
		
		Response response = RestAssured.given()
				.contentType(ContentType.JSON)
				.body(payload)
				.when()
				.put("https://reqres.in/api/users/2");
				response.then().statusCode(200)
				.body("name", equals("shubham"))
				.body("job", equals("jogdand"));

	}

}
