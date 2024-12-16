package sokadalab.svgdomtest;

import org.w3c.dom.Document;

/**
 * feDisplacementMap要素
 * https://www.w3.org/TR/SVG11/filters.html#feDisplacementMapElement<br>
 * https://www.w3.org/TR/SVG11/filters.html#InterfaceSVGFEDisplacementMapElement
 */
public class FeDisplacementMap extends FeStandardAttributes {
    // フィールドxChannelSelectorとフィールドyChannelSelectorの種類
    public static final short CHANNEL_UNKNOWN = 0;
    public static final short CHANNEL_R = 1;
    public static final short CHANNEL_G = 2;
    public static final short CHANNEL_B = 3;
    public static final short CHANNEL_A = 4;

    private String in;
    private String in2;
    private float scale;
    private short xChannelSelector;
    private short yChannelSelector;

    /**
     * コンストラクタ
     * @param document ドキュメント
     */
    public FeDisplacementMap(Document document) {
        super(document, "feDisplacementMap");
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
     * 属性scaleの取得
     * @return 属性scale
     */
    public float getScale() {
        return this.scale;
    }

    /**
     * 属性xChannelSelectorの取得
     * @return 属性xChannelSelector
     */
    public short getXChannelSelector() {
        return this.xChannelSelector;
    }

    /**
     * 属性xyChannelSelectorの取得
     * @return 属性yChannelSelector
     */
    public short getYChannelSelector() {
        return this.yChannelSelector;
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
     * 属性scaleのセット
     * @param scale 属性scaleに与える値
     */
    public void setScale(float scale) {
        this.scale = scale;
        super.setAttribute("scale", String.valueOf(this.scale));
    }
    public void setScale(String scale) {
        this.scale = Float.parseFloat(scale);
        super.setAttribute("scale", String.valueOf(this.scale));
    }

    /**
     * 属性xChannelSelectorのセット
     * @param x 属性xChannelSelectorに与える値
     */
    public void setXChannelSelector(short x) {
        this.xChannelSelector = x;
        super.setAttribute("xChannelSelector", typeToString(this.xChannelSelector));
    }
    public void setXChannelSelector(String x) {
        this.xChannelSelector = stringToType(x);
        super.setAttribute("xChannelSelector", typeToString(this.xChannelSelector));
    }

    /**
     * 属性yChannelSelectorのセット
     * @param y 属性yChannelSelectorに与える値
     */
    public void setYChannelSelector(short y) {
        this.yChannelSelector = y;
        super.setAttribute("yChannelSelector", typeToString(this.yChannelSelector));
    }
    public void setYChannelSelector(String y) {
        this.yChannelSelector = stringToType(y);
        super.setAttribute("yChannelSelector", typeToString(this.yChannelSelector));
    }

    /**
     * 数値から文字列への引数typeの変換
     * @param type フィールドtypeを表す値
     * @return 引数typeに対応する文字列
     */
    public static String typeToString(short type) {
        switch(type) {
            case CHANNEL_R :
                return "R";
            case CHANNEL_G :
                return "G";
            case CHANNEL_B :
                return "B";
            case CHANNEL_A :
                return "A";
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
            case "R" :
                return CHANNEL_R;
            case "G" :
                return CHANNEL_G;
            case "B" :
                return CHANNEL_B;
            case "A" :
                return CHANNEL_A;
            default :
                return CHANNEL_UNKNOWN;
        }
    }
}
