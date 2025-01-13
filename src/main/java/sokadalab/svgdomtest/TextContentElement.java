package sokadalab.svgdomtest;

import org.w3c.dom.Document;

/**
 * TextPath、TextPositioningElementの基本となるクラス<br>
 * https://www.w3.org/TR/SVG11/text.html#InterfaceSVGTextContentElement
 */
public class TextContentElement extends SVGLangSpace {
    private String fontFamily;
    private float fontSize;
    private String fontWeight;
    private String fill;
    private String stroke;
    private String stroke_width;

    /**
     * コンストラクタ
     * @param document ドキュメント
     * @param name 要素名
     */
    public TextContentElement(Document document, String name) {
        super(document, name);
    }

    /**
     * 属性font-familyの取得
     * @return 属性font-family
     */
    public String getFontFamily() {
        return this.fontFamily;
    }

    /**
     * 属性font-sizeの取得
     * @return 属性font-size
     */
    public float getFontSize() {
        return this.fontSize;
    }

    /**
     * 属性font-weightの取得
     * @return 属性font-weight
     */
    public String getFontWeight() {
        return this.fontWeight;
    }

    /**
     * 属性fillの取得
     * @return 属性fill
     */
    public String getFill() {
        return this.fill;
    }

    /**
     * 属性strokeの取得
     * @return 属性stroke
     */
    public String getStroke() {
        return this.stroke;
    }

    /**
     * 属性stroke-widthの取得
     * @return 属性stroke-width
     */
    public String getStrokeWidth() {
        return this.stroke_width;
    }

    /**
     * 属性font-familyのセット
     * @param family 属性font-familyに与える値
     */
    public void setFontFamily(String family) {
        this.fontFamily = family;
        super.setAttribute("font-family", this.fontFamily);
    }

    /**
     * 属性font-sizeのセット
     * @param size 属性font-sizeに与える値
     */
    public void setFontSize(String size) {
        this.fontSize = Float.parseFloat(size);
        super.setAttribute("font-size", String.valueOf(this.fontSize));
    }
    public void setFontSize(float size) {
        this.fontSize = size;
        super.setAttribute("font-size", String.valueOf(this.fontSize));
    }
    public void setFontSize(int size) {
        this.fontSize = size;
        super.setAttribute("font-size", String.valueOf(this.fontSize));
    }

    /**
     * 属性font-weightのセット
     * @param weight 属性font-weightに与える値
     */
    public void setFontWeight(String weight) {
        this.fontWeight = weight;
        super.setAttribute("font-weight", this.fontWeight);
    }

    /**
     * 属性fillのセット
     * @param fill 属性fillを表す文字列
     */
    public void setFill(String fill) {
        this.fill = fill;
        this.setAttribute("fill", this.fill);
    }

    /**
     * 属性strokeのセット
     * @param stroke 属性strokeを表す文字列
     */
    public void setStroke(String stroke) {
        this.stroke = stroke;
        this.setAttribute("stroke", this.stroke);
    }

    /**
     * 属性stroke-widthのセット
     * @param stroke_width 属性stroke-widthを表す文字列
     */
    public void setStrokeWidth(String stroke_width) {
        this.stroke_width = stroke_width;
        this.setAttribute("stroke-width", this.stroke_width);
    }
    public void setStrokeWidth(float stroke_width) {
        this.stroke_width = Float.toString(stroke_width);
        this.setAttribute("stroke-width", this.stroke_width);
    }
}
