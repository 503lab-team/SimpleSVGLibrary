package sokadalab.svgdomtest;

import org.w3c.dom.Document;

/**
 * vkern要素<br>
 * https://www.w3.org/TR/SVG11/fonts.html#VKernElement<br>
 * https://www.w3.org/TR/SVG11/fonts.html#InterfaceSVGVKernElement
 */
public class Vkern extends SVGElement {
    private String u1;
    private String g1;
    private String u2;
    private String g2;
    private float k;

    /**
     * コンストラクタ
     * @param document ドキュメント
     */
    public Vkern(Document document) {
        super(document, "vkern");
    }

    /**
     * 属性u1の取得
     * @return 属性u1
     */
    public String getU1() {
        return this.u1;
    }

    /**
     * 属性g1の取得
     * @return 属性g1
     */
    public String getG1() {
        return this.g1;
    }

    /**
     * 属性u2の取得
     * @return 属性u2
     */
    public String getU2() {
        return this.u2;
    }

    /**
     * 属性g2の取得
     * @return 属性g2
     */
    public String getG2() {
        return this.g2;
    }

    /**
     * 属性kの取得
     * @return 属性k
     */
    public float getK() {
        return this.k;
    }

    /**
     * 属性u1のセット
     * @param u1 属性u1に与える値
     */
    public void setU1(String u1) {
        this.u1 = u1;
        super.setAttribute("u1", this.u1);
    }

    /**
     * 属性g1のセット
     * @param g1 属性g1に与える値
     */
    public void setG1(String g1) {
        this.g1 = g1;
        super.setAttribute("g1", this.g1);
    }

    /**
     * 属性u2のセット
     * @param u2 属性u2に与える値
     */
    public void setU2(String u2) {
        this.u2 = u2;
        super.setAttribute("u2", this.u2);
    }

    /**
     * 属性g2のセット
     * @param g2 属性g2に与える値
     */
    public void setG2(String g2) {
        this.g2 = g2;
        super.setAttribute("g2", this.g2);
    }

    /**
     * 属性kのセット
     * @param k 属性kに与える値
     */
    public void setK(String k) {
        this.k = Float.parseFloat(k);
        super.setAttribute("k", String.valueOf(this.k));
    }
    public void setK(float k) {
        this.k = k;
        super.setAttribute("k", String.valueOf(this.k));
    }
}
