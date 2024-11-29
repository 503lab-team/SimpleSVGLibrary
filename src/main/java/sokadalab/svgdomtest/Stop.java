// <stop>要素

package sokadalab.svgdomtest;

import org.w3c.dom.Document;

public class Stop extends SVGElement{
    private String offset;
    private String color;
    private String opacity;

    public Stop(Document document) {
        super(document, "stop");
    }

    public String getOffset() {
        return this.offset;
    }

    public String getColor() {
        return this.color;
    }

    public String getOpacity() {
        return this.opacity;
    }

    public void setOffset(String offset) {
        this.offset = offset;
        super.setAttribute("offset", this.offset);
    }
    
    public void setStopColor(String color) {
        this.color = color;
        super.setAttribute("stop-color", this.color);
    }

    public void setStopOpacity(String opacity) {
        this.opacity = opacity;
        super.setAttribute("stop-opacity", this.opacity);
    }
}
