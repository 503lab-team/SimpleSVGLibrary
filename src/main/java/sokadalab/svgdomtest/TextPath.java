package sokadalab.svgdomtest;

import org.w3c.dom.Document;

/**
 * textPath要素<br>
 * https://www.w3.org/TR/SVG11/text.html#TextPathElement<br>
 * https://www.w3.org/TR/SVG11/text.html#InterfaceSVGTextPathElement
 */
public class TextPath extends TextContentElement {
    // methodの種類
    public static final short METHODTYPE_UNKNOWN = 0;
    public static final short METHODTYPE_ALIGN = 1;
    public static final short METHODTYPE_STRETCH = 2;

    // spacingの種類
    public static final short SPACINGTYPE_UNKNOWN = 0;
    public static final short SPACINGTYPE_AUTO = 1;
    public static final short SPACINGTYPE_EXACT = 2;

    private SVGLength startOffset = new SVGLength();
    private short method;
    private short spacing;

    /**
     * コンストラクタ
     * @param document ドキュメント
     */
    public TextPath(Document document) {
        super(document, "textPath");
    }

    /**
     * 属性startOffsetの取得
     * @return 属性startOffset
     */
    public SVGLength getStartOffset() {
        return this.startOffset;
    }

    /**
     * 属性methodの取得
     * @return 属性method
     */
    public short getMethod() {
        return this.method;
    }

    /**
     * 属性spacingの取得
     * @return 属性spacing
     */
    public short getSpacing() {
        return this.spacing;
    }

    /**
     * 属性startOffsetのセット
     * @param startOffset 属性startOffsetに与える値
     */
    public void setStartOffset(String startOffset) {
        this.startOffset.newValueSpecifiedUnit(startOffset);
        super.setAttribute("startOffset", this.startOffset.getValueAsString());
    }
    public void setStartOffset(short unitType, float value) {
        this.startOffset.newValueSpecifiedUnit(unitType, value);
        super.setAttribute("startOffset", this.startOffset.getValueAsString());
    }
    public void setStartOffset(float startOffset) {
        this.startOffset.newValueSpecifiedUnit(startOffset);
        super.setAttribute("startOffset", this.startOffset.getValueAsString());
    }
    public void setStartOffset(int startOffset) {
        this.startOffset.newValueSpecifiedUnit(startOffset);
        super.setAttribute("startOffset", this.startOffset.getValueAsString());
    }
    public void setStartOffset(SVGLength startOffset) {
        this.startOffset = startOffset;
        super.setAttribute("startOffset", this.startOffset.getValueAsString());
    }

    /**
     * 属性methodのセット
     * @param method 属性methodに与える値
     */
    public void setMethod(String method) {
        this.method = stringToMethodType(method);
        super.setAttribute("method", methodTypeToString(this.method));
    }
    public void setMethod(short method) {
        this.method = method;
        super.setAttribute("method", methodTypeToString(this.method));
    }

    /**
     * 属性spacingのセット
     * @param spacing 属性spacingに与える値
     */
    public void setSpacing(String spacing) {
        this.spacing = stringToSpacingType(spacing);
        super.setAttribute("spacing", methodTypeToString(this.spacing));
    }
    public void setSpacing(short spacing) {
        this.spacing = spacing;
        super.setAttribute("spacing", methodTypeToString(this.spacing));
    }

    /**
     * フィールドmethodを表す文字列から数値への変換
     * @param str 変換したい文字列
     * @return 対応する数値
     */
    public static short stringToMethodType(String str) {
        short result;
        switch(str) {
            case "aline" :
                result = METHODTYPE_ALIGN;
                break;
            case "stretch" :
                result = METHODTYPE_STRETCH;
                break;
            default :
                result = METHODTYPE_UNKNOWN;
        }
        return result;
    }

    /**
     * フィールドmethodを表す数値から文字列への変換
     * @param methodType 変換したい数値
     * @return 対応する文字列
     */
    public static String methodTypeToString(short methodType) {
        String result;
        switch(methodType) {
            case METHODTYPE_ALIGN :
                result = "aline";
                break;
            case METHODTYPE_STRETCH :
                result = "stretch";
                break;
            default :
                result = "";
        }
        return result;
    }

    /**
     * フィールドspacingを表す文字列から数値への変換
     * @param str 変換したい文字列
     * @return 対応する数値
     */
    public static short stringToSpacingType(String str) {
        short result;
        switch(str) {
            case "auto" :
                result = SPACINGTYPE_AUTO;
                break;
            case "exact" :
                result = SPACINGTYPE_EXACT;
                break;
            default :
                result = SPACINGTYPE_UNKNOWN;
        }
        return result;        
    }

    /**
     * フィールドspacingを表す数値から文字列への変換
     * @param spacingType 変換したい数値
     * @return 対応する文字列
     */
    public static String spacingTypeToString(short spacingType) {
        String result;
        switch(spacingType) {
            case SPACINGTYPE_AUTO :
                result = "auto";
                break;
            case SPACINGTYPE_EXACT :
                result = "exact";
                break;
            default :
                result = "";
        }
        return result;
    }
}
