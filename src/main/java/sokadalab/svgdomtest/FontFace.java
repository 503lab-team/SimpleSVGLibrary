package sokadalab.svgdomtest;

import org.w3c.dom.Document;

public class FontFace extends SVGElement {
    private String fontFamily;
    private String fontStyle;
    private String fontVariant;
    private String fontWeight;
    private String fontStretch;
    private String fontSize;
    private String unicodeRange;
    private float unitsPerEm;
    private int panose1;
    private float stemv;
    private float stemh;
    private float slope;
    private float capHeight;
    private float xHeight;
    private float accentHeight;
    private float ascent;
    private float descent;
    private String widths;
    private String bbox;
    private float ideographic;
    private float alphabetic;
    private float mathematical;
    private float hanging;
    private float vIdeographic;
    private float vAlphabetic;
    private float vMathematical;
    private float vHanging;
    private float underlinePosition;
    private float underlineThickness;
    private float strikethroughPosition;
    private float strikethrouThickness;
    private float overlinePosition;
    private float overlineThickness;

    public FontFace(Document document) {
        super(document, "font-face");
    }

    public String getFontFamily() {
        return this.fontFamily;
    }

    public String getFontStyle() {
        return this.fontStyle;
    }

    public String getFontVariant() {
        return this.fontVariant;
    }

    public String getFontWeight() {
        return this.fontWeight;
    }

    public String getFontStretch() {
        return this.fontStretch;
    }

    public String getFontSize() {
        return this.fontSize;
    }

    public String getUnicodeRange() {
        return this.unicodeRange;
    }

    public float getUnitsPerEm() {
        return this.unitsPerEm;
    }

    public int getPanose1() {
        return this.panose1;
    }

    public float getStemv() {
        return this.stemv;
    }

    public float getStemh() {
        return this.stemh;
    }

    public float getSlope() {
        return this.slope;
    }

    public float getCapHeight() {
        return this.capHeight;
    }

    public float getXHeight() {
        return this.xHeight;
    }

    public float getAccentHeight() {
        return this.accentHeight;
    }

    public float getAscent() {
        return this.ascent;
    }

    public float getDescent() {
        return this.descent;
    }

    public String getWidths() {
        return this.widths;
    }

    public String getBbox() {
        return this.bbox;
    }

    public float getIdeographic() {
        return this.ideographic;
    }

    public float getAlphabetic() {
        return this.alphabetic;
    }

    public float getMathematical() {
        return this.mathematical;
    }

    public float getHanging() {
        return this.hanging;
    }

    public float getVIdeographic() {
        return this.vIdeographic;
    }

    public float getVAlphabetic() {
        return this.vAlphabetic;
    }

    public float getVMathematical() {
        return this.vMathematical;
    }

    public float getVHanging() {
        return this.vHanging;
    }

    public float getUnderlinePosition() {
        return this.underlinePosition;
    }

    public float getUnderlineThickness() {
        return this.underlineThickness;
    }

    public float getStrikethroughPosition() {
        return this.strikethroughPosition;
    }

    public float getStrikethrouThickness() {
        return this.strikethrouThickness;
    }

    public float getOverlinePosition() {
        return this.overlinePosition;
    }

    public float getOverlineThickness() {
        return this.overlineThickness;
    }

    public void setFontFamily(String fFamily) {
        this.fontFamily = fFamily;
        super.setAttribute("font-family", this.fontFamily);
    }
    public void setFontFamily(float fFamily) {
        this.fontFamily = String.valueOf(fFamily);
        super.setAttribute("font-family", this.fontFamily);
    }

    public void setFontStyle(String fStyle) {
        this.fontStyle = fStyle;
        super.setAttribute("font-style", this.fontStyle);
    }
    public void setFontStyle(float fStyle) {
        this.fontStyle = String.valueOf(fStyle);
        super.setAttribute("font-style", this.fontStyle);
    }

    public void setFontVariant(String fVariant) {
        this.fontVariant = fVariant;
        super.setAttribute("font-variant", this.fontVariant);
    }
    public void setFontVariant(float fVariant) {
        this.fontVariant = String.valueOf(fVariant);
        super.setAttribute("font-variant", this.fontVariant);
    }

    public void setFontWeight(String fWeight) {
        this.fontWeight = fWeight;
        super.setAttribute("font-weight", this.fontWeight);
    }
    public void setFontWeight(float fWeight) {
        this.fontWeight = String.valueOf(fWeight);
        super.setAttribute("font-weight", this.fontWeight);
    }

    public void setFontStretch(String fStretch) {
        this.fontStretch = fStretch;
        super.setAttribute("font-stretch", this.fontStretch);
    }
    public void setFontStretch(float fStretch) {
        this.fontStretch = String.valueOf(fStretch);
        super.setAttribute("font-stretch", this.fontStretch);
    }

    public void setFontSize(String fSize) {
        this.fontSize = fSize;
        super.setAttribute("font-size", this.fontSize);
    }
    public void setFontSize(float fSize) {
        this.fontSize = String.valueOf(fSize);
        super.setAttribute("font-size", this.fontSize);
    }

    public void setUnicodeRange(String unicodeRange) {
        this.unicodeRange = unicodeRange;
        super.setAttribute("unicode-range", this.unicodeRange);
    }
    public void setUnicodeRange(float unicodeRange) {
        this.unicodeRange = String.valueOf(unicodeRange);
        super.setAttribute("unicode-range", this.unicodeRange);
    }

    public void setUnitsPerEm(String unitsPerEm) {
        this.unitsPerEm = Float.parseFloat(unitsPerEm);
        super.setAttribute("units-per-em", String.valueOf(this.unitsPerEm));
    }
    public void setUnitsPerEm(float unitsPerEm) {
        this.unitsPerEm = unitsPerEm;
        super.setAttribute("units-per-em", String.valueOf(this.unitsPerEm));
    }

    public void setPanose1(String panose1) {
        this.panose1 = Integer.parseInt(panose1);
        super.setAttribute("panose-1", String.valueOf(this.panose1));
    }
    public void setPanose1(int panose1) {
        this.panose1 = panose1;
        super.setAttribute("panose-1", String.valueOf(this.panose1));
    }

    public void setStemv(String stemv) {
        this.stemv = Float.parseFloat(stemv);
        super.setAttribute("stemv", String.valueOf(this.stemv));
    }
    public void setStemv(float stemv) {
        this.stemv = stemv;
        super.setAttribute("stemv", String.valueOf(this.stemv));
    }

    public void setStemh(String stemh) {
        this.stemh = Float.parseFloat(stemh);
        super.setAttribute("stemh", String.valueOf(this.stemh));
    }
    public void setStemh(float stemh) {
        this.stemh = stemh;
        super.setAttribute("stemh", String.valueOf(this.stemh));
    }

    public void setSlope(String slope) {
        this.slope = Float.parseFloat(slope);
        super.setAttribute("slope", String.valueOf(this.slope));
    }
    public void setSlope(float slope) {
        this.slope = slope;
        super.setAttribute("slope", String.valueOf(this.slope));
    }

    public void setCapHeight(String capHeight) {
        this.capHeight = Float.parseFloat(capHeight);
        super.setAttribute("cap-height", String.valueOf(this.capHeight));
    }
    public void setCapHeight(float capHeight) {
        this.capHeight = capHeight;
        super.setAttribute("cap-height", String.valueOf(this.capHeight));
    }

    public void setXHeight(String xHeight) {
        this.xHeight = Float.parseFloat(xHeight);
        super.setAttribute("x-height", String.valueOf(this.xHeight));
    }
    public void setXHeight(float xHeight) {
        this.xHeight = xHeight;
        super.setAttribute("x-height", String.valueOf(this.xHeight));
    }

    public void setAccentHeight(String accentHeight) {
        this.accentHeight = Float.parseFloat(accentHeight);
        super.setAttribute("accent-height", String.valueOf(this.accentHeight));
    }
    public void setAccentHeight(float accentHeight) {
        this.accentHeight = accentHeight;
        super.setAttribute("accent-height", String.valueOf(this.accentHeight));
    }

    public void setAscent(String ascent) {
        this.ascent = Float.parseFloat(ascent);
        super.setAttribute("ascent", String.valueOf(this.ascent));
    }
    public void setAscent(float ascent) {
        this.ascent = ascent;
        super.setAttribute("ascent", String.valueOf(this.ascent));
    }

    public void setDescent(String descent) {
        this.descent = Float.parseFloat(descent);
        super.setAttribute("descent", String.valueOf(this.descent));
    }
    public void setDescent(float descent) {
        this.descent = descent;
        super.setAttribute("descent", String.valueOf(this.descent));
    }

    public void setWidths(String widths) {
        this.widths = widths;
        super.setAttribute("widths", this.widths);
    }
    public void setWidths(float widths) {
        this.widths = String.valueOf(widths);
        super.setAttribute("widths", this.widths);
    }

    public void setBbox(String bbox) {
        this.bbox = bbox;
        super.setAttribute("bbox", this.bbox);
    }
    public void setBbox(float bbox) {
        this.bbox = String.valueOf(bbox);
        super.setAttribute("bbox", this.bbox);
    }

    public void setIdeographic(String ideographic) {
        this.ideographic = Float.parseFloat(ideographic);
        super.setAttribute("ideographic", String.valueOf(this.ideographic));
    }
    public void setIdeographic(float ideographic) {
        this.ideographic = ideographic;
        super.setAttribute("ideographic", String.valueOf(this.ideographic));
    }

    public void setAlphabetic(String alphabetic) {
        this.alphabetic = Float.parseFloat(alphabetic);
        super.setAttribute("alphabetic", String.valueOf(this.alphabetic));
    }
    public void setAlphabetic(float alphabetic) {
        this.alphabetic = alphabetic;
        super.setAttribute("alphabetic", String.valueOf(this.alphabetic));
    }

    public void setMathematical(String mathematical) {
        this.mathematical = Float.parseFloat(mathematical);
        super.setAttribute("mathematical", String.valueOf(this.mathematical));
    }
    public void setMathematical(float mathematical) {
        this.mathematical = mathematical;
        super.setAttribute("mathematical", String.valueOf(this.mathematical));
    }

    public void setHanging(String hanging) {
        this.hanging = Float.parseFloat(hanging);
        super.setAttribute("hanging", String.valueOf(this.hanging));
    }
    public void setHanging(float hanging) {
        this.hanging = hanging;
        super.setAttribute("hanging", String.valueOf(this.hanging));
    }

    public void setVIdeographic(String vIdeographic) {
        this.vIdeographic = Float.parseFloat(vIdeographic);
        super.setAttribute("v-ideographic", String.valueOf(this.vIdeographic));
    }
    public void setVIdeographic(float vIdeographic) {
        this.vIdeographic = vIdeographic;
        super.setAttribute("v-ideographic", String.valueOf(this.vIdeographic));
    }

    public void setVAlphabetic(String vAlphabetic) {
        this.vAlphabetic = Float.parseFloat(vAlphabetic);
        super.setAttribute("v-alphabetic", String.valueOf(this.vAlphabetic));
    }
    public void setVAlphabetic(float vAlphabetic) {
        this.vAlphabetic = vAlphabetic;
        super.setAttribute("v-alphabetic", String.valueOf(this.vAlphabetic));
    }

    public void setVMathematical(String vMathematical) {
        this.vMathematical = Float.parseFloat(vMathematical);
        super.setAttribute("v-mathematical", String.valueOf(this.vMathematical));
    }
    public void setVMathematical(float vMathematical) {
        this.vMathematical = vMathematical;
        super.setAttribute("v-mathematical", String.valueOf(this.vMathematical));
    }

    public void setVHanging(String vHanging) {
        this.vHanging = Float.parseFloat(vHanging);
        super.setAttribute("v-hanging", String.valueOf(this.vHanging));
    }
    public void setVHanging(float vHanging) {
        this.vHanging = vHanging;
        super.setAttribute("v-hanging", String.valueOf(this.vHanging));
    }

    public void setUnderlinePosition(String up) {
        this.underlinePosition = Float.parseFloat(up);
        super.setAttribute("underline-position", String.valueOf(this.underlinePosition));
    }
    public void setUnderlinePosition(float up) {
        this.underlinePosition = up;
        super.setAttribute("underline-position", String.valueOf(this.underlinePosition));
    }

    public void setUnderlineThickness(String ut) {
        this.underlineThickness = Float.parseFloat(ut);
        super.setAttribute("underline-thickness", String.valueOf(this.underlineThickness));
    }
    public void setUnderlineThickness(float ut) {
        this.underlineThickness = ut;
        super.setAttribute("underline-thickness", String.valueOf(this.underlineThickness));
    }

    public void setStrikethroughPosition(String sp) {
        this.strikethroughPosition = Float.parseFloat(sp);
        super.setAttribute("strikethrough-position", String.valueOf(this.strikethroughPosition));
    }
    public void setStrikethroughPosition(float sp) {
        this.strikethroughPosition = sp;
        super.setAttribute("strikethrough-position", String.valueOf(this.strikethroughPosition));
    }

    public void setStrikethroughThickness(String st) {
        this.strikethrouThickness = Float.parseFloat(st);
        super.setAttribute("strikethrou-thickness", String.valueOf(this.strikethrouThickness));
    }
    public void setStrikethroughThickness(float st) {
        this.strikethrouThickness = st;
        super.setAttribute("strikethrou-thickness", String.valueOf(this.strikethrouThickness));
    }

    public void setOverlinePosition(String op) {
        this.overlinePosition = Float.parseFloat(op);
        super.setAttribute("overline-position", String.valueOf(this.overlinePosition));
    }
    public void setOverlinePosition(float op) {
        this.overlinePosition = op;
        super.setAttribute("overline-position", String.valueOf(this.overlinePosition));
    }

    public void setOverlineThickness(String ot) {
        this.overlineThickness = Float.parseFloat(ot);
        super.setAttribute("overline-thickness", String.valueOf(this.overlineThickness));
    }
    public void setOverlineThickness(float ot) {
        this.overlineThickness = ot;
        super.setAttribute("overline-thickness", String.valueOf(this.overlineThickness));
    }
}
