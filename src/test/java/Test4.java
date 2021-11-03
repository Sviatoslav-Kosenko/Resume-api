import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;
//Checking key "next"
public class Test4 {
    @Test
    void test4(){
        given().
                baseUri("https://rickandmortyapi.com")
        .when()
                .get("/api/character")
        .then()
                .statusCode(200)
                .body("info.next", equalTo("https://rickandmortyapi.com/api/character?page=2"));

    }
}
