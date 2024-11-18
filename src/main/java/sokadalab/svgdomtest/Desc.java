package sokadalab.svgdomtest;

import org.w3c.dom.Document;

class Desc extends SVGElement {
    Desc(Document document) {
        super(document, "desc");
    }
    
    void setTextNode(Document document, String textnode) {
        super.setTextNode(document, textnode);
    }    
}
