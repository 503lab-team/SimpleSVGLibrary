package sokadalab.svgdomtest;

import org.w3c.dom.Document;

public class AnimateColor extends Animation {
    public AnimateColor(Document document) {
        super(document, "animateColor");
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
}
