package sokadalab.svgdomtest;

import org.w3c.dom.Document;

class AnimateColor extends Animation {
    AnimateColor(Document document) {
        super(document, "animateColor");
    }

    void setCalcMode(String calcMode) {
        super.setAttribute("calcMode", calcMode);
    }

    void setValues(String values) {
        super.setAttribute("values", values);
    }

    void setKeyTimes(String keyTimes) {
        super.setAttribute("keyTimes", keyTimes);
    }

    void setKeySplines(String keySplines) {
        super.setAttribute("keySplines", keySplines);
    }

    void setFrom(String from) {
        super.setAttribute("from", from);
    }

    void setTo(String to) {
        super.setAttribute("to", to);
    }

    void setBy(String by) {
        super.setAttribute("by", by);
    }
}
