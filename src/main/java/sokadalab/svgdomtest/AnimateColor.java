package sokadalab.svgdomtest;

import org.w3c.dom.Document;

/**
 * animateColor要素<br>
 * https://www.w3.org/TR/SVG11/animate.html#AnimateColorElement<br>
 * https://www.w3.org/TR/SVG11/animate.html#InterfaceSVGAnimateColorElement
 */
public class AnimateColor extends Animation {
    private String calcMode;
    private String values;
    private String keyTimes;
    private String keySplines;
    private String from;
    private String to;
    private String by;

    /**
     * コンストラクタ
     * @param document ドキュメント
     */
    public AnimateColor(Document document) {
        super(document, "animateColor");
    }

    /**
     * 属性calcModeを取得
     * @return 属性calcMode
     */
    public String getCalcMode() {
        return this.calcMode;
    }

    /**
     * 属性valuesを取得
     * @return 属性values
     */
    public String getValues() {
        return this.values;
    }

    /**
     * 属性keyTimesを取得
     * @return 属性keyTimes
     */
    public String getKeyTimes() {
        return this.keyTimes;
    }

    /**
     * 属性keySplinesを取得
     * @return 属性keySplines
     */
    public String getKeySplines() {
        return this.keySplines;
    }

    /**
     * 属性fromを取得
     * @return 属性from
     */
    public String getFrom() {
        return this.from;
    }

    /**
     * 属性toを取得
     * @return 属性to
     */
    public String getTo() {
        return this.to;
    }

    /**
     * 属性byを取得
     * @return 属性by
     */
    public String getBy() {
        return this.by;
    }

    /**
     * 属性calcModeをセット
     * @param calcMode 属性calcModeに与える値
     */
    public void setCalcMode(String calcMode) {
        this.calcMode = calcMode;
        super.setAttribute("calcMode", getCalcMode());
    }

    /**
     * 属性valuesをセット
     * @param values 属性valuesに与える値
     */
    public void setValues(String values) {
        this.values = values;
        super.setAttribute("values", getValues());
    }

    /**
     * 属性keyTimesをセット
     * @param keyTimes 属性keyTimesに与える値
     */
    public void setKeyTimes(String keyTimes) {
        this.keyTimes = keyTimes;
        super.setAttribute("keyTimes", getKeyTimes());
    }

    /**
     * 属性keySplinesをセット
     * @param keySplines 属性keySplinesに与える値
     */
    public void setKeySplines(String keySplines) {
        this.keySplines = keySplines;
        super.setAttribute("keySplines", getKeySplines());
    }

    /**
     * 属性fromをセット
     * @param from 属性fromに与える値
     */
    public void setFrom(String from) {
        this.from = from;
        super.setAttribute("from", getFrom());
    }

    /**
     * 属性toをセット
     * @param to 属性toに与える値
     */
    public void setTo(String to) {
        this.to = to;
        super.setAttribute("to", getTo());
    }

    /**
     * 属性byをセット
     * @param by 属性byに与える値
     */
    public void setBy(String by) {
        this.by = by;
        super.setAttribute("by", getBy());
    }
}
