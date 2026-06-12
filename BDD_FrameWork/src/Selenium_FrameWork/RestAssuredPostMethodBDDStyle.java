//package Selenium_FrameWork;
//
//import org.testng.annotations.Test;
//import io.restassured.http.ContentType;
//import static io.restassured.RestAssured.given;
//
//public class RestAssuredPostMethodBDDStyle {
//
//	@Test
//	public void postMethod() {
//		
//		JSONObject body = new JSONObject();
//		.put("firstName","Shubham");
//		.put("lastName","Jogdand");
//		.put("email","shubhamjogdand253@gmail.com");
//		.put("mobile","8830943206");
//		
//		given() 
//		.baseUri("https://jsonplaceholder.typicode.com")
//		.contentType(ContentType.JSON)
//		.body(body.toString())
//		
//		.when() 
//		.post("/users")
//		
//		.then() 
//		.statusCode(201)
//		.log().all();
//			
//		}
//}
