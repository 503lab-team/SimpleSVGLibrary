package sokadalab.svgdomtest;

import org.w3c.dom.Document;
import java.util.regex.Pattern;

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
        Pattern pcomma = Pattern.compile(",");
        Pattern pspace = Pattern.compile(" ");
        while (points != "") {
            System.out.println("points = " + points);
            System.out.println("x = " + x);
            System.out.println("y = " + y);
            String[] str1 = pcomma.split(points, 2);
            String[] str2 = pspace.split(str1[0], 2);
            if (x == "") {
                x = str2[0];
            } else if (y == "") {
                y = str2[0];
            } else {
                this.points.appendItem(x, y);
                System.out.println("points = " + this.points.getAllItem());
                break;
            }
            if (str2.length > 1) {
                points = str2[str2.length - 1];
            } else if (str1.length > 1) {
                points = str1[str1.length - 1];
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
