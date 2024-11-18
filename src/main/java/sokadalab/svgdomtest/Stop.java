package sokadalab.svgdomtest;

import org.w3c.dom.Document;

class Stop extends SVGElement{
    Stop(Document document) {
        super(document, "stop");
    }
    
    void setOffset(String offset) {
        super.setAttribute("offset", offset);
    }
    
    void setStopColor(String color) {
        super.setAttribute("stop-color", color);
    }

    void setStopOpacity(String opacity) {
        super.setAttribute("stop-opacity", opacity);
    }
}
