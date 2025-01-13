package sokadalab.svgdomtest;

import org.w3c.dom.Document;

/**
 * Polygon、Polylineの基本となるクラス<br>
 * https://www.w3.org/TR/SVG11/shapes.html#InterfaceSVGAnimatedPoints
 */
public class SVGAnimatedPoints extends SVGElement {
    private SVGPointList points = new SVGPointList();

    /**
     * コンストラクタ
     * @param document ドキュメント
     * @param name 要素名
     */
    public SVGAnimatedPoints(Document document, String name) {
        super(document, name);
    }

    /**
     * 属性pointsを取得
     * @return 属性points
     */
    public SVGPointList getPoints() {
        return this.points;
    }

    /**
     * フィールドpointsを書き直す<br>
     * 区切り文字は半角スペースで統一すること
     * @param points フィールドpointsに与える値
     */
    public void setPoints(SVGPointList points) {
        this.points.clear();
        this.points = points;
        super.setAttribute("points", this.points.getAllItem());
    }
    public void setPoints(String points) {
        this.points.clear();
        String x = "";
        String[] plist = points.split(" ");
        for (int i = 0; i < plist.length; i++) {
            if (x == "") {
                x = plist[i];
            } else {
                this.points.appendItem(x, plist[i]);
                x = "";
            }
        }
        super.setAttribute("points", this.points.getAllItem());
    }

    /**
     * 末尾に追加
     * @param x x座標
     * @param y y座標
     */
    public void appendPoints(String x, String y) {
        this.points.appendItem(x, y);
        super.setAttribute("points", this.points.getAllItem());
    }
    public void appendPoints(float x, float y) {
        this.points.appendItem(x, y);
        super.setAttribute("points", this.points.getAllItem());
    }
    public void appendPoints(SVGPoint point) {
        this.points.appendItem(point);
        super.setAttribute("points", this.points.getAllItem());
    }
}
