package sokadalab.svgdomtest;

import org.w3c.dom.Document;

/**
 * ellipse要素<br>
 * https://www.w3.org/TR/SVG11/shapes.html#EllipseElement<br>
 * https://www.w3.org/TR/SVG11/shapes.html#InterfaceSVGEllipseElement
 */
public class Ellipse extends SVGElement {
    private SVGLength cx = new SVGLength();
    private SVGLength cy = new SVGLength();
    private SVGLength rx = new SVGLength();
    private SVGLength ry = new SVGLength();
    private String fill;
    private String stroke;
    private String stroke_width;

    /**
     * コンストラクタ
     * @param document ドキュメント
     */
    public Ellipse(Document document) {
        super(document, "ellipse");
    }

    /**
     * 属性cxを取得
     * @return 属性cx
     */
    public SVGLength getCX() {
        return this.cx;
    }

    /**
     * 属性cyを取得
     * @return 属性cy
     */
    public SVGLength getCY() {
        return this.cy;
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
     * 属性cxをセット
     * @param cx 属性cxに与える値
     */
    public void setCX(String cx) {
        this.cx.newValueSpecifiedUnit(cx);
        super.setAttribute("cx", this.cx.getValueAsString());
    }
    public void setCX(short unitType, float value){
        this.cx.newValueSpecifiedUnit(unitType, value);
        super.setAttribute("cx", this.cx.getValueAsString());
    }
    public void setCX(float cx) {
        this.cx.newValueSpecifiedUnit(cx);
        super.setAttribute("cx", this.cx.getValueAsString());        
    }
    public void setCX(int cx) {
        this.cx.newValueSpecifiedUnit(cx);
        super.setAttribute("cx", this.cx.getValueAsString());        
    }
    public void setCX(SVGLength cx) {
        this.cx = cx;
        super.setAttribute("cx", this.cx.getValueAsString());        
    }

    /**
     * 属性cyをセット
     * @param cy 属性cyに与える値
     */
    public void setCY(String cy) {
        this.cy.newValueSpecifiedUnit(cy);
        super.setAttribute("cy", this.cy.getValueAsString());
    }
    public void setCY(short unitType, float value){
        this.cy.newValueSpecifiedUnit(unitType, value);
        super.setAttribute("cy", this.cy.getValueAsString());
    }
    public void setCY(float cy) {
        this.cy.newValueSpecifiedUnit(cy);
        super.setAttribute("cy", this.cy.getValueAsString());        
    }
    public void setCY(int cy) {
        this.cy.newValueSpecifiedUnit(cy);
        super.setAttribute("cy", this.cy.getValueAsString());        
    }
    public void setCY(SVGLength cy) {
        this.cy = cy;
        super.setAttribute("cy", this.cy.getValueAsString());        
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
    public void setRX(float rx) {
        this.rx.newValueSpecifiedUnit(rx);
        super.setAttribute("rx", this.rx.getValueAsString());        
    }
    public void setRX(int rx) {
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
    public void setRY(float ry) {
        this.ry.newValueSpecifiedUnit(ry);
        super.setAttribute("ry", this.ry.getValueAsString());        
    }
    public void setRY(int ry) {
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
