package sokadalab.svgdomtest;

import org.w3c.dom.Document;

/**
 * feDiffuseLighting要素<br>
 * https://www.w3.org/TR/SVG11/filters.html#feDiffuseLightingElement<br>
 * https://www.w3.org/TR/SVG11/filters.html#InterfaceSVGFEDiffuseLightingElement
 */
public class FeDiffuseLighting extends FeStandardAttributes {
    private String in;
    private float surfaceScale;
    private float diffuseConstant;
    private float kernelUnitLength;  // 仕様書ではkernelUnitLengthXとkernelUnitLengthYの二つがあるが、ここでは一つの値として処理
    private String lightingColor;

    /**
     * コンストラクタ
     * @param document ドキュメント
     */
    public FeDiffuseLighting(Document document) {
        super(document, "feDiffuseLighting");
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
     * 属性diffuseConstantの取得
     * @return 属性diffuseConstant
     */
    public float getdiffuseConstant() {
        return this.diffuseConstant;
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
     * 属性diffuseConstantのセット
     * @param dc 属性diffuseConstantに与える値
     */
    public void setDiffuseConstant(float dc) {
        this.diffuseConstant = dc;
        super.setAttribute("diffuseConstant", String.valueOf(this.diffuseConstant));
    }
    public void setDiffuseConstant(String dc) {
        this.diffuseConstant = Float.parseFloat(dc);
        super.setAttribute("diffuseConstant", String.valueOf(this.diffuseConstant));
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
