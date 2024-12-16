package sokadalab.svgdomtest;

import org.w3c.dom.Document;

/**
 * animateTransform要素<br>
 * https://www.w3.org/TR/SVG11/animate.html#AnimateTransformElement<br>
 * https://www.w3.org/TR/SVG11/animate.html#InterfaceSVGAnimateTransformElement
 */
public class AnimateTransform extends Animation {
    private String calcMode;
    private String values;
    private String keyTimes;
    private String keySplines;
    private String from;
    private String to;
    private String by;
    private String type;

    /**
     * コンストラクタ
     * @param document ドキュメント
     */
    public AnimateTransform(Document document) {
        super(document, "animateTransform");
    }

    /**
     * 属性calcModeの取得
     * @return 属性calcMode
     */
    public String getCalcMode() {
        return this.calcMode;
    }

    /**
     * 属性valuesの取得
     * @return 属性values
     */
    public String getValues() {
        return this.values;
    }

    /**
     * 属性keyTimes
     * @return 属性keyTimes
     */
    public String getKeyTimes() {
        return this.keyTimes;
    }

    /**
     * 属性keySplinesの取得
     * @return 属性keySplines
     */
    public String getKeySplines() {
        return this.keySplines;
    }

    /**
     * 属性fromの取得
     * @return 属性from
     */
    public String getFrom() {
        return this.from;
    }

    /**
     * 属性toの取得
     * @return 属性to
     */
    public String getTo() {
        return this.to;
    }

    /**
     * 属性byの取得
     * @return 属性by
     */
    public String getBy() {
        return this.by;
    }

    /**
     * 属性typeの取得
     * @return 属性type
     */
    public String getType() {
        return this.type;
    }

    /**
     * 属性calcModeのセット
     * @param calcMode 属性calcModeに与える値
     */
    public void setCalcMode(String calcMode) {
        this.calcMode = calcMode;
        super.setAttribute("calcMode", getCalcMode());
    }

    /**
     * 属性valuesのセット
     * @param values 属性valuesに与える値
     */
    public void setValues(String values) {
        this.values = values;
        super.setAttribute("values", getValues());
    }

    /**
     * 属性keyTimesのセット
     * @param keyTimes 属性keyTimesに与える値
     */
    public void setKeyTimes(String keyTimes) {
        this.keyTimes = keyTimes;
        super.setAttribute("keyTimes", getKeyTimes());
    }

    /**
     * 属性keySplinesのセット
     * @param keySplines 属性keySplinesに与える値
     */
    public void setKeySplines(String keySplines) {
        this.keySplines = keySplines;
        super.setAttribute("keySplines", getKeySplines());
    }

    /**
     * 属性fromのセット
     * @param from 属性fromに与える値
     */
    public void setFrom(String from) {
        this.from = from;
        super.setAttribute("from", getFrom());
    }

    /**
     * 属性toのセット
     * @param to 属性toに与える値
     */
    public void setTo(String to) {
        this.to = to;
        super.setAttribute("to", getTo());
    }

    /**
     * 属性byのセット
     * @param by 属性byに与える値
     */
    public void setBy(String by) {
        this.by = by;
        super.setAttribute("by", getBy());
    }

    /**
     * 属性typeのセット
     * @param type 属性typeに与える値
     */
    public void setType(String type) {
        this.type = type;
        super.setAttribute("type", getType());
    }
}
