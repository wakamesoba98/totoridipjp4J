package totoridipjp4j;

import org.json.JSONObject;

/**
 * @author wakamesoba98
 */
final class TopImgJSONImpl implements TopImg {
    private static final String ID = "id";
    private static final String URL = "url";

    private String id, url;

    public TopImgJSONImpl(String json) {
        JSONUtil util = new JSONUtil();
        JSONObject obj = util.parse(json);
        if (obj.has(ID)) {
            id = obj.getString(ID);
        }
        if (obj.has(URL)) {
            url = obj.getString(URL);
        }
    }

    public String getId() {
        return id;
    }

    public String getUrl() {
        return url;
    }

    @Override
    public String toString() {
        return "TopImg{" +
                "id=" + id +
                ", url=" + url +
                '+';
    }
}
