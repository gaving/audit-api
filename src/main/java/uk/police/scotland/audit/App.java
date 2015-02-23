package uk.police.scotland.audit;

import static spark.Spark.*;
import org.json.*;

public class App {
    public static void main(String[] args) {
        get("/audit", (req, res) -> "Fetch audit records");
        post("/audit", (req, res) -> {
            JSONObject o = new JSONObject(req.body());
            return o; 
        });
    }
}
