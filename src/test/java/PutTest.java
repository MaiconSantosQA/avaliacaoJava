

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

import org.example.tribe.core.BaseTest;
import org.json.simple.parser.ParseException;
import org.junit.Test;


public class PutTest extends BaseTest {
	
	static String APP_ROTA_GET_PUT_DELETE = "/users/{user_id}";


	Integer user_id = 5;

	@Test  
	public void test1() throws ParseException {

		given()
		.pathParam("user_id", user_id)
		.body("{\r\n"
                + "    \"email\": \"novoemail@exemplo.com\",\r\n"
                + "    \"address\": {\r\n"
                + "      \"geo\": {\r\n"
                + "        \"lat\": \"99.99999\",\r\n"
                + "        \"lng\": \"88.88888\"\r\n"
                + "      }\r\n"
                + "    }\r\n"
                + "}")
		.when()
			.put(APP_ROTA_GET_PUT_DELETE)
		.then()
			.statusCode(200)
			.body("email", is("novoemail@exemplo.com"))
			.body("address.geo.lat", is("99.99999"))
			.body("address.geo.lng", is("88.88888"))
			.log().all();
	}
}
