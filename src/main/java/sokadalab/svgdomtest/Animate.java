// <animate>要素

package sokadalab.svgdomtest;

import org.w3c.dom.Document;

public class Animate extends Animation {
    private String calcMode;
    private String values;
    private String keyTimes;
    private String keySplines;
    private String from;
    private String to;
    private String by;
    private String additive;
    private String accumulate;

    public Animate(Document document) {
        super(document, "animate");
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

    public String getAdditive() {
        return this.additive;
    }

    public String getAccumulate() {
        return this.accumulate;
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

    public void setAdditive(String additive) {
        this.additive = additive;
        super.setAttribute("additive", getAdditive());
    }

    public void setAccumulate(String accumulate) {
        this.accumulate = accumulate;
        super.setAttribute("accumulate", getAccumulate());
    }
}
