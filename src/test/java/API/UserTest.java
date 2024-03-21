package API;

import org.junit.Test;
import io.restassured.http.ContentType;

import java.util.List;

import static io.restassured.RestAssured.given;

public class UserTest {

    private final static String Link = "https://reqres.in/";

    @Test
    public void checkIDAvatar(){
        List<UserData> users = given()
                .when()
                .contentType(ContentType.JSON)
                .get(Link +"/api/users?page=2")
                .then().log().all()
                .extract().body().jsonPath().getList("data", UserData.class);

        int i = 0;
        int b = 2;
        int a = 3;
    }
}
