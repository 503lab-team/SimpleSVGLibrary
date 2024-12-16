package sokadalab.svgdomtest;

/**
 * Gradient、Pattern、ClipPath、Mask、Filterで使用される定数のセット<br>
 * https://www.w3.org/TR/SVG11/types.html#InterfaceSVGUnitTypes
 */
public class SVGUnitTypes {
    public final static short TYPE_UNKNOWN = 0;
    public final static short TYPE_USERSPACEONUSE = 1;    // 'userSpaceOnUse'
    public final static short TYPE_OBJECTBOUNDINGBOX = 2; // 'objectBoundingBox'

    /**
     * UnitTypeを表す数値から文字列への変換
     * @param str 変換したい文字列
     * @return 対応する数値
     */
    public static short stringToUnitType(String str) {
        switch (str) {
            case "userSpaceOnUse" :
                return TYPE_USERSPACEONUSE;
            case "objectBoundingBox" :
                return TYPE_OBJECTBOUNDINGBOX;
            default :
                return TYPE_UNKNOWN;
        }
    }

    /**
     * UnitTypeを表す文字列から数値への変換
     * @param type 変換したい数値
     * @return 対応する文字列
     */
    public static String unitTypeToString(short type) {
        switch (type) {
            case TYPE_USERSPACEONUSE :
                return "userSpaceOnUse";
            case TYPE_OBJECTBOUNDINGBOX :
                return "objectBoundingBox";
            default :
                return "";
        }
    }
}
