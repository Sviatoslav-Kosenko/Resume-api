import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.hasItems;
//Checking filter characters key "species Alien"
public class Test14 {
    @Test
    void test14(){
        given()
                .baseUri("https://rickandmortyapi.com")
                .when()
                .get("/api/character/?species=alien")
                .then()
                .statusCode(200)
                .body("results.species", hasItems("Alien"));
    }
}
