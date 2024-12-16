package sokadalab.svgdomtest;

import org.w3c.dom.Document;

/**
 * feComposite要素<br>
 * https://www.w3.org/TR/SVG11/filters.html#feCompositeElement<br>
 * https://www.w3.org/TR/SVG11/filters.html#InterfaceSVGFECompositeElement
 */
public class FeComposite extends FeStandardAttributes {
    // フィールドoperatorの種類
    public final static short OPERATOR_UNKNOWN = 0;
    public final static short OPERATOR_OVER = 1;
    public final static short OPERATOR_IN = 2;
    public final static short OPERATOR_OUT = 3;
    public final static short OPERATOR_ATOP = 4;
    public final static short OPERATOR_XOR = 5;
    public final static short OPERATOR_ARITHMETIC = 6;

    private String in;
    private String in2;
    private short operator;
    private float k1;
    private float k2;
    private float k3;
    private float k4;

    /**
     * コンストラクタ
     * @param document ドキュメント
     */
    public FeComposite(Document document) {
        super(document, "feComposite");
    }

    /**
     * 属性inの取得
     * @return 属性in
     */
    public String getIn() {
        return this.in;
    }

    /**
     * 属性in2の取得
     * @return 属性in2
     */
    public String getIn2() {
        return this.in2;
    }

    /**
     * 属性operatorの取得
     * @return 属性operator
     */
    public short getOperator() {
        return this.operator;
    }

    /**
     * 属性k1の取得
     * @return 属性k1
     */
    public float getK1() {
        return this.k1;
    }

    /**
     * 属性k2の取得
     * @return 属性k2
     */
    public float getK2() {
        return this.k2;
    }

    /**
     * 属性k3の取得
     * @return 属性k3
     */
    public float getK3() {
        return this.k3;
    }

    /**
     * 属性k4の取得
     * @return 属性k4
     */
    public float getK4() {
        return this.k4;
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
     * 属性in2のセット
     * @param in2 属性in2に与える値
     */
    public void setIn2(String in2) {
        this.in2 = in2;
        super.setAttribute("in2", this.in2);
    }

    /**
     * 属性operatorのセット
     * @param operator 属性operatorに与える値
     */
    public void setOperator(String operator) {
        this.operator = stringToType(operator);
        super.setAttribute("operator", typeToString(this.operator));
    }
    public void setOperator(short operator) {
        this.operator = operator;
        super.setAttribute("operator", typeToString(this.operator));
    }

    /**
     * 属性k1のセット
     * @param k1 属性k1に与える値
     */
    public void setK1(String k1) {
        this.k1 = Float.parseFloat(k1);
        super.setAttribute("k1", String.valueOf(this.k1));
    }
    public void setK1(float k1) {
        this.k1 = k1;
        super.setAttribute("k1", String.valueOf(this.k1));
    }

    /**
     * 属性k2のセット
     * @param k2 属性k2に与える値
     */
    public void setK2(String k2) {
        this.k2 = Float.parseFloat(k2);
        super.setAttribute("k2", String.valueOf(this.k2));
    }
    public void setK2(float k2) {
        this.k2 = k2;
        super.setAttribute("k2", String.valueOf(this.k2));
    }

    /**
     * 属性k3のセット
     * @param k3 属性k3に与える値
     */
    public void setK3(String k3) {
        this.k3 = Float.parseFloat(k3);
        super.setAttribute("k3", String.valueOf(this.k3));
    }
    public void setK3(float k3) {
        this.k3 = k3;
        super.setAttribute("k3", String.valueOf(this.k3));
    }

    /**
     * 属性k4のセット
     * @param k4 属性k4に与える値
     */
    public void setK4(String k4) {
        this.k4 = Float.parseFloat(k4);
        super.setAttribute("k4", String.valueOf(this.k4));
    }
    public void setK4(float k4) {
        this.k4 = k4;
        super.setAttribute("k4", String.valueOf(this.k4));
    }

    /**
     * フィールドoperatorが表す数値から文字列への変換
     * @param type 変換したい数値
     * @return 対応する文字列
     */
    public static String typeToString(short type) {
        switch (type) {
            case OPERATOR_OVER :
                return "over";
            case OPERATOR_IN :
                return "in";
            case OPERATOR_OUT :
                return "out";
            case OPERATOR_ATOP :
                return "atop";
            case OPERATOR_XOR :
                return "xor";
            case OPERATOR_ARITHMETIC :
                return "arithmetic";
            default :
                return "";
        }
    }

    /**
     * フィールドoperatorが表す文字列から数値への変換
     * @param str 変換したい文字列
     * @return 対応する数値
     */
    public static short stringToType(String str) {
        switch (str) {
            case "over" :
                return OPERATOR_OVER;
            case "in" :
                return OPERATOR_IN;
            case "out" :
                return OPERATOR_OUT;
            case "atop" :
                return OPERATOR_ATOP;
            case "xor" :
                return OPERATOR_XOR;
            case "arithmetic" :
                return OPERATOR_ARITHMETIC;
            default :
                return OPERATOR_UNKNOWN;
        }
    }
}
