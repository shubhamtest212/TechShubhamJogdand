package apiAutomation;

import static org.hamcrest.Matchers.equalTo;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class Validate_Status_Code_and_Response {

	public static void main(String[] args) {
		
		Response response = RestAssured.given()
				.when()
				.get("https://reqres.in/api/users/2");
				response.then().statusCode(200)
				.body("data.fName", equalTo("shubham"))
				.body("data.lName", equalTo("Jogdand"));
				
				System.out.println(response.prettyPrint());
				

	}

}
