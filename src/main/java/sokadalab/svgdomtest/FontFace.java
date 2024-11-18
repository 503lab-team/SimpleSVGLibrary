package sokadalab.svgdomtest;

import org.w3c.dom.Document;

public class FontFace extends SVGElement {
    public FontFace(Document document) {
        super(document, "font-face");
    }

    public void setFontFamily(String fFamily) {
        super.setAttribute("font-family", fFamily);
    }

    public void setFontStyle(String fStyle) {
        super.setAttribute("font-style", fStyle);
    }

    public void setFontVariant(String fVariant) {
        super.setAttribute("font-variant", fVariant);
    }

    public void setFontWeight(String fWeight) {
        super.setAttribute("font-weight", fWeight);
    }

    public void setFontStretch(String fStretch) {
        super.setAttribute("font-stretch", fStretch);
    }

    public void setFontSize(String fSize) {
        super.setAttribute("font-size", fSize);
    }

    public void setUnicodeRange(String unicodeRange) {
        super.setAttribute("unicode-range", unicodeRange);
    }

    public void setUnitsPerEm(String unitsPerEm) {
        super.setAttribute("units-per-em", unitsPerEm);
    }

    public void setPanose1(String panose1) {
        super.setAttribute("panose-1", panose1);
    }

    public void setStemv(String stemv) {
        super.setAttribute("stemv", stemv);
    }

    public void setStemh(String stemh) {
        super.setAttribute("stemh", stemh);
    }

    public void setSlope(String slope) {
        super.setAttribute("slope", slope);
    }

    public void setCapHeight(String capHeight) {
        super.setAttribute("cap-height", capHeight);
    }

    public void setXHeight(String xHeight) {
        super.setAttribute("x-height", xHeight);
    }

    public void setAccentHeight(String accentHeight) {
        super.setAttribute("accent-height", accentHeight);
    }

    public void setAscent(String ascent) {
        super.setAttribute("ascent", ascent);
    }

    public void setDescent(String descent) {
        super.setAttribute("descent", descent);
    }

    public void setWidths(String widths) {
        super.setAttribute("widths", widths);
    }

    public void setBbox(String bbox) {
        super.setAttribute("bbox", bbox);
    }

    public void setIdeographic(String ideographic) {
        super.setAttribute("ideographic", ideographic);
    }

    public void setAlphabetic(String alphabetic) {
        super.setAttribute("alphabetic", alphabetic);
    }

    public void setMathematical(String mathematical) {
        super.setAttribute("mathematical", mathematical);
    }

    public void setHanging(String hanging) {
        super.setAttribute("hanging", hanging);
    }

    public void setVIdeographic(String vIdeographic) {
        super.setAttribute("v-ideographic", vIdeographic);
    }

    public void setVAlphabetic(String vAlphabetic) {
        super.setAttribute("v-alphabetic", vAlphabetic);
    }

    public void setVMathematical(String vMathematical) {
        super.setAttribute("v-mathematical", vMathematical);
    }

    public void setVHanging(String vHanging) {
        super.setAttribute("v-hanging", vHanging);
    }

    public void setUnderlinePosition(String up) {
        super.setAttribute("underline-position", up);
    }

    public void setUnderlineThickness(String ut) {
        super.setAttribute("underline-thickness", ut);
    }

    public void setStrikethroughPosition(String sp) {
        super.setAttribute("strikethrough-position", sp);
    }

    public void setStrikethroughThickness(String st) {
        super.setAttribute("strikethrou-thickness", st);
    }

    public void setOverlinePosition(String op) {
        super.setAttribute("overline-position", op);
    }

    public void setOverlineThickness(String ot) {
        super.setAttribute("overline-thickness", ot);
    }
}
