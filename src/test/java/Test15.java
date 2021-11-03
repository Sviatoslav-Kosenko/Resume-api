import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.hasItems;
//Checking filter characters key "species Human"
public class Test15 {
    @Test
    void test15(){
        given()
                .baseUri("https://rickandmortyapi.com")
                .when()
                .get("/api/character/?species=human")
                .then()
                .statusCode(200)
                .body("results.species", hasItems("Human"));
    }
}
