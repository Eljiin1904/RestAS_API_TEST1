import io.cucumber.java.Status;
import io.opentelemetry.api.trace.StatusCode;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.response.ResponseBody;
import io.restassured.response.ResponseOptions;
import io.restassured.specification.RequestSpecification;
import io.cucumber.java.en.Given;
import org.junit.Assert;

import org.testng.annotations.Test;


import java.net.http.HttpRequest;

public class POST_API_Test {


    @Test
    void Post (){

        // GET Employee records | Print API
        Response response;
        response = RestAssured.post("https://dummy.restapiexample.com/api/v1/create");
        RequestSpecification httpRequest = RestAssured.given();
        httpRequest.params("key","name = test");
        System.out.println("Status Code: " + response.getStatusCode());
        System.out.println("Response: " + response.asString());
        System.out.println("Body: " + response.getBody());
       


    }
}
