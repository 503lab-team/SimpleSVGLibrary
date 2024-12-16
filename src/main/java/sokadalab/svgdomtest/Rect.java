package sokadalab.svgdomtest;

import org.w3c.dom.Document;

/**
 * rect要素<br>
 * https://www.w3.org/TR/SVG11/shapes.html#RectElement<br>
 * https://www.w3.org/TR/SVG11/shapes.html#InterfaceSVGRectElement
 */
public class Rect extends SVGElement{
    private SVGLength x = new SVGLength();
    private SVGLength y = new SVGLength();
    private SVGLength width = new SVGLength();
    private SVGLength height = new SVGLength();
    private SVGLength rx = new SVGLength();
    private SVGLength ry = new SVGLength();
    private String fill;
    private String stroke;
    private String stroke_width;

    /**
     * コンストラクタ
     * @param document ドキュメント
     */
    public Rect(Document document){
        super(document, "rect");
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
     * 属性rxを取得
     * @return 属性rx
     */
    public SVGLength getRX() {
        return this.rx;
    }

    /**
     * 属性ryを取得
     * @return 属性ry
     */
    public SVGLength getRY() {
        return this.ry;
    }

    /**
     * 属性fillの取得
     * @return 属性fill
     */
    public String getFill() {
        return this.fill;
    }

    /**
     * 属性strokeの取得
     * @return 属性stroke
     */
    public String getStroke() {
        return this.stroke;
    }

    /**
     * 属性stroke-widthの取得
     * @return 属性stroke-width
     */
    public String getStrokeWidth() {
        return this.stroke_width;
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
     * 属性rxをセット
     * @param rx 属性rxに与える値
     */
    public void setRX(String rx) {
        this.rx.newValueSpecifiedUnit(rx);
        super.setAttribute("rx", this.rx.getValueAsString());
    }
    public void setRX(short unitType, float value){
        this.rx.newValueSpecifiedUnit(unitType, value);
        super.setAttribute("rx", this.rx.getValueAsString());
    }    
    public void setRX(float rx){
        this.rx.newValueSpecifiedUnit(rx);
        super.setAttribute("rx", this.rx.getValueAsString());
    }    
    public void setRX(int rx){
        this.rx.newValueSpecifiedUnit(rx);
        super.setAttribute("rx", this.rx.getValueAsString());
    }
    public void setRX(SVGLength rx) {
        this.rx = rx;
        super.setAttribute("rx", this.rx.getValueAsString());
    }

    /**
     * 属性ryをセット
     * @param ry 属性ryに与える値
     */
    public void setRY(String ry) {
        this.ry.newValueSpecifiedUnit(ry);
        super.setAttribute("ry", this.ry.getValueAsString());
    }
    public void setRY(short unitType, float value){
        this.ry.newValueSpecifiedUnit(unitType, value);
        super.setAttribute("ry", this.ry.getValueAsString());
    }    
    public void setRY(float ry){
        this.ry.newValueSpecifiedUnit(ry);
        super.setAttribute("ry", this.ry.getValueAsString());
    }    
    public void setRY(int ry){
        this.ry.newValueSpecifiedUnit(ry);
        super.setAttribute("ry", this.ry.getValueAsString());
    }
    public void setRY(SVGLength ry) {
        this.ry = ry;
        super.setAttribute("ry", this.ry.getValueAsString());
    }

    /**
     * 属性fillのセット
     * @param fill 属性fillを表す文字列
     */
    public void setFill(String fill) {
        this.fill = fill;
        this.setAttribute("fill", this.fill);
    }

    /**
     * 属性strokeのセット
     * @param stroke 属性strokeを表す文字列
     */
    public void setStroke(String stroke) {
        this.stroke = stroke;
        this.setAttribute("stroke", this.stroke);
    }

    /**
     * 属性stroke-widthのセット
     * @param stroke_width 属性stroke-widthを表す文字列
     */
    public void setStrokeWidth(String stroke_width) {
        this.stroke_width = stroke_width;
        this.setAttribute("stroke-width", this.stroke_width);
    }
    public void setStrokeWidth(float stroke_width) {
        this.stroke_width = Float.toString(stroke_width);
        this.setAttribute("stroke-width", this.stroke_width);
    }
}