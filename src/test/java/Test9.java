import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.hasItems;
//Filter characters key "name"
public class Test9 {
    @Test
    void test9(){
        given().baseUri("https://rickandmortyapi.com")
                .when()
                .get("/api/character/?name=rick")
                .then()
                .statusCode(200)
                .body("results.name", hasItems("Rick Sanchez"));
    }
}
