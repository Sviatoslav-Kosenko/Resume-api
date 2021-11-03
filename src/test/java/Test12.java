import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.hasItems;
//Checking filter characters key "status unknown"
public class Test12 {
    @Test
    void test12(){
        given()
                .baseUri("https://rickandmortyapi.com")
        .when()
                .get("/api/character/?status=unknown")
        .then()
                .statusCode(200)
                .body("results.status", hasItems("unknown"));
    }
}
