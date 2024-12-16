package sokadalab.svgdomtest;

import org.w3c.dom.Document;

/**
 * marker要素<br>
 * https://www.w3.org/TR/SVG11/painting.html#MarkerElement<br>
 * https://www.w3.org/TR/SVG11/painting.html#InterfaceSVGMarkerElement
 */
public class Marker extends SVGElement {
    // フィールドmarkerUnitsの種類
    public final static short UNITS_UNKNOWN = 0;
    public final static short UNITS_USERSPACEONUSE = 1;
    public final static short UNITS_STROKEWIDTH = 2;

    private SVGLength refX = new SVGLength();
    private SVGLength refY = new SVGLength();
    private SVGLength markerWidth = new SVGLength();
    private SVGLength markerHeight = new SVGLength();
    private short markerUnits;
    private String orient;
    private SVGAngle orientAngle = new SVGAngle();
    private SVGLengthList viewBox = new SVGLengthList();

    /**
     * コンストラクタ
     * @param document ドキュメント
     */
    public Marker(Document document) {
        super(document, "marker");
    }

    /**
     * 属性refXの取得
     * @return 属性refX
     */
    public SVGLength getRefX() {
        return this.refX;
    }

    /**
     * 属性refYの取得
     * @return 属性refY
     */
    public SVGLength getRefY() {
        return this.refY;
    }

    /**
     * 属性markerWidthの取得
     * @return 属性markerWidth
     */
    public SVGLength getMarkerWidth() {
        return this.markerWidth;
    }

    /**
     * 属性markerHeightの取得
     * @return 属性markerHeight
     */
    public SVGLength getMarkerHeight() {
        return this.markerHeight;
    }

    /**
     * 属性markerUnitsの取得
     * @return 属性markerUnits
     */
    public short getMarkerUnits() {
        return this.markerUnits;
    }

    /**
     * 属性orientの取得
     * @return 属性orient
     */
    public String getOrient() {
        return this.orient;
    }

    /**
     * 属性orientAngleの取得
     * @return 属性orientAngle
     */
    public SVGAngle getOrientAngle() {
        return this.orientAngle;
    }

    /**
     * 属性viewBoxの取得
     * @return 属性viewBox
     */
    public SVGLengthList getViewBox() {
        return this.viewBox;
    }

    /**
     * 属性refXのセット
     * @param refX 属性refXに与える値
     */
    public void setRefX(String refX) {
        this.refX.newValueSpecifiedUnit(refX);
        super.setAttribute("refX", this.refX.getValueAsString());
    }
    public void setRefX(short unitType, float value) {
        this.refX.newValueSpecifiedUnit(unitType, value);
        super.setAttribute("refX", this.refX.getValueAsString());
    }
    public void setRefX(float refX) {
        this.refX.newValueSpecifiedUnit(refX);
        super.setAttribute("refX", this.refX.getValueAsString());
    }
    public void setRefX(int refX) {
        this.refX.newValueSpecifiedUnit(refX);
        super.setAttribute("refX", this.refX.getValueAsString());
    }
    public void setRefX(SVGLength refX) {
        this.refX = refX;
        super.setAttribute("refX", this.refX.getValueAsString());
    }

    /**
     * 属性refYのセット
     * @param refY 属性refYに与える値
     */
    public void setRefY(String refY) {
        this.refY.newValueSpecifiedUnit(refY);
        super.setAttribute("refY", this.refY.getValueAsString());
    }
    public void setRefY(short unitType, float value) {
        this.refY.newValueSpecifiedUnit(unitType, value);
        super.setAttribute("refY", this.refY.getValueAsString());
    }
    public void setRefY(float refY) {
        this.refY.newValueSpecifiedUnit(refY);
        super.setAttribute("refY", this.refY.getValueAsString());
    }
    public void setRefY(int refY) {
        this.refY.newValueSpecifiedUnit(refY);
        super.setAttribute("refY", this.refY.getValueAsString());
    }
    public void setRefY(SVGLength refY) {
        this.refY = refY;
        super.setAttribute("refY", this.refY.getValueAsString());
    }

    /**
     * 属性markerWidthのセット
     * @param markerWidth 属性markerWidthに与える値
     */
    public void setMarkerWidth(String markerWidth) {
        this.markerWidth.newValueSpecifiedUnit(markerWidth);
        super.setAttribute("markerWidth", this.markerWidth.getValueAsString());
    }
    public void setMarkerWidth(short unitType, float value) {
        this.markerWidth.newValueSpecifiedUnit(unitType, value);
        super.setAttribute("markerWidth", this.markerWidth.getValueAsString());
    }
    public void setMarkerWidth(float markerWidth) {
        this.markerWidth.newValueSpecifiedUnit(markerWidth);
        super.setAttribute("markerWidth", this.markerWidth.getValueAsString());
    }
    public void setMarkerWidth(int markerWidth) {
        this.markerWidth.newValueSpecifiedUnit(markerWidth);
        super.setAttribute("markerWidth", this.markerWidth.getValueAsString());
    }
    public void setMarkerWidth(SVGLength markerWidth) {
        this.markerWidth = markerWidth;
        super.setAttribute("markerWidth", this.markerWidth.getValueAsString());
    }

    /**
     * 属性markerHeightのセット
     * @param height 属性markerHeightに与える値
     */
    public void setMarkerHeight(String height) {
        super.setAttribute("markerHeight", height);
    }
    public void setMarkerHeight(short unitType, float value) {
        this.markerHeight.newValueSpecifiedUnit(unitType, value);
        super.setAttribute("markerHeight", this.markerHeight.getValueAsString());
    }
    public void setMarkerHeight(float markerHeight) {
        this.markerHeight.newValueSpecifiedUnit(markerHeight);
        super.setAttribute("markerHeight", this.markerHeight.getValueAsString());
    }
    public void setMarkerHeight(int markerHeight) {
        this.markerHeight.newValueSpecifiedUnit(markerHeight);
        super.setAttribute("markerHeight", this.markerHeight.getValueAsString());
    }
    public void setMarkerHeight(SVGLength markerHeight) {
        this.markerHeight = markerHeight;
        super.setAttribute("markerHeight", this.markerHeight.getValueAsString());
    }

    /**
     * 属性markerUnitsのセット
     * @param markerUnits 属性markerUnitsに与える値
     */
    public void setMarkerUnits(String markerUnits) {
        this.markerUnits = stringToMarkerUnits(markerUnits);
        super.setAttribute("markerUnits", markerUnitsToString(this.markerUnits));
    }
    public void setMarkerUnits(short markerUnits) {
        this.markerUnits = markerUnits;
        super.setAttribute("markerUnits", markerUnitsToString(this.markerUnits));
    }

    /**
     * 属性orientのセット
     * @param orient 属性orientに与える値
     */
    public void setOrient(String orient) {
        this.orient = orient;
        super.setAttribute("orient", this.orient);
    }

    /**
     * 属性orientAngleのセット
     * @param orientAngle 属性orientAngleに与える値
     */
    public void setOrientAngle(String orientAngle) {
        this.orientAngle.newValueSpecifiedUnit(orientAngle);
        super.setAttribute("orientAngle", this.orientAngle.getValueAsString());
    }
    public void setOrientAngle(short unitType, float value) {
        this.orientAngle.newValueSpecifiedUnit(unitType, value);
        super.setAttribute("orientAngle", this.orientAngle.getValueAsString());
    }
    public void setOrientAngle(float orientAngle) {
        this.orientAngle.newValueSpecifiedUnit(orientAngle);
        super.setAttribute("orientAngle", this.orientAngle.getValueAsString());
    }
    public void setOrientAngle(int orientAngle) {
        this.orientAngle.newValueSpecifiedUnit(orientAngle);
        super.setAttribute("orientAngle", this.orientAngle.getValueAsString());
    }
    public void setOrientAngle(SVGAngle orientAngle) {
        this.orientAngle = orientAngle;
        super.setAttribute("orientAngle", this.orientAngle.getValueAsString());
    }

    /**
     * 属性viewBoxのセット
     * @param viewBox 属性viewBoxに与える値
     */
    public void setViewBox(SVGLengthList viewBox) {
        this.viewBox = viewBox;
        super.setAttribute("viewBox", this.viewBox.getAllItem());
    }
    public void setViewBox(String viewBox) {
        String[] list = viewBox.split(" ");     // 空白文字で区切ると想定
        for (int i = 0; i < list.length; i++) {
            this.viewBox.appendItem(list[i]);
        }
        super.setAttribute("viewBox", this.viewBox.getAllItem());
    }

    /**
     * フィールドmarkerUnitsが表す文字列から数値への変換
     * @param str 変換したい文字列
     * @return 対応する数値
     */
    public static short stringToMarkerUnits(String str) {
        switch (str) {
            case "userSpaceOnUse" :
                return UNITS_USERSPACEONUSE;
            case "strokeWidth" :
                return UNITS_STROKEWIDTH;
            default :
                return UNITS_UNKNOWN;
        }
    }

    /**
     * フィールドmarkerUnitsが表す数値から文字列への変換
     * @param type 変動したい数値
     * @return 対応する文字列
     */
    public static String markerUnitsToString(short type) {
        switch (type) {
            case UNITS_USERSPACEONUSE :
                return "userSpaceOnUse";
            case UNITS_STROKEWIDTH :
                return "strokeWidth";
            default :
                return "";
        }
    }
}
