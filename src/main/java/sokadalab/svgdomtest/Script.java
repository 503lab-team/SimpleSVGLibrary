package sokadalab.svgdomtest;

import org.w3c.dom.Document;

public class Script extends SVGElement {
    private String type;

    public Script(Document document) {
        super(document, "script");
    }
    
    public void setType(String type) {
        this.type = type;
        super.setAttribute("type", type);
    }
    
    public void setCData(String cdata) {
        
    }

    public void setHref(String href) {
        super.setAttribute("href", href);
    }
}
