package sokadalab.svgdomtest;

import org.w3c.dom.Document;

/**
 * Polygon、Polylineの基本となるクラス<br>
 * https://www.w3.org/TR/SVG11/shapes.html#InterfaceSVGAnimatedPoints
 */
public class SVGAnimatedPoints extends SVGElement {
    public SVGPointList points = new SVGPointList();

    /**
     * コンストラクタ
     * @param document ドキュメント
     * @param name 要素名
     */
    public SVGAnimatedPoints(Document document, String name) {
        super(document, name);
    }

    /**
     * フィールドpointsをすべて書き直す
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
        String y = "";
        while (points != "") {
            String str = points.substring(0, 1);
            switch(str) {
                case " " : 
                    break;
                case "," :
                    break;
                default :
                    if (x == "") {
                        x = str;
                    } else {
                        y = str;
                    }
                    break;
            }
            if (x != "" && y != "") {
                this.points.appendItem(x, y);
            }
            points = points.substring(1);
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
