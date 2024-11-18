package sokadalab.svgdomtest;

import org.w3c.dom.Document;

public class Desc extends SVGElement {
    public Desc(Document document) {
        super(document, "desc");
    }
    
    public void setTextNode(Document document, String textnode) {
        super.setTextNode(document, textnode);
    }    
}
