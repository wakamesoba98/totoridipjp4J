package totoridipjp4j;

/**
 * @author wakamesoba98
 */
public class TotoriDipJPFactory {
    /**
     * インスタンスを生成します。
     *
     * @return インスタンス
     * @since totoridipjp4J 0.0.1
     */
    public TotoriDipJP getInstance() {
        return new TotoriDipJPImpl();
    }
}