import static io.restassured.RestAssured.get;
import static io.restassured.RestAssured.*;
import static org.hamcrest.CoreMatchers.equalTo;


import io.restassured.http.ContentType;
import io.restassured.response.Response;
import org.json.JSONArray;
import org.json.JSONException;
import org.testng.Assert;
import org.testng.annotations.Test;


public class RestAssuredTestArticle {

    @Test
    public void shouldGetLuke() {
Response response1 =
        given()
        .log().all()
        .when()
        .get("https://reqres.in/api/users?page=2")
        .then()
        .log().all()
        .statusCode(200)
        .body("headers.Connection", equalTo("close"))
        .body("args.a",equalTo("1"))
        .extract().response();
response1.getBody().print();
    }

    @Test(description = "GET")
    public void getRequestExampleTest() throws JSONException {
        Response response = get("http://restcountries.eu/rest/v1/name/russia");
        JSONArray jsonResponse = new JSONArray(response.asString());
        String capital = jsonResponse.getJSONObject(0).getString("capital");
        Assert.assertEquals(capital, "Moscow");
    }

}
