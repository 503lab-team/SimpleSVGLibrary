package sokadalab.svgdomtest;

import org.w3c.dom.Document;

/**
 * font要素<br>
 * https://www.w3.org/TR/SVG11/fonts.html#FontElement<br>
 * https://www.w3.org/TR/SVG11/fonts.html#InterfaceSVGFontElement<br>
 */
public class Font extends SVGElement {
    private float horizOriginX;
    private float horizOriginY;
    private float horizAdvX;
    private float vertOriginX;
    private float vertOriginY;
    private float vertAdvY;

    /**
     * コンストラクタ
     * @param document ドキュメント
     */
    public Font(Document document) {
        super(document, "font");
    }

    /**
     * 属性horiz-origin-xを取得
     * @return 属性horiz-origin-x
     */
    public float getHorizOriginX() {
        return this.horizOriginX;
    }

    /**
     * 属性horiz-origin-yを取得
     * @return 属性horiz-origin-y
     */
    public float getHorizOriginY() {
        return this.horizOriginY;
    }

    /**
     * 属性horiz-adv-xを取得
     * @return 属性horiz-adv-x
     */
    public float getHorizAdvX() {
        return this.horizAdvX;
    }

    /**
     * 属性vert-origin-xを取得
     * @return 属性vert-origin-x
     */
    public float getVertOriginX() {
        return this.vertOriginX;
    }

    /**
     * 属性vert-origin-yを取得
     * @return 属性vert-origin-y
     */
    public float getVertOriginY() {
        return this.vertOriginY;
    }

    /**
     * 属性vert-adv-yを取得
     * @return 属性vert-adv-y
     */
    public float getVertAdvY() {
        return this.vertAdvY;
    }

    /**
     * 属性horiz-origin-xをセット
     * @param hox 属性horiz-origin-xに与える値
     */
    public void setHorizOriginX(String hox) {
        this.horizOriginX = Float.parseFloat(hox);
        super.setAttribute("horiz-origin-x", hox);
    }
    public void setHorizOriginX(float hox) {
        this.horizOriginX = hox;
        super.setAttribute("horiz-origin-x", String.valueOf(hox));
    }

    /**
     * 属性horiz-origin-yをセット
     * @param hoy 属性horiz-origin-yに与える値
     */
    public void setHorizOriginY(String hoy) {
        this.horizOriginY = Float.parseFloat(hoy);
        super.setAttribute("horiz-origin-y", hoy);
    }
    public void setHorizOriginY(float hoy) {
        this.horizOriginY = hoy;
        super.setAttribute("horiz-origin-y", String.valueOf(hoy));
    }

    /**
     * 属性horiz-adv-xをセット
     * @param hax 属性horiz-adv-xに与える値
     */
    public void setHorizAdvX(String hax) {
        this.horizAdvX = Float.parseFloat(hax);
        super.setAttribute("horiz-adv-x", hax);
    }
    public void setHorizAdvX(float hax) {
        this.horizAdvX = hax;
        super.setAttribute("horiz-adv-x", String.valueOf(hax));
    }

    /**
     * 属性vert-origin-xをセット
     * @param vox 属性vert-origin-xに与える値
     */
    public void setVertOriginX(String vox) {
        this.vertOriginX = Float.parseFloat(vox);
        super.setAttribute("vert-origin-x", vox);
    }
    public void setVertOriginX(float vox) {
        this.vertOriginX = vox;
        super.setAttribute("vert-origin-x", String.valueOf(vox));
    }

    /**
     * 属性vert-origin-yをセット
     * @param voy 属性vert-origin-yに与える値
     */
    public void setVertOriginY(String voy) {
        this.vertOriginY = Float.parseFloat(voy);
        super.setAttribute("vert-origin-y", voy);
    }
    public void setVertOriginY(float voy) {
        this.vertOriginY = voy;
        super.setAttribute("vert-origin-y", String.valueOf(voy));
    }

    /**
     * 属性vert-adv-yをセット
     * @param vay 属性vert-adv-yに与える値
     */
    public void setVertAdvY(String vay) {
        this.vertAdvY = Float.parseFloat(vay);
        super.setAttribute("vert-adv-y", vay);
    }
    public void setVertAdvY(float vay) {
        this.vertAdvY = vay;
        super.setAttribute("vert-adv-y", String.valueOf(vay));
    }
}
