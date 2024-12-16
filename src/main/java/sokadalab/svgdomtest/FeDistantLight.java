package sokadalab.svgdomtest;

import org.w3c.dom.Document;

/**
 * feGistantLight要素<br>
 * https://www.w3.org/TR/SVG11/filters.html#feDistantLightElement<br>
 * https://www.w3.org/TR/SVG11/filters.html#InterfaceSVGFEDistantLightElement
 */
public class FeDistantLight extends SVGElement {
    private float azimuth;
    private float elevation;

    /**
     * コンストラクタ
     * @param document ドキュメント
     */
    public FeDistantLight(Document document) {
        super(document, "feDistantLight");
    }

    /**
     * 属性azimuthの取得
     * @return 属性azimuth
     */
    public float getAzimuth() {
        return this.azimuth;
    }

    /**
     * 属性elevationの取得
     * @return 属性elevation
     */
    public float getElevation() {
        return this.elevation;
    }

    /**
     * 属性azimuthのセット
     * @param azimuth 属性azimuthに与える値
     */
    public void setAzimuth(float azimuth) {
        this.azimuth = azimuth;
        super.setAttribute("azimuth", String.valueOf(this.azimuth));
    }
    public void setAzimuth(String azimuth) {
        this.azimuth = Float.parseFloat(azimuth);
        super.setAttribute("azimuth", String.valueOf(this.azimuth));
    }

    /**
     * 属性elevationのセット
     * @param elevation 属性elevationに与える値
     */
    public void setElevation(float elevation) {
        this.elevation = elevation;
        super.setAttribute("elevation", String.valueOf(this.elevation));
    }
    public void setElevation(String elevation) {
        this.elevation = Float.parseFloat(elevation);
        super.setAttribute("elevation", String.valueOf(this.elevation));
    }
}
