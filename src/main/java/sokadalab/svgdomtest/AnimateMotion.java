package sokadalab.svgdomtest;

import org.w3c.dom.Document;

public class AnimateMotion extends Animation {
    public AnimateMotion(Document document) {
        super(document, "animateMotion");
    }

    public void setCalcMode(String calcMode) {
        super.setAttribute("calcMode", calcMode);
    }

    public void setValues(String values) {
        super.setAttribute("values", values);
    }

    public void setKeyTimes(String keyTimes) {
        super.setAttribute("keyTimes", keyTimes);
    }

    public void setKeySplines(String keySplines) {
        super.setAttribute("keySplines", keySplines);
    }

    public void setFrom(String from) {
        super.setAttribute("from", from);
    }

    public void setTo(String to) {
        super.setAttribute("to", to);
    }

    public void setBy(String by) {
        super.setAttribute("by", by);
    }

    public void setPath(String path) {
        super.setAttribute("path", path);
    }

    public void setKeyPoints(String keyPoints) {
        super.setAttribute("keyPoints", keyPoints);
    }

    public void setRotate(String rotate) {
        super.setAttribute("rotate", rotate);
    }

    public void setOrigin(String origin) {
        super.setAttribute("origin", origin);
    }
}
