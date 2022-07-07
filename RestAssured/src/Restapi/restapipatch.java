package Restapi;

import org.json.simple.JSONObject;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class restapipatch {
	public static void main(String[] args) {
		RestAssured.baseURI="https://reqres.in/";
		RequestSpecification a=new RestAssured().given();
	    Response b=a.request(Method.DELETE, "api/users/2");
	    System.out.println(b.asString());
	    System.out.println(b.statusCode());

	}
	}


