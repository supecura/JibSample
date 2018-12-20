package spcr.api;

import static com.jayway.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

import org.junit.Test;

import com.jayway.restassured.RestAssured;

public class APITester {

	public APITester() {
		RestAssured.baseURI = "http://172.17.0.2:4567/";
	}

	public void testSample() {
		final String path = "/jib";
		given().get(path).then().body(equalTo("sample"));
	}

	public static void main(String... args) {
		new APITester().testSample();
	}
}
