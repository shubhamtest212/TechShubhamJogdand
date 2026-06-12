package apiAutomation;

import java.util.HashMap;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;

public class How_will_you_handle_dynamic_payload_creation {

	public static void main(String[] args) {

		HashMap<String, Object> payload = new HashMap<>();
		payload.put("name", "shubham");
		payload.put("job", "QAEngineer");

		Response response = RestAssured.given().contentType(ContentType.JSON).body(payload).when()
				.post("https://reqres.in/api/users");

	}

}
