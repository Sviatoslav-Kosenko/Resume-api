import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;
//Get a single character
public class Test7 {
    @Test
    void test7(){
        given().baseUri("https://rickandmortyapi.com")
                .when()
                .get("/api/character/2")
                .then()
                .statusCode(200)
                .body("id", equalTo(2));
    }
}
