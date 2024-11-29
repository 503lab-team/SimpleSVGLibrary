// <font>要素

package sokadalab.svgdomtest;

import org.w3c.dom.Document;

public class Font extends SVGElement {
    private float horizOriginX;
    private float horizOriginY;
    private float horizAdvX;
    private float vertOriginX;
    private float vertOriginY;
    private float vertAdvY;

    public Font(Document document) {
        super(document, "font");
    }

    public float getHorizOriginX() {
        return this.horizOriginX;
    }

    public float getHorizOriginY() {
        return this.horizOriginY;
    }

    public float getHorizAdvX() {
        return this.horizAdvX;
    }

    public float getVertOriginX() {
        return this.vertOriginX;
    }

    public float getVertOriginY() {
        return this.vertOriginY;
    }

    public float getVertAdvY() {
        return this.vertAdvY;
    }

    public void setHorizOriginX(String hox) {
        this.horizOriginX = Float.parseFloat(hox);
        super.setAttribute("horiz-origin-x", hox);
    }
    public void setHorizOriginX(float hox) {
        this.horizOriginX = hox;
        super.setAttribute("horiz-origin-x", String.valueOf(hox));
    }

    public void setHorizOriginY(String hoy) {
        this.horizOriginY = Float.parseFloat(hoy);
        super.setAttribute("horiz-origin-y", hoy);
    }
    public void setHorizOriginY(float hoy) {
        this.horizOriginY = hoy;
        super.setAttribute("horiz-origin-y", String.valueOf(hoy));
    }

    public void setHorizAdvX(String hax) {
        this.horizAdvX = Float.parseFloat(hax);
        super.setAttribute("horiz-adv-x", hax);
    }
    public void setHorizAdvX(float hax) {
        this.horizAdvX = hax;
        super.setAttribute("horiz-adv-x", String.valueOf(hax));
    }

    public void setVertOriginX(String vox) {
        this.vertOriginX = Float.parseFloat(vox);
        super.setAttribute("vert-origin-x", vox);
    }
    public void setVertOriginX(float vox) {
        this.vertOriginX = vox;
        super.setAttribute("vert-origin-x", String.valueOf(vox));
    }

    public void setVertOriginY(String voy) {
        this.vertOriginY = Float.parseFloat(voy);
        super.setAttribute("vert-origin-y", voy);
    }
    public void setVertOriginY(float voy) {
        this.vertOriginY = voy;
        super.setAttribute("vert-origin-y", String.valueOf(voy));
    }

    public void setVertAdvY(String vay) {
        this.vertAdvY = Float.parseFloat(vay);
        super.setAttribute("vert-adv-y", vay);
    }
    public void setVertAdvY(float vay) {
        this.vertAdvY = vay;
        super.setAttribute("vert-adv-y", String.valueOf(vay));
    }
}
