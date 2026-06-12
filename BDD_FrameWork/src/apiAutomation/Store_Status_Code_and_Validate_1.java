package apiAutomation;

import org.junit.Assert;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class Store_Status_Code_and_Validate_1 {

	public static void main(String[] args) {
		
		Response response = RestAssured.given()
				.when()
				.get("https://reqres.in/api/users/2");
		
		Switch(response.getStatusCode());
		
		
		case 200;
		System.out.println("Success");
		break;
		
		case 201;
		System.out.println("Resource Created");
		break;
		
		case 204;
		System.out.println("No Content");
		break;
		
		default;
		Assert.fail("Unexpected Status Code : " + response.getStatusCode());

	}

}
