import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;
//Checking key "prev"
public class Test5 {
    @Test
    void tets5(){
        given()
                .baseUri("https://rickandmortyapi.com")
        .when()
                .get("/api/character")
        .then()
                .statusCode(200)
                .body("info.prev", equalTo(null));
    }
}
