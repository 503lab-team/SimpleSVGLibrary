package sokadalab.svgdomtest;

import org.w3c.dom.Document;

public class SVGAnimatedPoints extends SVGElement {
    public SVGPointList points = new SVGPointList();

    public SVGAnimatedPoints(Document document, String name) {
        super(document, name);
    }

    // フィールドのpointsを引数の内容に書き直す
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

    // フィールドのpointsの末尾に追加
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
