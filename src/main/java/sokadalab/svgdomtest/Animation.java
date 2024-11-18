package sokadalab.svgdomtest;

import org.w3c.dom.Document;

class Animation extends SVGElement {
    Animation(Document document, String name) {
        super(document, name);
    }

    void setHref(String href) {
        super.setAttribute("href", href);
    }

    void setAttributeName(String name) {
        super.setAttribute("attributeName", name);
    }

    void setAttributeType(String type) {
        super.setAttribute("attributeType", type);
    }

    void setBegin(String begin) {
        super.setAttribute("begin", begin);
    }

    void setDur(String dur) {
        super.setAttribute("dur", dur);
    }

    void setEnd(String end) {
        super.setAttribute("end", end);
    }

    void setMin(String min) {
        super.setAttribute("min", min);
    }

    void setMax(String max) {
        super.setAttribute("max", max);
    }

    void setRestart(String restart) {
        super.setAttribute("restart", restart);
    }

    void setRepeatCount(String repeatCount) {
        super.setAttribute("repeatCount", repeatCount);
    }

    void setRepeatDur(String repeatDur) {
        super.setAttribute("repeatDur", repeatDur);
    }
}
