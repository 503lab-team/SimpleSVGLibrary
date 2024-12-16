package sokadalab.svgdomtest;

import org.w3c.dom.Document;

/**
 * clipPath要素<br>
 * https://www.w3.org/TR/SVG11/masking.html#EstablishingANewClippingPath<br>
 * https://www.w3.org/TR/SVG11/masking.html#InterfaceSVGClipPathElement
 */
public class ClipPath extends SVGElement {
    private short clipPathUnits;

    /**
     * コンストラクタ
     * @param document ドキュメント
     */
    public ClipPath(Document document) {
        super(document, "clipPath");
    }

    /**
     * 属性clipPathUnitsをSVGUnitTypeに対応する数値で取得
     * @return 属性clipPathUnitsを表す数値
     */
    public short getClipPathUnits() {
        return this.clipPathUnits;
    }

    /**
     * 属性clipPathUnitsをSVGUnitTypeに対応する文字列で取得
     * @return 属性clipPathUnitsを表す文字列
     */
    public String getClipPathUnitsAsLetter() {
        return SVGUnitTypes.unitTypeToString(this.clipPathUnits);
    }

    /**
     * 属性clipPathUnitsのセット
     * @param clipPathUnits 属性clipPathUnitsに与える文字列
     */
    public void setClipPathUnits(String clipPathUnits) {
        this.clipPathUnits = SVGUnitTypes.stringToUnitType(clipPathUnits);
        super.setAttribute("clipPathUnits", getClipPathUnitsAsLetter());
    }
    /**
     * 属性clipPathUnitsのセット
     * @param clipPathUnits 属性clipPathUnitsに与える数値
     */
    public void setClipPathUnits(short clipPathUnits) {
        this.clipPathUnits = clipPathUnits;
        super.setAttribute("clipPathUnits", getClipPathUnitsAsLetter());
    }
}
