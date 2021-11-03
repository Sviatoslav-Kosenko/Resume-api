import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.hasItems;
//Checking filter characters key "status dead"
public class Test11 {
    @Test
    void test11(){
    given()
            .baseUri("https://rickandmortyapi.com")
    .when()
            .get("/api/character/?status=dead")
    .then()
                        .statusCode(200)
                        .body("results.status", hasItems("Dead"));
    }
}
