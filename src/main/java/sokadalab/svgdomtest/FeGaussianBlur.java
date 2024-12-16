package sokadalab.svgdomtest;

import org.w3c.dom.Document;

/**
 * feGaussianBlur要素<br>
 * https://www.w3.org/TR/SVG11/filters.html#feGaussianBlurElement<br>
 * https://www.w3.org/TR/SVG11/filters.html#InterfaceSVGFEGaussianBlurElement
 */
public class FeGaussianBlur extends FeStandardAttributes {
    private String in;
    private float stdDeviation;  // 仕様書ではstdDeviationXとstdDeviationYの二つがあるが、ここでは一つの数値として処理

    /**
     * コンストラクタ
     * @param document ドキュメント
     */
    public FeGaussianBlur(Document document) {
        super(document, "feGaussianBlur");
    }

    /**
     * 属性inの取得
     * @return 属性in
     */
    public String getIn() {
        return this.in;
    }

    /**
     * 属性stdDeviationの取得<br>
     * @return 属性stdDeviation
     */
    public float getStdDeviation() {
        return this.stdDeviation;
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
     * 属性stdDeviationのセット
     * @param sd 属性stdDeviationに与える値
     */
    public void setStdDeviation(float sd) {
        this.stdDeviation = sd;
        super.setAttribute("stdDeviation", String.valueOf(this.stdDeviation));
    }
    public void setStdDeviation(String sd) {
        this.stdDeviation = Float.parseFloat(sd);
        super.setAttribute("stdDeviation", String.valueOf(this.stdDeviation));
    }
}
