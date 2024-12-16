package sokadalab.svgdomtest;

import org.w3c.dom.Document;

/**
 * feSpecularLighting要素<br>
 * https://www.w3.org/TR/SVG11/filters.html#feSpecularLightingElement<br>
 * https://www.w3.org/TR/SVG11/filters.html#InterfaceSVGFESpecularLightingElement
 */
public class FeSpecularLighting extends FeStandardAttributes {
    private String in;
    private float surfaceScale;
    private float specularConstant;
    private float specularExponent;
    private float kernelUnitLength;  // 仕様書ではkernelUnitLengthXとkernelUnitLengthYの二つがあるが、ここでは一つの値として処理
    private String lightingColor;

    /**
     * コンストラクタ
     * @param document ドキュメント
     */
    public FeSpecularLighting(Document document) {
        super(document, "feSpecularLighting");
    }

    /**
     * 属性inの取得
     * @return 属性in
     */
    public String getIn() {
        return this.in;
    }

    /**
     * 属性surfaceScaleの取得
     * @return 属性sufaceScale
     */
    public float getSurfaceScale() {
        return this.surfaceScale;
    }

    /**
     * 属性specularConstantの取得
     * @return 属性specularConstant
     */
    public float getSpecularConstant() {
        return this.specularConstant;
    }

    /**
     * 属性specularExponentの取得
     * @return 属性specularExponent
     */
    public float getSpecularExponent() {
        return this.specularExponent;
    }

    /**
     * 属性kernelUnitLengthの取得
     * @return 属性kernelUnitLength
     */
    public float getKernelUnitLength() {
        return this.kernelUnitLength;
    }

    /**
     * 属性lighting-colorの取得
     * @return 属性lightingColor
     */
    public String getLightingColor() {
        return this.lightingColor;
    }

    /**
     * 属性inのセット
     * @param in 属性inに与える値
     */
    public void setIn(String in) {
        this.in = in;
        super.setAttribute("in", this.in);
    }

    /**
     * 属性surfaceScaleのセット
     * @param ss 属性surfaceScaleに与える値
     */
    public void setSurfaceScale(float ss) {
        this.surfaceScale = ss;
        super.setAttribute("surfaceScale", String.valueOf(this.surfaceScale));
    }
    public void setSurfaceScale(String ss) {
        this.surfaceScale = Float.parseFloat(ss);
        super.setAttribute("surfaceScale", String.valueOf(this.surfaceScale));
    }

    /**
     * 属性specularConstantのセット
     * @param sc 属性specularConstantに与える値
     */
    public void setSpecularConstant(float sc) {
        this.specularConstant = sc;
        super.setAttribute("specularConstant", String.valueOf(this.specularConstant));
    }
    public void setSpecularConstant(String sc) {
        this.specularConstant = Float.parseFloat(sc);
        super.setAttribute("specularConstant", String.valueOf(this.specularConstant));
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
     * 属性kernelUnitLengthのセット
     * @param kul 属性kernelUnitLengthに与える値
     */
    public void setKernelUnitLength(float kul) {
        this.kernelUnitLength = kul;
        super.setAttribute("kernelUnitLength", String.valueOf(this.kernelUnitLength));
    }
    public void setKernelUnitLength(String kul) {
        this.kernelUnitLength = Float.parseFloat(kul);
        super.setAttribute("kernelUnitLength", String.valueOf(this.kernelUnitLength));
    }

    /**
     * 属性lighting-colorのセット
     * @param color 属性lighting-colorに与える値
     */
    public void setLightingColor(String color) {
        this.lightingColor = color;
        super.setAttribute("lighting-color", this.lightingColor);
    }
}
