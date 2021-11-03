import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.hasItems;
//Checking filter characters key "species unknown"
public class Test13 {
    @Test
    void test13(){
        given()
                .baseUri("https://rickandmortyapi.com")
                .when()
                .get("/api/character/?species=unknown")
                .then()
                .statusCode(200)
                .body("results.species", hasItems("unknown"));
    }
}
