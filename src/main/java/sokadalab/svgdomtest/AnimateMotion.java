package sokadalab.svgdomtest;

import org.w3c.dom.Document;

class AnimateMotion extends Animation {
    AnimateMotion(Document document) {
        super(document, "animateMotion");
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

    void setPath(String path) {
        super.setAttribute("path", path);
    }

    void setKeyPoints(String keyPoints) {
        super.setAttribute("keyPoints", keyPoints);
    }

    void setRotate(String rotate) {
        super.setAttribute("rotate", rotate);
    }

    void setOrigin(String origin) {
        super.setAttribute("origin", origin);
    }
}
