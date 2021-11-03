import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;
import static io.restassured.module.jsv.JsonSchemaValidator.matchesJsonSchemaInClasspath;
//Checking JSON Schema
public class Test6 {
    @Test
     public void tets6(){
        given()
                .baseUri("https://rickandmortyapi.com")
        .when()
                .get("/api/character")
        .then()
                .assertThat()
                .body(matchesJsonSchemaInClasspath("schema.json"))
                .statusCode(200);
    }
}
