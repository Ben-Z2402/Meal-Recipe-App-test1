package api;

import java.io.IOException;
import java.util.Arrays;
public class CallAPI {
    private static final String API_URL = "https://api.edamam.com/api/recipes/v2?type=public&app_id=981e8b83&" +
            "app_key=%202fba7f42e263a88f352970997e1158c3&calories=100-1000";

    public static String getApiUrl() {
        return API_URL;
    }

    public static void main(String[] args) {
        RecipeUrl();
    }

    public static JSONObject RecipeUrl() throws JSONException {
        OkHttpClient client = new OkHttpClient().newBuilder()
                .build();
        MediaType mediaType = MediaType.parse("text/plain");
        RequestBody body = RequestBody.create(mediaType, "");
        Request request = new Request.Builder()
                .url("https://api.edamam.com/api/recipes/v2?type=public&app_id=981e8b83&app_key=2fba7f42e263a88f352970997e1158c3")
                .method("GET", body)
                .build();
        Response response = client.newCall(request).execute();
    }
}