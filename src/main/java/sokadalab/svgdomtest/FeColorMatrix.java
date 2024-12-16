package sokadalab.svgdomtest;

import org.w3c.dom.Document;

/**
 * feColorMatrix要素<br>
 * https://www.w3.org/TR/SVG11/filters.html#feColorMatrixElement<br>
 * https://www.w3.org/TR/SVG11/filters.html#InterfaceSVGFEColorMatrixElement
 */
public class FeColorMatrix extends FeStandardAttributes {
    // フィールドtypeの種類
    public final static short TYPE_UNKNOWN = 0;
    public final static short TYPE_MATRIX = 1;
    public final static short TYPE_SATURATE = 2;
    public final static short TYPE_HUEROTATE = 3;
    public final static short TYPE_LUMINANCETOALPHA = 4;    

    private String in;
    private short type;
    private String values;

    /**
     * コンストラクタ
     * @param document ドキュメント
     */
    public FeColorMatrix(Document document) {
        super(document, "feColorMatrix");
    }

    /**
     * 属性inの取得
     * @return 属性in
     */
    public String getIn() {
        return this.in;
    }

    /**
     * 属性typeの取得
     * @return 属性type
     */
    public short getType() {
        return this.type;
    }

    /**
     * 属性valuesの取得
     * @return 属性values
     */
    public String getValues() {
        return this.values;
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
     * 属性typeのセット
     * @param type 属性typeに与える値
     */
    public void setType(String type) {
        this.type = stringToType(type);
        super.setAttribute("type", typeToString(this.type));
    }
    public void setType(short type) {
        this.type = type;
        super.setAttribute("type", typeToString(this.type));
    }

    /**
     * 属性valuesのセット
     * @param values 属性valuesに与える値
     */
    public void setValues(String values) {
        this.values = values;
        super.setAttribute("values", this.values);
    }

    /**
     * フィールドtypeが表す数値から文字列への変換
     * @param type 変換したい数値
     * @return 対応する文字列
     */
    public static String typeToString(short type) {
        switch (type) {
            case TYPE_MATRIX :
                return "matrix";
            case TYPE_SATURATE :
                return "saturate";
            case TYPE_HUEROTATE :
                return "hueRotate";
            case TYPE_LUMINANCETOALPHA :
                return "luminanceToAlpha";
            default :
                return "";
        }
    }

    /**
     * フィールドtypeが表す文字列から数値への変換
     * @param str 変換したい文字列
     * @return 対応する数値
     */
    public static short stringToType(String str) {
        switch (str) {
            case "matrix" :
                return TYPE_MATRIX;
            case "saturate" :
                return TYPE_SATURATE;
            case "hueRotate" :
                return TYPE_HUEROTATE;
            case "luminanceToAlpha" :
                return TYPE_LUMINANCETOALPHA;
            default :
                return TYPE_UNKNOWN;
        }
    }
}
