package sokadalab.svgdomtest;

import org.w3c.dom.Document;

public class Stop extends SVGElement{
    public Stop(Document document) {
        super(document, "stop");
    }
    
    public void setOffset(String offset) {
        super.setAttribute("offset", offset);
    }
    
    public void setStopColor(String color) {
        super.setAttribute("stop-color", color);
    }

    public void setStopOpacity(String opacity) {
        super.setAttribute("stop-opacity", opacity);
    }
}
