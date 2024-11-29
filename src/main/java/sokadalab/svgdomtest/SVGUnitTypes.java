package sokadalab.svgdomtest;

public class SVGUnitTypes {
    public final static short TYPE_UNKNOWN = 0;
    public final static short TYPE_USERSPACEONUSE = 1;    // 'userSpaceOnUse'
    public final static short TYPE_OBJECTBOUNDINGBOX = 2; // 'objectBoundingBox'

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
