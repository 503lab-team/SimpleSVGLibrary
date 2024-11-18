package sokadalab.svgdomtest;

import org.w3c.dom.Document;

class Script extends SVGElement {
    String type;

    Script(Document document) {
        super(document, "script");
    }
    
    void setType(String type) {
        this.type = type;
        super.setAttribute("type", type);
    }
    
    void setCData(String cdata) {
        
    }

    void setHref(String href) {
        super.setAttribute("href", href);
    }
}
