package sokadalab.svgdomtest;

import org.w3c.dom.Document;

/**
 * feFlood要素<br>
 * https://www.w3.org/TR/SVG11/filters.html#feFloodElement<br>
 * https://www.w3.org/TR/SVG11/filters.html#InterfaceSVGFEFloodElement
 */
public class FeFlood extends FeStandardAttributes {
    private String floodColor;
    private String floodOpacity;

    /**
     * コンストラクタ
     * @param document ドキュメント
     */
    public FeFlood(Document document) {
        super(document, "feFlood");
    }

    /**
     * 属性flood-colorの取得
     * @return 属性flood-color
     */
    public String getFloodColor() {
        return this.floodColor;
    }

    /**
     * 属性flood-opacityの取得
     * @return 属性flood-opacity
     */
    public String getFloodOpacity() {
        return this.floodOpacity;
    }

    /**
     * 属性flood-colorのセット
     * @param color 属性flood-colorに与える値
     */
    public void setFloodColor(String color) {
        this.floodColor = color;
        super.setAttribute("flood-color", this.floodColor);
    }

    /**
     * 属性flood-opacityのセット
     * @param opacity 属性flood-opacityに与える値
     */
    public void setFloodOpacity(String opacity) {
        this.floodOpacity = opacity;
        super.setAttribute("flood-opacity", this.floodOpacity);
    }
}
