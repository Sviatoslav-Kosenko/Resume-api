import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.hasItems;
//Checking filter characters key "species" and "Human"
public class Test16 {
    @Test
    void tet16(){
        given()
                .baseUri("https://rickandmortyapi.com")
                .when()
                .get("/api/character/?status=unknown&species=human")
                .then()
                .statusCode(200)
                .body("results.status",hasItems("unknown"))
                .body("results.species", hasItems("Human"));
    }
}
