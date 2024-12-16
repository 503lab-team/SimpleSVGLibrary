package sokadalab.svgdomtest;

import org.w3c.dom.Document;

/**
 * feBlend要素<br>
 * https://www.w3.org/TR/SVG11/filters.html#feBlendElement<br>
 * https://www.w3.org/TR/SVG11/filters.html#InterfaceSVGFEBlendElement
 */
public class FeBlend extends FeStandardAttributes {
    // フィールドmodeの種類
    public final static short MODE_UNKNOWN = 0;
    public final static short MODE_NORMAL = 1;
    public final static short MODE_MULTIPLY = 2;
    public final static short MODE_SCREEN = 3;
    public final static short MODE_DARKEN = 4;
    public final static short MODE_LIGHTEN = 5;

    private String in;
    private String in2;
    private short mode;

    /**
     * コンストラクタ
     * @param document コンストラクタ
     */
    public FeBlend(Document document) {
        super(document, "feBlend");
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
     * 属性modeの取得
     * @return 属性mode
     */
    public short getMode() {
        return this.mode;
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
     * 属性modeのセット
     * @param mode 属性modeに与える値
     */
    public void setMode(String mode) {
        this.mode = stringToType(mode);
        super.setAttribute("mode", typeToString(this.mode));
    }
    public void setMode(short mode) {
        this.mode = mode;
        super.setAttribute("mode", typeToString(this.mode));
    }

    /**
     * フィールドmodeが表す数値から文字列への変換
     * @param type 変換したい数値
     * @return 対応する文字列
     */
    public static String typeToString(short type) {
        switch (type) {
            case MODE_NORMAL :
                return "normal";
            case MODE_MULTIPLY :
                return "multiply";
            case MODE_SCREEN :
                return "screen";
            case MODE_DARKEN :
                return "darken";
            case MODE_LIGHTEN :
                return "lighten";
            default :
                return "";
        }
    }

    /**
     * フィールドmodeが表す文字列から数値への変換
     * @param str 変換したい文字列
     * @return 対応する数値
     */
    public static short stringToType(String str) {
        switch (str) {
            case "normal" :
                return MODE_NORMAL;
            case "multiply" :
                return MODE_MULTIPLY;
            case "screen" :
                return MODE_SCREEN;
            case "darken" :
                return MODE_DARKEN;
            case "lighten" :
                return MODE_LIGHTEN;
            default :
                return MODE_UNKNOWN;
        }
    }
}
