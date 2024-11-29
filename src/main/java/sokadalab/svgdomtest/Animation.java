package sokadalab.svgdomtest;

import org.w3c.dom.Document;

public class Animation extends SVGElement {
    private String attributeName;
    private String attributeType;
    private String begin;
    private String dur;
    private String end;
    private String min;
    private String max;
    private String restart;
    private String repeatCount;
    private String repeatDur;

    public Animation(Document document, String name) {
        super(document, name);
    }

    public String getAttributeName() {
        return this.attributeName;
    }

    public String getAttributeType() {
        return this.attributeType;
    }

    public String getBegin() {
        return this.begin;
    }

    public String getDur() {
        return this.dur;
    }

    public String getEnd() {
        return this.end;
    }

    public String getMin() {
        return this.min;
    }

    public String getMax() {
        return this.max;
    }

    public String getRestart() {
        return this.restart;
    }

    public String getRepeatCount() {
        return this.repeatCount;
    }

    public String getRepeatDur() {
        return this.repeatDur;
    }

    public void setHref(String href) {
        super.setAttribute("href", href);
    }

    public void setAttributeName(String name) {
        this.attributeName = name;
        super.setAttribute("attributeName", getAttributeName());
    }

    public void setAttributeType(String type) {
        this.attributeType = type;
        super.setAttribute("attributeType", getAttributeType());
    }

    public void setBegin(String begin) {
        this.begin = begin;
        super.setAttribute("begin", getBegin());
    }

    public void setDur(String dur) {
        this.dur = dur;
        super.setAttribute("dur", getDur());
    }

    public void setEnd(String end) {
        this.end = end;
        super.setAttribute("end", getEnd());
    }

    public void setMin(String min) {
        this.min = min;
        super.setAttribute("min", getMin());
    }

    public void setMax(String max) {
        this.max = max;
        super.setAttribute("max", getMax());
    }

    public void setRestart(String restart) {
        this.restart = restart;
        super.setAttribute("restart", getRestart());
    }

    public void setRepeatCount(String repeatCount) {
        this.repeatCount = repeatCount;
        super.setAttribute("repeatCount", getRepeatCount());
    }

    public void setRepeatDur(String repeatDur) {
        this.repeatDur = repeatDur;
        super.setAttribute("repeatDur", getRepeatDur());
    }
}
