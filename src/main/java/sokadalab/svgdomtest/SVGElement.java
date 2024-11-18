package sokadalab.svgdomtest;

import org.w3c.dom.*;

public class SVGElement {
    private Element element;
    private String id;
    private String xmlbase;
    private String classname;

    public SVGElement(Document document, String name) {
        this.element = document.createElement(name);
    }

    public Element getElement() {
        return this.element;
    }
    
    public void setId(String id) {
        this.id = id;
        this.element.setAttribute("id", id);
    }
    
    public String getId() {
        return this.id;
    }

    public void setXmlbase(String xmlbase) {
        this.xmlbase = xmlbase;
        this.element.setAttribute("xml:base", xmlbase);
    }

    public String getXmlbase() {
        return this.xmlbase;
    }

    public void setClassname(String classname) {
        this.element.setAttribute("class", classname);
    }

    public String getClassname() {
        return this.classname;
    }

    public void setAttribute(String name, String value) {
        this.element.setAttribute(name, value);
    }

    public String getAttribute(String name) {
        return this.element.getAttribute(name);
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
        this.setAttribute("fill", fill);
    }

    public void setStroke(String stroke) {
        this.setAttribute("stroke", stroke);
    }
    
    public void setStrokeWidth(String stroke_width) {
        this.setAttribute("stroke-width", stroke_width);
    }
    public void setStrokeWidth(float stroke_width) {
        this.setAttribute("stroke-width", Float.toString(stroke_width));
    }

    public void setTransform(String transform) {
        this.setAttribute("transform", transform);
    }
}
