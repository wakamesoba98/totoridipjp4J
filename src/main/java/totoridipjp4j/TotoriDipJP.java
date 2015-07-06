package totoridipjp4j;

/**
 * @author wakamesoba98
 */
public interface TotoriDipJP {

    /**
     * totori.dip.jp の TopImg API を呼び出します。
     *
     * @return TopImg オブジェクト
     * @since totoridipjp4J 0.0.1
     */
    TopImg getTopImg();

    /**
     * totori.dip.jp の TopImg API を呼び出し、レスポンスをそのまま返します。
     *
     * @param f データ形式
     * @return レスポンス
     * @since totoridipjp4J 0.0.1
     */
    String getTopImgRaw(Format f);
}
