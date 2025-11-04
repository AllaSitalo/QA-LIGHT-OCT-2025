package org.qa.light.session9;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;
import org.hamcrest.Matchers;
import org.testng.annotations.Test;

public class HW_API {
    //add location to request
    //Validate that street number and name are not null for 1st person generated
    @Test
    public void restTestsHW() {
        ValidatableResponse r = RestAssured.given()
                .queryParam("inc", "gender,name,nat,location")
                .queryParam("results", "3")
                .queryParam("noinfo")
                .baseUri("https://randomuser.me/")
                .basePath("/api")
                .get()
                .then()
                .statusCode(200)
                .contentType(ContentType.JSON)
                .body("results[0].location.street.number", Matchers.notNullValue())
                .body("results[0].location.street.name", Matchers.notNullValue());

        System.out.println(r.extract().response().prettyPrint());

    }
}
