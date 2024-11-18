package sokadalab.svgdomtest;

import org.w3c.dom.Document;

public class Marker extends SVGElement {
    // Marker Unit Types
    public final short UNITS_UNKNOWN = 0;
    public final short UNITS_USERSPACEONUSE = 1;
    public final short UNITS_STROKEWIDTH = 2;

    // Marker Orientation Types
    public final short ORIENT_UNKNOWN = 0;
    public final short ORIENT_AUTO = 1;
    public final short ORIENT_ANGLE = 2;

    private SVGLength refX = new SVGLength();
    private SVGLength refY = new SVGLength();
    private float markerUnits;
    private SVGLength markerWidth = new SVGLength();
    private SVGLength markerHeight = new SVGLength();
    private float orientType;
    private SVGAngle orientAngle = new SVGAngle();

    public Marker(Document document) {
        super(document, "marker");
    }

    public void setRefX(String refX) {
        super.setAttribute("refX", refX);
    }
    public void setRefX(short unitType, float value) {
        this.refX.newValueSpecifiedUnit(unitType, value);
        super.setAttribute("refX", this.refX.getValueAsString());
    }

    public void setRefY(String refY) {
        super.setAttribute("refY", refY);
    }
    public void setRefY(short unitType, float value) {
        this.refY.newValueSpecifiedUnit(unitType, value);
        super.setAttribute("refY", this.refY.getValueAsString());
    }

    public void setMarkerUnits(String markerUnits) {
        super.setAttribute("markerUnits", markerUnits);
    }

    public void setMarkerWidth(String width) {
        super.setAttribute("markerWidth", width);
    }
    public void setMarkerWidth(short unitType, float value) {
        this.markerWidth.newValueSpecifiedUnit(unitType, value);
        super.setAttribute("markerWidth", this.markerWidth.getValueAsString());
    }

    public void setMarkerHeight(String height) {
        super.setAttribute("markerHeight", height);
    }
    public void setMarkerHeight(short unitType, float value) {
        this.markerHeight.newValueSpecifiedUnit(unitType, value);
        super.setAttribute("markerHeight", this.markerHeight.getValueAsString());
    }

    public void setOrient(String orient) {
        super.setAttribute("orient", orient);
    }
}
