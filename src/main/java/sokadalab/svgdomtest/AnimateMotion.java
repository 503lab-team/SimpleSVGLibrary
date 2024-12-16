package sokadalab.svgdomtest;

import org.w3c.dom.Document;

/**
 * animateMotion要素<br>
 * https://www.w3.org/TR/SVG11/animate.html#AnimateMotionElement<br>
 * https://www.w3.org/TR/SVG11/animate.html#InterfaceSVGAnimateMotionElement
 */
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

    /**
     * コンストラクタ
     * @param document ドキュメント
     */
    public AnimateMotion(Document document) {
        super(document, "animateMotion");
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
     * 属性pathを取得
     * @return 属性path
     */
    public String getPath() {
        return this.path;
    }

    /**
     * 属性keyPointsを取得
     * @return 属性keyPoints
     */
    public String getKeyPoints() {
        return this.keyPoints;
    }

    /**
     * 属性rotateを取得
     * @return 属性rotate
     */
    public String getRotate() {
        return this.rotate;
    }

    /**
     * 属性originを取得
     * @return 属性origin
     */
    public String getOrigin() {
        return this.origin;
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

    /**
     * 属性pathをセット
     * @param path 属性pathに与える値
     */
    public void setPath(String path) {
        this.path = path;
        super.setAttribute("path", getPath());
    }

    /**
     * 属性keyPointsをセット
     * @param keyPoints 属性keyPointsに与える値
     */
    public void setKeyPoints(String keyPoints) {
        this.keyPoints = keyPoints;
        super.setAttribute("keyPoints", getKeyPoints());
    }

    /**
     * 属性rotateをセット
     * @param rotate 属性rotateに与える値
     */
    public void setRotate(String rotate) {
        this.rotate = rotate;
        super.setAttribute("rotate", getRotate());
    }

    /**
     * 属性originをセット
     * @param origin 属性originに与える値
     */
    public void setOrigin(String origin) {
        this.origin = origin;
        super.setAttribute("origin", getOrigin());
    }
}
