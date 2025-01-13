package sokadalab.svgdomtest;

import org.w3c.dom.Document;

/**
 * animate要素、animateColor要素、animateMotion要素、animateTransform要素、set要素の基本となるクラス<br>
 * https://www.w3.org/TR/SVG11/animate.html#AnimationElements<br>
 * https://www.w3.org/TR/SVG11/animate.html#InterfaceSVGAnimationElement
 */
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

    /**
     * コンストラクタ
     * @param document ドキュメント
     * @param name 要素名
     */
    public Animation(Document document, String name) {
        super(document, name);
    }

    /**
     * 属性attributeNameの取得
     * @return 属性attributeName
     */
    public String getAttributeName() {
        return this.attributeName;
    }

    /**
     * 属性attributeTypeの取得
     * @return 属性attributeType
     */
    public String getAttributeType() {
        return this.attributeType;
    }

    /**
     * 属性beginの取得
     * @return 属性begin
     */
    public String getBegin() {
        return this.begin;
    }

    /**
     * 属性durの取得
     * @return 属性dur
     */
    public String getDur() {
        return this.dur;
    }

    /**
     * 属性endの取得
     * @return 属性end
     */
    public String getEnd() {
        return this.end;
    }

    /**
     * 属性minの取得
     * @return 属性min
     */
    public String getMin() {
        return this.min;
    }

    /**
     * 属性maxの取得
     * @return 属性max
     */
    public String getMax() {
        return this.max;
    }

    /**
     * 属性restartの取得
     * @return 属性restart
     */
    public String getRestart() {
        return this.restart;
    }

    /**
     * 属性repeatCountの取得
     * @return 属性repeatCount
     */
    public String getRepeatCount() {
        return this.repeatCount;
    }

    /**
     * 属性repeatDurの取得
     * @return 属性repeatDur
     */
    public String getRepeatDur() {
        return this.repeatDur;
    }

    /**
     * 属性attributeNameのセット
     * @param name 属性attributeNameに与える値
     */
    public void setAttributeName(String name) {
        this.attributeName = name;
        super.setAttribute("attributeName", getAttributeName());
    }

    /**
     * 属性attributeTypeのセット
     * @param type 属性attributeTypeに与える値
     */
    public void setAttributeType(String type) {
        this.attributeType = type;
        super.setAttribute("attributeType", getAttributeType());
    }

    /**
     * 属性beginのセット
     * @param begin 属性beginに与える値
     */
    public void setBegin(String begin) {
        this.begin = begin;
        super.setAttribute("begin", getBegin());
    }

    /**
     * 属性durのセット
     * @param dur 属性durに与える値
     */
    public void setDur(String dur) {
        this.dur = dur;
        super.setAttribute("dur", getDur());
    }

    /**
     * 属性endのセット
     * @param end 属性endに与える値
     */
    public void setEnd(String end) {
        this.end = end;
        super.setAttribute("end", getEnd());
    }

    /**
     * 属性minのセット
     * @param min 属性minに与える値
     */
    public void setMin(String min) {
        this.min = min;
        super.setAttribute("min", getMin());
    }

    /**
     * 属性maxのセット
     * @param max 属性maxに与える値
     */
    public void setMax(String max) {
        this.max = max;
        super.setAttribute("max", getMax());
    }

    /**
     * 属性restartのセット
     * @param restart 属性restartに与える値
     */
    public void setRestart(String restart) {
        this.restart = restart;
        super.setAttribute("restart", getRestart());
    }

    /**
     * 属性repeatCountのセット
     * @param repeatCount 属性repeatCountに与える値
     */
    public void setRepeatCount(String repeatCount) {
        this.repeatCount = repeatCount;
        super.setAttribute("repeatCount", getRepeatCount());
    }

    /**
     * 属性repeatDurのセット
     * @param repeatDur 属性repeatDurに与える値
     */
    public void setRepeatDur(String repeatDur) {
        this.repeatDur = repeatDur;
        super.setAttribute("repeatDur", getRepeatDur());
    }
}
