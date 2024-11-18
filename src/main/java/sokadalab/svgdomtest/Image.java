package sokadalab.svgdomtest;

import org.w3c.dom.Document;

class Image extends SVGElement {
    private SVGLength x;
    private SVGLength y;
    private SVGLength width;
    private SVGLength height;

    Image(Document document) {
        super(document, "image");
    }

    void setX(String x){
          super.setAttribute("x", x);
    }
    
    void setY(String y){
          super.setAttribute("y", y);
    }
    
    void setWidth(String width){
          super.setAttribute("width", width);
    }

    void setHeight(String height){
        super.setAttribute("height", height);
    }

    void setHref(String href) {
        super.setAttribute("href", href);
    }
}
