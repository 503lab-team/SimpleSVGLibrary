package sokadalab.svgdomtest;

import org.w3c.dom.Document;

/**
 * feSpotLight要素<br>
 * https://www.w3.org/TR/SVG11/filters.html#feSpotLightElement<br>
 * https://www.w3.org/TR/SVG11/filters.html#InterfaceSVGFESpotLightElement
 */
public class FeSpotLight extends SVGElement {
    private float x;
    private float y;
    private float z;
    private float pointsAtX;
    private float pointsAtY;
    private float pointsAtZ;
    private float specularExponent;
    private float limitingConeAngle;

    /**
     * コンストラクタ
     * @param document ドキュメント
     */
    public FeSpotLight(Document document) {
        super(document, "feSpotLight");
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
     * 属性pointsAtXの取得
     * @return 属性pointsAtX
     */
    public float getPointsAtX() {
        return this.pointsAtX;
    }

    /**
     * 属性pointsAtYの取得
     * @return 属性pointsAtY
     */
    public float getPointsAtY() {
        return this.pointsAtY;
    }

    /**
     * 属性pointsAtZの取得
     * @return 属性pointsAtZ
     */
    public float getPointsAtZ() {
        return this.pointsAtZ;
    }

    /**
     * 属性specularExponentの取得
     * @return 属性specularExponent
     */
    public float getSpecularExponent() {
        return this.specularExponent;
    }

    /**
     * 属性limitingConeAngleの取得
     * @return 属性limitingConeAngle
     */
    public float getLimitingConeAngle() {
        return this.limitingConeAngle;
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

    /**
     * 属性pointsAtXのセット
     * @param pax 属性pointsAtXに与える値
     */
    public void setPointsAtX(float pax) {
        this.pointsAtX = pax;
        super.setAttribute("pointsAtX", String.valueOf(this.pointsAtX));
    }
    public void setPointsAtX(String pax) {
        this.pointsAtX = Float.parseFloat(pax);
        super.setAttribute("pointsAtX", String.valueOf(this.pointsAtX));
    }

    /**
     * 属性pointsAtYのセット
     * @param pay 属性pointsAtYに与える値
     */
    public void setPointsAtY(float pay) {
        this.pointsAtY = pay;
        super.setAttribute("pointsAtY", String.valueOf(this.pointsAtY));
    }
    public void setPointsAtY(String pay) {
        this.pointsAtY = Float.parseFloat(pay);
        super.setAttribute("pointsAtY", String.valueOf(this.pointsAtY));
    }

    /**
     * 属性pointsAtZのセット
     * @param paz 属性pointsAtZに与える値
     */
    public void setPointsAtZ(float paz) {
        this.pointsAtZ = paz;
        super.setAttribute("pointsAtZ", String.valueOf(this.pointsAtZ));
    }
    public void setPointsAtZ(String paz) {
        this.pointsAtZ = Float.parseFloat(paz);
        super.setAttribute("pointsAtZ", String.valueOf(this.pointsAtZ));
    }

    /**
     * 属性specularExponentのセット
     * @param se 属性specularExponentに与える値
     */
    public void setSpecularExponent(float se) {
        this.specularExponent = se;
        super.setAttribute("specularExponent", String.valueOf(this.specularExponent));
    }
    public void setSpecularExponent(String se) {
        this.specularExponent = Float.parseFloat(se);
        super.setAttribute("specularExponent", String.valueOf(this.specularExponent));
    }

    /**
     * 属性limitingConeAngleのセット
     * @param lca 属性limitingConeAngleに与える値
     */
    public void setLimitingConeAngle(float lca) {
        this.limitingConeAngle = lca;
        super.setAttribute("limitingConeAngle", String.valueOf(this.limitingConeAngle));
    }
    public void setLimitingConeAngle(String lca) {
        this.limitingConeAngle = Float.parseFloat(lca);
        super.setAttribute("limitingConeAngle", String.valueOf(this.limitingConeAngle));
    }
}
