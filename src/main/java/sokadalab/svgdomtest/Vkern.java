// <vkern>要素

package sokadalab.svgdomtest;

import org.w3c.dom.Document;

public class Vkern extends SVGElement {
    private String u1;
    private String g1;
    private String u2;
    private String g2;
    private float k;

    public Vkern(Document document) {
        super(document, "vkern");
    }

    public String getU1() {
        return this.u1;
    }

    public String getG1() {
        return this.g1;
    }

    public String getU2() {
        return this.u2;
    }

    public String getG2() {
        return this.g2;
    }

    public float getK() {
        return this.k;
    }

    public void setU1(String u1) {
        this.u1 = u1;
        super.setAttribute("u1", this.u1);
    }

    public void setG1(String g1) {
        this.g1 = g1;
        super.setAttribute("g1", this.g1);
    }

    public void setU2(String u2) {
        this.u2 = u2;
        super.setAttribute("u2", this.u2);
    }

    public void setG2(String g2) {
        this.g2 = g2;
        super.setAttribute("g2", this.g2);
    }

    public void setK(String k) {
        this.k = Float.parseFloat(k);
        super.setAttribute("k", String.valueOf(this.k));
    }
    public void setK(float k) {
        this.k = k;
        super.setAttribute("k", String.valueOf(this.k));
    }
}
