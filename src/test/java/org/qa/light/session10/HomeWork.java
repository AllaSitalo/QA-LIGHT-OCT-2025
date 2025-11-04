package org.qa.light.session10;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import org.junit.jupiter.api.Assertions;
import org.testng.annotations.Test;

import java.util.List;

public class HomeWork {
    @Test
    public void restTests() {
        ResponseDto responseDto = RestAssured.given()
                .queryParam("inc", "gender,name,nat,location")
                .queryParam("results", "3")
                .queryParam("noinfo")
                .baseUri("https://randomuser.me/")
                .basePath("/api")
                .get()
                .then()
                .statusCode(200)
                .contentType(ContentType.JSON)
                .extract()
                .as(ResponseDto.class);
        List<PersonDto> results = responseDto.getResults();
        PersonDto firstPerson = results.get(0);

        Assertions.assertNotNull(firstPerson.getLocation().getStreet().getNumber(),"Номер вулиці = Null");
        Assertions.assertNotNull(firstPerson.getLocation().getStreet().getName(),"Назва вулиці = Null");
        System.out.println(firstPerson.getLocation().getStreet());



    }
}
