package sokadalab.svgdomtest;

import org.w3c.dom.*;

public class SVGElement {
    private Element element;
    private String id;
    private String xmlbase;
    private String classname;

    SVGElement(Document document, String name) {
        this.element = document.createElement(name);
    }

    Element getElement() {
        return this.element;
    }
    
    void setId(String id) {
        this.id = id;
        this.element.setAttribute("id", id);
    }
    
    String getId() {
        return this.id;
    }

    void setXmlbase(String xmlbase) {
        this.xmlbase = xmlbase;
        this.element.setAttribute("xml:base", xmlbase);
    }

    String getXmlbase() {
        return this.xmlbase;
    }

    void setClassname(String classname) {
        this.element.setAttribute("class", classname);
    }

    String getClassname() {
        return this.classname;
    }

    void setAttribute(String name, String value) {
        this.element.setAttribute(name, value);
    }

    String getAttribute(String name) {
        return this.element.getAttribute(name);
    }

    // <>でくくられる要素
    void appendChild(SVGElement child) {
        this.element.appendChild(child.getElement());
    }

    // <>でくくられない要素
    void setTextNode(Document document, String textnode) {
        Node node = document.createTextNode(textnode);
        this.element.appendChild(node);
    }

    void setFill(String fill) {
        this.setAttribute("fill", fill);
    }

    void setStroke(String stroke) {
        this.setAttribute("stroke", stroke);
    }
    
    void setStrokeWidth(String stroke_width) {
        this.setAttribute("stroke-width", stroke_width);
    }
    void setStrokeWidth(float stroke_width) {
        this.setAttribute("stroke-width", Float.toString(stroke_width));
    }

    void setTransform(String transform) {
        this.setAttribute("transform", transform);
    }
}
