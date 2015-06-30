package totoridipjp4j;

import org.json.JSONObject;

/**
 * @author wakamesoba98
 */
class JSONUtil {
    public JSONObject parse(String json) {
        return new JSONObject(json);
    }
}