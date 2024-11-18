package sokadalab.svgdomtest;

import org.w3c.dom.Document;

class Marker extends SVGElement {
    // Marker Unit Types
    final short UNITS_UNKNOWN = 0;
    final short UNITS_USERSPACEONUSE = 1;
    final short UNITS_STROKEWIDTH = 2;

    // Marker Orientation Types
    final short ORIENT_UNKNOWN = 0;
    final short ORIENT_AUTO = 1;
    final short ORIENT_ANGLE = 2;

    private SVGLength refX;
    private SVGLength refY;
    private float markerUnits;
    private SVGLength markerWidth;
    private SVGLength markerHeight;
    private float orientType;
    private SVGAngle orientAngle;

    Marker(Document document) {
        super(document, "marker");
    }

    void setRefX(String refX) {
        super.setAttribute("refX", refX);
    }
    void setRefX(short unitType, float value) {
        this.refX.newValueSpecifiedUnit(unitType, value);
        super.setAttribute("refX", this.refX.getValueAsString());
    }

    void setRefY(String refY) {
        super.setAttribute("refY", refY);
    }
    void setRefY(short unitType, float value) {
        this.refY.newValueSpecifiedUnit(unitType, value);
        super.setAttribute("refY", this.refY.getValueAsString());
    }

    void setMarkerUnits(String markerUnits) {
        super.setAttribute("markerUnits", markerUnits);
    }

    void setMarkerWidth(String width) {
        super.setAttribute("markerWidth", width);
    }
    void setMarkerWidth(short unitType, float value) {
        this.markerWidth.newValueSpecifiedUnit(unitType, value);
        super.setAttribute("markerWidth", this.markerWidth.getValueAsString());
    }

    void setMarkerHeight(String height) {
        super.setAttribute("markerHeight", height);
    }
    void setMarkerHeight(short unitType, float value) {
        this.markerHeight.newValueSpecifiedUnit(unitType, value);
        super.setAttribute("markerHeight", this.markerHeight.getValueAsString());
    }

    void setOrient(String orient) {
        super.setAttribute("orient", orient);
    }
}
