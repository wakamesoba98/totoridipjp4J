package totoridipjp4j;

/**
 * @author wakamesoba98
 */
final class TotoriDipJPImpl implements TotoriDipJP {
    private static final String API_URL = "http://totori.dip.jp/api/topimg";
    private static final String FORMAT_JSON = "?format=json";
    private static final String FORMAT_XML = "?format=xml";
    private static final String FORMAT_TEXT = "?format=text";

    @Override
    public TopImg getTopImg() {
        HttpClient httpClient = new HttpClient();
        String json = httpClient.get(API_URL);
        return new TopImgJSONImpl(json);
    }

    @Override
    public String getTopImgRaw(Format f) {
        HttpClient httpClient = new HttpClient();
        StringBuilder builder = new StringBuilder(API_URL);
        switch (f) {
            case JSON:
                builder.append(FORMAT_JSON);
                break;

            case XML:
                builder.append(FORMAT_XML);
                break;

            case TEXT:
                builder.append(FORMAT_TEXT);
                break;

        }
        return httpClient.get(builder.toString());
    }
}