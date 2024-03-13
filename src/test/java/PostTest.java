

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

import org.example.tribe.core.BaseTest;
import org.junit.Test;

public class PostTest extends BaseTest {
	

	static String APP_ROTA_POST = "/users";
	
    @Test
    public void test1() {
        given()
            .body("{\r\n"
                    + "    \"name\": \"Leanne Graham\",\r\n"
                    + "    \"username\": \"Bret\",\r\n"
                    + "    \"email\": \"Sincere@april.biz\",\r\n"
                    + "    \"address\": {\r\n"
                    + "      \"street\": \"Kulas Light\",\r\n"
                    + "      \"suite\": \"Apt. 556\",\r\n"
                    + "      \"city\": \"Gwenborough\",\r\n"
                    + "      \"zipcode\": \"92998-3874\",\r\n"
                    + "      \"geo\": {\r\n"
                    + "        \"lat\": \"-37.3159\",\r\n"
                    + "        \"lng\": \"81.1496\"\r\n"
                    + "      }\r\n"
                    + "    },\r\n"
                    + "    \"phone\": \"1-770-736-8031 x56442\",\r\n"
                    + "    \"website\": \"hildegard.org\",\r\n"
                    + "    \"company\": {\r\n"
                    + "      \"name\": \"Romaguera-Crona\",\r\n"
                    + "      \"catchPhrase\": \"Multi-layered client-server neural-net\",\r\n"
                    + "      \"bs\": \"harness real-time e-markets\"\r\n"
                    + "    }\r\n"
                    + "}")
        .when()
            .post(APP_ROTA_POST)
        .then()
            .statusCode(201)
            .body("id", is(notNullValue()))
            .log().all();
    }
}
