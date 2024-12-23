package com.restful.booker.userlistinfo;

import com.restful.booker.testbase.TestBase;
import io.restassured.response.Response;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;

public class UserGetTest extends TestBase {


    @Test
    public void getBookingIds(){
        Response response = given()
                .when()
                .get("/booking/1");
        response.prettyPrint();
        response.then().statusCode(200);

    }

    @Test
    public void getAllBooking(){
        Response response = given()
                .when()
                .get( "/booking");
        response.prettyPrint();
        response.then().statusCode(200);
    }
}
