package cloud.autotests.tests.api;

import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

@Tag("API")
public class GetVacanciesTests {

    @Test
    void getListOfVacancies() {
        given()
                .when()
                .get("https://api.hh.ru/vacancies?employer_id=2716012&per_page=100")
                .then()
                .assertThat().body("per_page", equalTo(100));
    }
}
