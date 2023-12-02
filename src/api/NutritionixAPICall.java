package api;

import okhttp3.*;
import org.json.JSONArray;
import org.json.JSONObject;

import java.io.IOException;

public class NutritionixAPICall {
    public static void main(String[] args) throws IOException {
        NutritionixAPICall apicall = new NutritionixAPICall();
        System.out.println(apicall.caloriesBurned("swim for 1 day"));
    }

    public int caloriesBurned(String exercisePerformed) throws IOException {
        try{
            OkHttpClient client = new OkHttpClient();

//            String exerciseDuration = exerciseName + " for " + String.valueOf(minutesPerformed) + " minutes";
            MediaType mediaType = MediaType.parse("application/json");
            RequestBody body = RequestBody.create(mediaType, "{\n  \"query\": \"" + exercisePerformed + "\"\n}");
            Request request = new Request.Builder()
                    .url("https://trackapi.nutritionix.com/v2/natural/exercise")
                    .post(body)
                    .addHeader("content-type", "application/json")
                    .addHeader("x-app-id", "a850fd03")
                    .addHeader("x-app-key", "67f8395ca094e8e9fdeee99729678c18")
                    .build();

            Response response = client.newCall(request).execute();

            // This is the staring representation of the response body (looks exactly like a JSON file).
            String responseBody = response.body().string();
            JSONObject JSONResponseBody = new JSONObject(responseBody);
            JSONArray exerciseInfo = JSONResponseBody.getJSONArray("exercises");
            return exerciseInfo.getJSONObject(0).getInt("nf_calories");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
