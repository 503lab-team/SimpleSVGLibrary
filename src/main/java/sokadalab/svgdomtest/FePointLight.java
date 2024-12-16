package sokadalab.svgdomtest;

import org.w3c.dom.Document;

/**
 * fePointLight要素<br>
 * https://www.w3.org/TR/SVG11/filters.html#fePointLightElement<br>
 * https://www.w3.org/TR/SVG11/filters.html#InterfaceSVGFEPointLightElement
 */
public class FePointLight extends SVGElement {
    private float x;
    private float y;
    private float z;

    /**
     * コンストラクタ
     * @param document ドキュメント
     */
    public FePointLight(Document document) {
        super(document, "fePointLight");
    }

    /**
     * 属性xの取得
     * @return 属性x
     */
    public float getX() {
        return this.x;
    }

    /**
     * 属性yの取得
     * @return 属性y
     */
    public float getY() {
        return this.y;
    }

    /**
     * 属性zの取得
     * @return 属性z
     */
    public float getZ() {
        return this.z;
    }

    /**
     * 属性xのセット
     * @param x 属性xに与える値
     */
    public void setX(float x) {
        this.x = x;
        super.setAttribute("x", String.valueOf(this.x));
    }
    public void setX(String x) {
        this.x = Float.parseFloat(x);
        super.setAttribute("x", String.valueOf(this.x));
    }

    /**
     * 属性yのセット
     * @param y 属性yに与える値
     */
    public void setY(float y) {
        this.y = y;
        super.setAttribute("y", String.valueOf(this.y));
    }
    public void setY(String y) {
        this.y = Float.parseFloat(y);
        super.setAttribute("y", String.valueOf(this.y));
    }

    /**
     * 属性zのセット
     * @param z 属性zに与える値
     */
    public void setZ(float z) {
        this.z = z;
        super.setAttribute("z", String.valueOf(this.z));
    }
    public void setZ(String z) {
        this.z = Float.parseFloat(z);
        super.setAttribute("z", String.valueOf(this.z));
    }
}
