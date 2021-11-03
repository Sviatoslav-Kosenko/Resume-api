import org.hamcrest.Matchers;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;
//Checking the key count
public class Test2 {
    @Test
    void test2(){
        given().
                baseUri("https://rickandmortyapi.com")
        .when()
               .get("/api/character")
        .then()
                .statusCode(200)
                .body("info.count", Matchers.equalTo(826));
    }
}

