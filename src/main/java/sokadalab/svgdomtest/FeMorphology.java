package sokadalab.svgdomtest;

import org.w3c.dom.Document;

/**
 * feMorphology要素<br>
 * https://www.w3.org/TR/SVG11/filters.html#feMorphologyElement<br>
 * https://www.w3.org/TR/SVG11/filters.html#InterfaceSVGFEMorphologyElement
 */
public class FeMorphology extends FeStandardAttributes {
    // フィールドoperatorの種類
    public static final short OPERATOR_UNKNOWN = 0;
    public static final short OPERATOR_ERODE = 1;
    public static final short OPERATOR_DILATE = 2;

    private String in;
    private short operator;
    private float radius;

    /**
     * コンストラクタ
     * @param document ドキュメント
     */
    public FeMorphology(Document document) {
        super(document, "feMorphology");
    }

    /**
     * 属性inの取得
     * @return 属性in
     */
    public String getIn() {
        return this.in;
    }

    /**
     * 属性operatorの取得
     * @return 属性operator
     */
    public short getOperator() {
        return this.operator;
    }

    /**
     * 属性radiusの取得
     * @return 属性radius
     */
    public float getRadius() {
        return this.radius;
    }

    /**
     * 属性inのセット
     * @param in 属性inに与える値
     */
    public void setIn(String in) {
        this.in = in;
        super.setAttribute("in", this.in);
    }

    /**
     * 属性operatorのセット
     * @param operator 属性operatorに与える値
     */
    public void setOperator(short operator) {
        this.operator = operator;
        super.setAttribute("operator", typeToString(this.operator));
    }
    public void setOperator(String operator) {
        this.operator = stringToType(operator);
        super.setAttribute("operator", typeToString(this.operator));
    }

    /**
     * 属性radiusのセット
     * @param radius 属性radiusに与える値
     */
    public void setRadius(float radius) {
        this.radius = radius;
        super.setAttribute("radius", String.valueOf(this.radius));
    }
    public void setRadius(String radius) {
        this.radius = Float.parseFloat(radius);
        super.setAttribute("radius", String.valueOf(this.radius));
    }

    /**
     * 数値から文字列への引数typeの変換
     * @param type フィールドtypeを表す値
     * @return 引数typeに対応する文字列
     */
    public static String typeToString(short type) {
        switch(type) {
            case OPERATOR_ERODE :
                return "erode";
            case OPERATOR_DILATE :
                return "dilate";
            default :
                return "";
        }
    }

    /**
     * 文字列から数値への引数strの変換
     * @param str フィールドtypeを表す文字列
     * @return 引数strに対応する値
     */
    public static short stringToType(String str) {
        switch(str) {
            case "erode" :
                return OPERATOR_ERODE;
            case "dilate" :
                return OPERATOR_DILATE;
            default :
                return OPERATOR_UNKNOWN;
        }
    }
}
