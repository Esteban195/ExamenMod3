import org.junit.Test;

import static org.hamcrest.Matchers.equalTo;

public class status extends BaseTest{

    @Test
    public void Ping_Test(){
        request
                .get(String.format("%sping", RESOURCE))
                .then()
                .statusCode(200)
                .header("Access-Control-Allow-Origin", equalTo("http://localhost"))
                .body("id", equalTo(3),
                        "response", equalTo("pong"));
    }

}
