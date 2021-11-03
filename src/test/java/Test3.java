import org.hamcrest.Matchers;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;
//Checking the number of pages
public class Test3 {
    @Test
    void test3(){
        given().
                baseUri("https://rickandmortyapi.com")
       .when()
            .get("/api/character")
       .then()
            .statusCode(200)
            .body("info.pages", Matchers.equalTo(42));

    }
}
