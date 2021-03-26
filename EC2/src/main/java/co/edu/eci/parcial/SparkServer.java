package co.edu.eci.parcial;

import org.json.JSONObject;
import static spark.Spark.*;

public class SparkServer {

    public static void main(String[] args) {
        port(getPort());
        get("/log", (req, res) -> {
            Double value = Double.parseDouble(req.queryParams("val"));
            if (!(value <= 0)) {
                JSONObject json = new JSONObject();
                json.put("operation", "log");
                json.put("input", value);
                json.put("output", Math.log(value));
                return json;
            }else{
                return "The domain of log(x) is (0, 1].";
            }
        });
        get("/asin", (req, res) -> {
            Double value = Double.parseDouble(req.queryParams("val"));
            if (!(value > 1 || value < -1)) {
                JSONObject json = new JSONObject();
                json.put("operation", "asin");
                json.put("input", value);
                json.put("output", Math.asin(value));
                return json;
            } else {
                return "The domain of arcsin(x) is the range of sin (x) , which is [−1, 1].";
            }
        });
    }

    private static int getPort() {
        if (System.getenv("PORT") != null) {
            return Integer.parseInt(System.getenv("PORT"));
        }
        return 4567;
    }
}
