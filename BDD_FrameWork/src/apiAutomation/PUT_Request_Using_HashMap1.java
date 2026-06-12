package apiAutomation;

import java.util.HashMap;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class PUT_Request_Using_HashMap1 {

	public static void main(String[] args) {

		HashMap<String, Object> body = new HashMap<>();
		body.put("firstName", "UpdatedShubham");
		body.put("secondName", "SecondSantosh");
		body.put("lastName", "UpdatedJogdand");

		Response response = RestAssured.given().contentType("application/json").when().put("/users/2");
		response.then().statusCode(200);

	}

}
