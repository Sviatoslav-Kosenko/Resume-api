import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.hasItems;
//Checking filter characters key "status alive"
public class Test10 {
    @Test
    void test10(){
        given().baseUri("https://rickandmortyapi.com")
                .when()
                .get("/api/character/?status=alive")
                .then()
                .statusCode(200)
                .body("results.status", hasItems("Alive"));
    }
}
