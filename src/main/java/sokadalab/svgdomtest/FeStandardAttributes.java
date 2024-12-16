package sokadalab.svgdomtest;

import org.w3c.dom.Document;

/**
 * 仕様書のSVGFilterPrimitiveStandardAttributesインターフェースに相当<br>
 * FeBlend、FeColorMatrix、FeComponentTransfer、FeComposite、FeConvolveMatrix、FeDiffuseLighting、FeDisplacementMap、FeFlood、FeGaussianBlur、FeImage、FeMerge、FeMorphology、FeOffset、FeSpecularLighting、FeTile、FeTurbulenceの基本となるクラス<br>
 * https://www.w3.org/TR/SVG11/filters.html#CommonAttributes<br>
 * https://www.w3.org/TR/SVG11/filters.html#InterfaceSVGFilterPrimitiveStandardAttributes
 */
public class FeStandardAttributes extends SVGElement {
    private SVGLength x = new SVGLength();
    private SVGLength y = new SVGLength();
    private SVGLength width = new SVGLength();
    private SVGLength height = new SVGLength();
    private String result;

    /**
     * コンストラクタ
     * @param document ドキュメント
     * @param name 要素名
     */
    public FeStandardAttributes(Document document, String name) {
        super(document, name);
    }

    /**
     * 属性xを取得
     * @return 属性x
     */
    public SVGLength getX() {
        return this.x;
    }

    /**
     * 属性yを取得
     * @return 属性y
     */
    public SVGLength getY() {
        return this.y;
    }

    /**
     * 属性widthを取得
     * @return 属性width
     */
    public SVGLength getWidth() {
        return this.width;
    }

    /**
     * 属性heightを取得
     * @return 属性height
     */
    public SVGLength getHeight() {
        return this.height;
    }

    /**
     * 属性resultを取得
     * @return 属性result
     */
    public String getResult() {
        return this.result;
    }

    /**
     * 属性xをセット
     * @param x 属性xに与える値
     */
    public void setX(String x){
        this.x.newValueSpecifiedUnit(x);
        super.setAttribute("x", this.x.getValueAsString());
    }
    public void setX(short unitType, float value){
        this.x.newValueSpecifiedUnit(unitType, value);
        super.setAttribute("x", this.x.getValueAsString());
    }
    public void setX(float x) {
        this.x.newValueSpecifiedUnit(x);
        super.setAttribute("x", this.x.getValueAsString());
    }
    public void setX(int x) {
        this.x.newValueSpecifiedUnit(x);
        super.setAttribute("x", this.x.getValueAsString());
    }
    public void setX(SVGLength x) {
        this.x = x;
        super.setAttribute("x", this.x.getValueAsString());
    }

    /**
     * 属性yをセット
     * @param y 属性yに与える値
     */
    public void setY(String y){
        this.y.newValueSpecifiedUnit(y);
        super.setAttribute("y", this.y.getValueAsString());
    }
    public void setY(short unitType, float value){
        this.y.newValueSpecifiedUnit(unitType, value);
        super.setAttribute("y", this.y.getValueAsString());
    }
    public void setY(float y){
        this.y.newValueSpecifiedUnit(y);
        super.setAttribute("y", this.y.getValueAsString());
    }
    public void setY(int y){
        this.y.newValueSpecifiedUnit(y);
        super.setAttribute("y", this.y.getValueAsString());
    }
    public void setY(SVGLength y){
        this.y = y;
        super.setAttribute("y", this.y.getValueAsString());
    }

    /**
     * 属性widthをセット
     * @param width 属性widthに与える値
     */
    public void setWidth(String width){
        this.width.newValueSpecifiedUnit(width);
        super.setAttribute("width", this.width.getValueAsString());
    }
    public void setWidth(short unitType, float value){
        this.width.newValueSpecifiedUnit(unitType, value);
        super.setAttribute("width", this.width.getValueAsString());
    }    
    public void setWidth(float width){
        this.width.newValueSpecifiedUnit(width);
        super.setAttribute("width", this.width.getValueAsString());
    }    
    public void setWidth(int width){
        this.width.newValueSpecifiedUnit(width);
        super.setAttribute("width", this.width.getValueAsString());
    }
    public void setWidth(SVGLength width) {
        this.width = width;
        super.setAttribute("width", this.width.getValueAsString());
    }

    /**
     * 属性heightをセット
     * @param height 属性heightに与える値
     */
    public void setHeight(String height){
        this.height.newValueSpecifiedUnit(height);
        super.setAttribute("height", this.height.getValueAsString());
    }
    public void setHeight(short unitType, float value){
        this.height.newValueSpecifiedUnit(unitType, value);
        super.setAttribute("height", this.height.getValueAsString());
    }    
    public void setHeight(float height){
        this.height.newValueSpecifiedUnit(height);
        super.setAttribute("height", this.height.getValueAsString());
    }    
    public void setHeight(int height){
        this.height.newValueSpecifiedUnit(height);
        super.setAttribute("height", this.height.getValueAsString());
    }
    public void setHeight(SVGLength height) {
        this.height = height;
        super.setAttribute("height", this.height.getValueAsString());
    }

    /**
     * 属性resultのセット
     * @param result 属性result
     */
    public void setResult(String result) {
        this.result = result;
        super.setAttribute("result", this.result);
    }
}
