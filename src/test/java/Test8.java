import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.hasItems;

//Get multiple characters
public class Test8 {
    @Test
    void test8(){
        given().baseUri("https://rickandmortyapi.com")
                .when()
                .get("/api/character/1,2,3")
                .then()
                .statusCode(200)
                .body("id", hasItems(1,2,3));
    }
}

