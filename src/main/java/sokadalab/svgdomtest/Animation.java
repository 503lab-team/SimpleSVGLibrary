package sokadalab.svgdomtest;

import org.w3c.dom.Document;

public class Animation extends SVGElement {
    public Animation(Document document, String name) {
        super(document, name);
    }

    public void setHref(String href) {
        super.setAttribute("href", href);
    }

    public void setAttributeName(String name) {
        super.setAttribute("attributeName", name);
    }

    public void setAttributeType(String type) {
        super.setAttribute("attributeType", type);
    }

    public void setBegin(String begin) {
        super.setAttribute("begin", begin);
    }

    public void setDur(String dur) {
        super.setAttribute("dur", dur);
    }

    public void setEnd(String end) {
        super.setAttribute("end", end);
    }

    public void setMin(String min) {
        super.setAttribute("min", min);
    }

    public void setMax(String max) {
        super.setAttribute("max", max);
    }

    public void setRestart(String restart) {
        super.setAttribute("restart", restart);
    }

    public void setRepeatCount(String repeatCount) {
        super.setAttribute("repeatCount", repeatCount);
    }

    public void setRepeatDur(String repeatDur) {
        super.setAttribute("repeatDur", repeatDur);
    }
}
