package sokadalab.svgdomtest;

import org.w3c.dom.Document;

public class Marker extends SVGElement {
    // Marker Unit Types
    public final static short UNITS_UNKNOWN = 0;
    public final static short UNITS_USERSPACEONUSE = 1;
    public final static short UNITS_STROKEWIDTH = 2;

    private SVGLength refX = new SVGLength();
    private SVGLength refY = new SVGLength();
    private SVGLength markerWidth = new SVGLength();
    private SVGLength markerHeight = new SVGLength();
    private short markerUnits;
    private String orient;
    private SVGAngle orientAngle = new SVGAngle();
    private SVGLengthList viewBox = new SVGLengthList();

    public Marker(Document document) {
        super(document, "marker");
    }

    public SVGLength getRefX() {
        return this.refX;
    }

    public SVGLength getRefY() {
        return this.refY;
    }

    public SVGLength getMarkerWidth() {
        return this.markerWidth;
    }

    public SVGLength getMarkerHeight() {
        return this.markerHeight;
    }

    public short getMarkerUnits() {
        return this.markerUnits;
    }

    public String getOrient() {
        return this.orient;
    }

    public SVGAngle getOrientAngle() {
        return this.orientAngle;
    }

    public SVGLengthList getViewBox() {
        return this.viewBox;
    }

    public void setRefX(String refX) {
        this.refX.newValueSpecifiedUnit(refX);
        super.setAttribute("refX", this.refX.getValueAsString());
    }
    public void setRefX(short unitType, float value) {
        this.refX.newValueSpecifiedUnit(unitType, value);
        super.setAttribute("refX", this.refX.getValueAsString());
    }
    public void setRefX(float refX) {
        this.refX.newValueSpecifiedUnit(refX);
        super.setAttribute("refX", this.refX.getValueAsString());
    }
    public void setRefX(int refX) {
        this.refX.newValueSpecifiedUnit(refX);
        super.setAttribute("refX", this.refX.getValueAsString());
    }
    public void setRefX(SVGLength refX) {
        this.refX = refX;
        super.setAttribute("refX", this.refX.getValueAsString());
    }

    public void setRefY(String refY) {
        this.refY.newValueSpecifiedUnit(refY);
        super.setAttribute("refY", this.refY.getValueAsString());
    }
    public void setRefY(short unitType, float value) {
        this.refY.newValueSpecifiedUnit(unitType, value);
        super.setAttribute("refY", this.refY.getValueAsString());
    }
    public void setRefY(float refY) {
        this.refY.newValueSpecifiedUnit(refY);
        super.setAttribute("refY", this.refY.getValueAsString());
    }
    public void setRefY(int refY) {
        this.refY.newValueSpecifiedUnit(refY);
        super.setAttribute("refY", this.refY.getValueAsString());
    }
    public void setRefY(SVGLength refY) {
        this.refY = refY;
        super.setAttribute("refY", this.refY.getValueAsString());
    }

    public void setMarkerWidth(String markerWidth) {
        this.markerWidth.newValueSpecifiedUnit(markerWidth);
        super.setAttribute("markerWidth", this.markerWidth.getValueAsString());
    }
    public void setMarkerWidth(short unitType, float value) {
        this.markerWidth.newValueSpecifiedUnit(unitType, value);
        super.setAttribute("markerWidth", this.markerWidth.getValueAsString());
    }
    public void setMarkerWidth(float markerWidth) {
        this.markerWidth.newValueSpecifiedUnit(markerWidth);
        super.setAttribute("markerWidth", this.markerWidth.getValueAsString());
    }
    public void setMarkerWidth(int markerWidth) {
        this.markerWidth.newValueSpecifiedUnit(markerWidth);
        super.setAttribute("markerWidth", this.markerWidth.getValueAsString());
    }
    public void setMarkerWidth(SVGLength markerWidth) {
        this.markerWidth = markerWidth;
        super.setAttribute("markerWidth", this.markerWidth.getValueAsString());
    }

    public void setMarkerHeight(String height) {
        super.setAttribute("markerHeight", height);
    }
    public void setMarkerHeight(short unitType, float value) {
        this.markerHeight.newValueSpecifiedUnit(unitType, value);
        super.setAttribute("markerHeight", this.markerHeight.getValueAsString());
    }
    public void setMarkerHeight(float markerHeight) {
        this.markerHeight.newValueSpecifiedUnit(markerHeight);
        super.setAttribute("markerHeight", this.markerHeight.getValueAsString());
    }
    public void setMarkerHeight(int markerHeight) {
        this.markerHeight.newValueSpecifiedUnit(markerHeight);
        super.setAttribute("markerHeight", this.markerHeight.getValueAsString());
    }
    public void setMarkerHeight(SVGLength markerHeight) {
        this.markerHeight = markerHeight;
        super.setAttribute("markerHeight", this.markerHeight.getValueAsString());
    }

    public void setMarkerUnits(String markerUnits) {
        this.markerUnits = stringToMarkerUnits(markerUnits);
        super.setAttribute("markerUnits", markerUnitsToString(this.markerUnits));
    }
    public void setMarkerUnits(short markerUnits) {
        this.markerUnits = markerUnits;
        super.setAttribute("markerUnits", markerUnitsToString(this.markerUnits));
    }

    public void setOrient(String orient) {
        this.orient = orient;
        super.setAttribute("orient", this.orient);
    }

    public void setOrientAngle(String orientAngle) {
        this.orientAngle.newValueSpecifiedUnit(orientAngle);
        super.setAttribute("orientAngle", this.orientAngle.getValueAsString());
    }
    public void setOrientAngle(short unitType, float value) {
        this.orientAngle.newValueSpecifiedUnit(unitType, value);
        super.setAttribute("orientAngle", this.orientAngle.getValueAsString());
    }
    public void setOrientAngle(float orientAngle) {
        this.orientAngle.newValueSpecifiedUnit(orientAngle);
        super.setAttribute("orientAngle", this.orientAngle.getValueAsString());
    }
    public void setOrientAngle(int orientAngle) {
        this.orientAngle.newValueSpecifiedUnit(orientAngle);
        super.setAttribute("orientAngle", this.orientAngle.getValueAsString());
    }
    public void setOrientAngle(SVGAngle orientAngle) {
        this.orientAngle = orientAngle;
        super.setAttribute("orientAngle", this.orientAngle.getValueAsString());
    }

    public void setViewBox(SVGLengthList viewBox) {
        this.viewBox = viewBox;
        super.setAttribute("viewBox", this.viewBox.getAllItem());
    }
    public void setViewBox(String viewBox) {
        String[] list = viewBox.split(" ");     // 空白文字で区切ると想定
        for (int i = 0; i < list.length; i++) {
            this.viewBox.appendItem(list[i]);
        }
        super.setAttribute("viewBox", this.viewBox.getAllItem());
    }

    public static short stringToMarkerUnits(String str) {
        switch (str) {
            case "userSpaceOnUse" :
                return UNITS_USERSPACEONUSE;
            case "strokeWidth" :
                return UNITS_STROKEWIDTH;
            default :
                return UNITS_UNKNOWN;
        }
    }

    public static String markerUnitsToString(short type) {
        switch (type) {
            case UNITS_USERSPACEONUSE :
                return "userSpaceOnUse";
            case UNITS_STROKEWIDTH :
                return "strokeWidth";
            default :
                return "";
        }
    }
}
