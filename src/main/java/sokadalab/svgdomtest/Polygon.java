package sokadalab.svgdomtest;

import org.w3c.dom.Document;

/**
 * polygon要素<br>
 * https://www.w3.org/TR/SVG11/shapes.html#PolygonElement<br>
 * https://www.w3.org/TR/SVG11/shapes.html#InterfaceSVGPolygonElement
 */
public class Polygon extends SVGAnimatedPoints {
    private String fill;
    private String stroke;
    private String stroke_width;

    /**
     * コンストラクタ
     * @param document ドキュメント
     */
    public Polygon(Document document) {
        super(document, "polygon");
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
