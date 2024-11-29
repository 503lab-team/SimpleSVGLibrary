// <animateMotion>要素

package sokadalab.svgdomtest;

import org.w3c.dom.Document;

public class AnimateMotion extends Animation {
    private String calcMode;
    private String values;
    private String keyTimes;
    private String keySplines;
    private String from;
    private String to;
    private String by;
    private String path;
    private String keyPoints;
    private String rotate;
    private String origin;

    public AnimateMotion(Document document) {
        super(document, "animateMotion");
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

    public String getPath() {
        return this.path;
    }

    public String getKeyPoints() {
        return this.keyPoints;
    }

    public String getRotate() {
        return this.rotate;
    }

    public String getOrigin() {
        return this.origin;
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

    public void setPath(String path) {
        this.path = path;
        super.setAttribute("path", getPath());
    }

    public void setKeyPoints(String keyPoints) {
        this.keyPoints = keyPoints;
        super.setAttribute("keyPoints", getKeyPoints());
    }

    public void setRotate(String rotate) {
        this.rotate = rotate;
        super.setAttribute("rotate", getRotate());
    }

    public void setOrigin(String origin) {
        this.origin = origin;
        super.setAttribute("origin", getOrigin());
    }
}
