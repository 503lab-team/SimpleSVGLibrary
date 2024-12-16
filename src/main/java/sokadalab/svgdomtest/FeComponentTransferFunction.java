package sokadalab.svgdomtest;

import org.w3c.dom.Document;

/**
 * FeFuncA、FeFuncB、FeFuncG、FeFuncRの基本となるクラス<br>
 * https://www.w3.org/TR/SVG11/filters.html#InterfaceSVGComponentTransferFunctionElement
 */
public class FeComponentTransferFunction extends SVGElement {
    // フィールドtypeのリスト
    public final static short TYPE_UNKNOWN = 0;
    public final static short TYPE_IDENTITY = 1;
    public final static short TYPE_TABLE = 2;
    public final static short TYPE_DISCRETE = 3;
    public final static short TYPE_LINEAR = 4;
    public final static short TYPE_GAMMA = 5;

    private short type;
    private SVGNumberList tableValues = new SVGNumberList();
    private float slope;
    private float intercept;
    private float amplitude;
    private float exponent;
    private float offset;

    /**
     * コンストラクタ
     * @param document ドキュメント
     * @param name 要素名
     */
    public FeComponentTransferFunction(Document document, String name) {
        super(document, name);
    }

    /**
     * 属性typeの取得
     * @return 属性type
     */
    public short getType() {
        return this.type;
    }

    /**
     * 属性tableValuesの取得
     * @return 属性tableValues
     */
    public SVGNumberList getTableValues() {
        return this.tableValues;
    }

    /**
     * 属性slopeの取得
     * @return 属性slope
     */
    public float getSlope() {
        return this.slope;
    }

    /**
     * 属性interceptの取得
     * @return 属性intercept
     */
    public float getIntercept() {
        return this.intercept;
    }

    /**
     * 属性amplitudeの取得
     * @return 属性amplitude
     */
    public float getAmplitude() {
        return this.amplitude;
    }

    /**
     * 属性exponentの取得
     * @return 属性exponent
     */
    public float getExponent() {
        return this.exponent;
    }

    /**
     * 属性offsetの取得
     * @return 属性offset
     */
    public float getOffset() {
        return this.offset;
    }

    /**
     * 属性typeのセット
     * @param type 属性typeに与える値
     */
    public void setType(short type) {
        this.type = type;
        super.setAttribute("type", typeToString(this.type));
    }
    public void setType(String type) {
        this.type = stringToType(type);
        super.setAttribute("type", typeToString(this.type));
    }

    /**
     * 属性tableValuesのセット
     * @param tableValues 属性tableValuesに与える値
     */
    public void setTableValues(SVGNumberList tableValues) {
        this.tableValues = tableValues;
        super.setAttribute("tableValues", this.tableValues.getAllItem());
    }
    public void setTableValues(String tableValues) {
        this.tableValues.appendItem(tableValues);
        super.setAttribute("tableValues", this.tableValues.getAllItem());
    }
    public void setTableValues(float tableValues) {
        this.tableValues.initialize(tableValues);
        super.setAttribute("tableValues", this.tableValues.getAllItem());
    }

    /**
     * 属性slopeのセット
     * @param slope 属性slopeに与える値
     */
    public void setSlope(float slope) {
        this.slope = slope;
        super.setAttribute("slope", String.valueOf(this.slope));
    }
    public void setSlope(String slope) {
        this.slope = Float.parseFloat(slope);
        super.setAttribute("slope", String.valueOf(this.slope));
    }

    /**
     * 属性interceptのセット
     * @param intercept 属性interceptに与える値
     */
    public void setIntercept(float intercept) {
        this.intercept = intercept;
        super.setAttribute("intercept", String.valueOf(this.intercept));
    }
    public void setIntercept(String intercept) {
        this.intercept = Float.parseFloat(intercept);
        super.setAttribute("intercept", String.valueOf(this.intercept));
    }

    /**
     * 属性amplitudeのセット
     * @param amplitude 属性amplitudeに与える値
     */
    public void setAmplitude(float amplitude) {
        this.amplitude = amplitude;
        super.setAttribute("amplitude", String.valueOf(this.amplitude));
    }
    public void setAmplitude(String amplitude) {
        this.amplitude = Float.parseFloat(amplitude);
        super.setAttribute("amplitude", String.valueOf(this.amplitude));
    }

    /**
     * 属性exponentのセット
     * @param exponent 属性exponentに与える値
     */
    public void setExponent(float exponent) {
        this.exponent = exponent;
        super.setAttribute("exponent", String.valueOf(this.exponent));
    }
    public void setExponent(String exponent) {
        this.exponent = Float.parseFloat(exponent);
        super.setAttribute("exponent", String.valueOf(this.exponent));
    }

    /**
     * 属性offsetのセット
     * @param offset 属性offsetに与える値
     */
    public void setOffset(float offset) {
        this.offset = offset;
        super.setAttribute("offset", String.valueOf(this.offset));
    }
    public void setOffset(String offset) {
        this.offset = Float.parseFloat(offset);
        super.setAttribute("offset", String.valueOf(this.offset));
    }

    /**
     * 数値から文字列への引数typeの変換
     * @param type フィールドtypeを表す値
     * @return 引数typeに対応する文字列
     */
    public static String typeToString(short type) {
        switch (type) {
            case TYPE_IDENTITY :
                return "identity";
            case TYPE_TABLE :
                return "table";
            case TYPE_DISCRETE :
                return "discrete";
            case TYPE_LINEAR :
                return "linear";
            case TYPE_GAMMA :
                return "gamma";
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
        switch (str) {
            case "identity" :
                return TYPE_IDENTITY;
            case "table" :
                return TYPE_TABLE;
            case "discrete" :
                return TYPE_DISCRETE;
            case "linear" :
                return TYPE_LINEAR;
            case "gamma" :
                return TYPE_GAMMA;
            default :
                return TYPE_UNKNOWN;
        }
    }
}
