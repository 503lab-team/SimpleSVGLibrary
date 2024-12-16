package sokadalab.svgdomtest;

import org.w3c.dom.Document;

/**
 * LinearGradientとRadialGradientの基本となるクラス<br>
 * https://www.w3.org/TR/SVG11/pservers.html#InterfaceSVGGradientElement
 */
public class Gradient extends SVGElement {
    // フィールドspreadMethodの種類
    public final static short SPREADMETHOD_UNKNOWN = 0;
    public final static short SPREADMETHOD_PAD = 1;
    public final static short SPREADMETHOD_REFLECT = 2;
    public final static short SPREADMETHOD_REPEAT = 3;

    private short gradientUnits;
    private short spreadMethod;
    private String gradientTransform;

    /**
     * コンストラクタ
     * @param document ドキュメント
     * @param name 要素名
     */
    public Gradient(Document document, String name) {
        super(document, name);
    }

    /**
     * 属性gradientUnitsの取得
     * @return 属性gradientUnits
     */
    public short getGradientUnits() {
        return this.gradientUnits;
    }

    /**
     * 属性spreadMethodの取得
     * @return 属性spreadMethod
     */
    public short getSpreadMethod() {
        return this.spreadMethod;
    }

    /**
     * 属性gradientTransformの取得
     * @return 属性gradientTransform
     */
    public String getGradientTransform() {
        return this.gradientTransform;
    }

    /**
     * 属性gradientUnitsのセット
     * @param units 属性gradientUnitsに与える値
     */
    public void setGradientUnits(String units) {
        this.gradientUnits = SVGUnitTypes.stringToUnitType(units);
        this.setAttribute("gradientUnits", SVGUnitTypes.unitTypeToString(this.gradientUnits));
    }
    public void setGradientUnits(short units) {
        this.gradientUnits = units;
        this.setAttribute("gradientUnits", SVGUnitTypes.unitTypeToString(this.gradientUnits));
    }

    /**
     * 属性spreadMethodのセット
     * @param method 属性spreadMethodに与える値
     */
    public void setSpreadMethod(String method) {
        this.spreadMethod = stringToSpreadMethod(method);
        this.setAttribute("spreadMethod", spreadMethodToString(this.spreadMethod));
    }
    public void setSpreadMethod(short method) {
        this.spreadMethod = method;
        this.setAttribute("spreadMethod", spreadMethodToString(this.spreadMethod));
    }

    /**
     * 属性gradientTransformのセット
     * @param transform 属性gradientTransformに与える値
     */
    public void setGradientTransform(String transform) {
        this.gradientTransform = transform;
        this.setAttribute("gradientTransform", this.gradientTransform);
    }

    /**
     * spreadMethodが表す数値から文字列への変換
     * @param str 変換したい文字列
     * @return 対応する数値
     */
    public static short stringToSpreadMethod(String str) {
        switch (str) {
            case "pad" :
                return SPREADMETHOD_PAD;
            case "reflect" :
                return SPREADMETHOD_REFLECT;
            case "repeat" :
                return SPREADMETHOD_REPEAT;
            default :
                return SPREADMETHOD_UNKNOWN;
        }
    }

    /**
     * spreadMethodが表す文字列から数値への変換
     * @param type 変換したい数値
     * @return 対応する文字列
     */
    public static String spreadMethodToString(short type) {
        switch (type) {
            case SPREADMETHOD_PAD :
                return "pad";
            case SPREADMETHOD_REFLECT :
                return "reflect";
            case SPREADMETHOD_REPEAT :
                return "repeat";
            default :
                return "";
        }
    }
}
