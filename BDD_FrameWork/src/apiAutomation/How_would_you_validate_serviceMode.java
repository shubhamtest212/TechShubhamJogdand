package apiAutomation;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class How_would_you_validate_serviceMode {

	public static void main(String[] args) {
		
		Response response = RestAssured.given()
				.body("shipmentDetails.orderDetails[0].awbNumber",equals("TEST09JUNE_04"));

	}

}
