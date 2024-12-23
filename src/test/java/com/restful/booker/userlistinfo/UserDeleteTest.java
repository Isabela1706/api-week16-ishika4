package com.restful.booker.userlistinfo;

import com.restful.booker.testbase.TestBase;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;

public class UserDeleteTest extends TestBase {

    @Test
    public void deleteTheUser(){
        given().log().all()
                .pathParam("bookingid", 858)
                .when()
                .delete("/booking/1")
                .then().log().all()
                .statusCode(200);
    }

}
