package sokadalab.svgdomtest;

import org.w3c.dom.Document;

/**
 * stop要素<br>
 * https://www.w3.org/TR/SVG11/pservers.html#StopElement<br>
 * https://www.w3.org/TR/SVG11/pservers.html#InterfaceSVGStopElement
 */
public class Stop extends SVGElement{
    private String offset;
    private String color;
    private String opacity;

    /**
     * コンストラクタ
     * @param document ドキュメント
     */
    public Stop(Document document) {
        super(document, "stop");
    }

    /**
     * 属性offsetの取得
     * @return 属性offset
     */
    public String getOffset() {
        return this.offset;
    }

    /**
     * 属性stop-colorの取得
     * @return 属性stop-color
     */
    public String getColor() {
        return this.color;
    }

    /**
     * 属性stop-opacityの取得
     * @return 属性stop-opacity
     */
    public String getOpacity() {
        return this.opacity;
    }

    /**
     * 属性offsetのセット
     * @param offset 属性offsetに与える値
     */
    public void setOffset(String offset) {
        this.offset = offset;
        super.setAttribute("offset", this.offset);
    }

    /**
     * 属性stop-colorのセット
     * @param color 属性stop-colorに与える値
     */
    public void setStopColor(String color) {
        this.color = color;
        super.setAttribute("stop-color", this.color);
    }

    /**
     * 属性stop-opacityのセット
     * @param opacity 属性stop-opacityに与える値
     */
    public void setStopOpacity(String opacity) {
        this.opacity = opacity;
        super.setAttribute("stop-opacity", this.opacity);
    }
}
