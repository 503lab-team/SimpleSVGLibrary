package sokadalab.svgdomtest;

/**
 * (x,y)座標を表す<br>
 * https://www.w3.org/TR/SVG11/coords.html#InterfaceSVGPoint<br>
 * https://www.w3.org/TR/SVG11/shapes.html#InterfaceSVGAnimatedPoints
 * 
 */
public class SVGPoint {
    private float x;
    private float y;
    
    public float getX() {
        return this.x;
    }

    public float getY() {
        return this.y;
    }

    public void setX(float x) {
        this.x = x;
    }
    public void setX(String x) {
        this.x = Float.parseFloat(x);
    }

    public void setY(float y) {
        this.y = y;
    }
    public void setY(String y) {
        this.y = Float.parseFloat(y);
    }
}
