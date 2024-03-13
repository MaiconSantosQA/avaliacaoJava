

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

import org.example.tribe.core.BaseTest;
import org.json.simple.parser.ParseException;
import org.junit.BeforeClass;
import org.junit.Test;

public class GetTest extends BaseTest {
	
	static String APP_ROTA_GET_PUT_DELETE = "/comments?name={name}";
	
	@Test  
	public void test1() throws ParseException {
		
		String emailEsperado = "Lew@alysha.tv";
	
		given()
		.pathParam("name", "alias odio sit")
		.when()
			.get(APP_ROTA_GET_PUT_DELETE)
		.then()
			.statusCode(200)
			.body("email[0]", is(emailEsperado))
			.log().all();
	}
	
}