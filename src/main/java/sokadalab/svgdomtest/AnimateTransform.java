// <animateTransform>要素

package sokadalab.svgdomtest;

import org.w3c.dom.Document;

public class AnimateTransform extends Animation {
    private String calcMode;
    private String values;
    private String keyTimes;
    private String keySplines;
    private String from;
    private String to;
    private String by;
    private String type;

    public AnimateTransform(Document document) {
        super(document, "animateTransform");
    }

    public String getCalcMode() {
        return this.calcMode;
    }

    public String getValues() {
        return this.values;
    }

    public String getKeyTimes() {
        return this.keyTimes;
    }

    public String getKeySplines() {
        return this.keySplines;
    }

    public String getFrom() {
        return this.from;
    }

    public String getTo() {
        return this.to;
    }

    public String getBy() {
        return this.by;
    }

    public String getType() {
        return this.type;
    }

    public void setCalcMode(String calcMode) {
        this.calcMode = calcMode;
        super.setAttribute("calcMode", getCalcMode());
    }

    public void setValues(String values) {
        this.values = values;
        super.setAttribute("values", getValues());
    }

    public void setKeyTimes(String keyTimes) {
        this.keyTimes = keyTimes;
        super.setAttribute("keyTimes", getKeyTimes());
    }

    public void setKeySplines(String keySplines) {
        this.keySplines = keySplines;
        super.setAttribute("keySplines", getKeySplines());
    }

    public void setFrom(String from) {
        this.from = from;
        super.setAttribute("from", getFrom());
    }

    public void setTo(String to) {
        this.to = to;
        super.setAttribute("to", getTo());
    }

    public void setBy(String by) {
        this.by = by;
        super.setAttribute("by", getBy());
    }

    public void setType(String type) {
        this.type = type;
        super.setAttribute("type", getType());
    }
}
