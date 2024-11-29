package sokadalab.svgdomtest;

import org.w3c.dom.*;

public class SVGElement {
    private Element element;
    private String id;
    private String xmlbase;
    private String classname;
    private String fill;
    private String stroke;
    private String stroke_width;
    private String transform;

    public SVGElement(Document document, String name) {
        this.element = document.createElement(name);
    }

    public Element getElement() {
        return this.element;
    }
    
    public String getId() {
        return this.id;
    }

    public String getXmlbase() {
        return this.xmlbase;
    }

    public String getClassname() {
        return this.classname;
    }

    public String getFill() {
        return this.fill;
    }

    public String getStroke() {
        return this.stroke;
    }

    public String getStrokeWidth() {
        return this.stroke_width;
    }

    public String getTransform() {
        return this.transform;
    }

    public String getAttribute(String name) {
        return this.element.getAttribute(name);
    }
    
    public void setId(String id) {
        this.id = id;
        this.element.setAttribute("id", this.id);
    }

    public void setXmlbase(String xmlbase) {
        this.xmlbase = xmlbase;
        this.element.setAttribute("xml:base", this.xmlbase);
    }

    public void setClassname(String classname) {
        this.classname = classname;
        this.element.setAttribute("class", this.classname);
    }

    public void setAttribute(String name, String value) {
        this.element.setAttribute(name, value);
    }

    // <>でくくられる要素
    public void appendChild(SVGElement child) {
        this.element.appendChild(child.getElement());
    }

    // <>でくくられない要素
    public void setTextNode(Document document, String textnode) {
        Node node = document.createTextNode(textnode);
        this.element.appendChild(node);
    }

    public void setFill(String fill) {
        this.fill = fill;
        this.setAttribute("fill", this.fill);
    }

    public void setStroke(String stroke) {
        this.stroke = stroke;
        this.setAttribute("stroke", this.stroke);
    }
    
    public void setStrokeWidth(String stroke_width) {
        this.stroke_width = stroke_width;
        this.setAttribute("stroke-width", this.stroke_width);
    }
    public void setStrokeWidth(float stroke_width) {
        this.stroke_width = Float.toString(stroke_width);
        this.setAttribute("stroke-width", this.stroke_width);
    }

    public void setTransform(String transform) {
        this.transform = transform;
        this.setAttribute("transform", this.transform);
    }
}
