package sokadalab.svgdomtest;

import org.w3c.dom.Document;

class FontFace extends SVGElement {
    FontFace(Document document) {
        super(document, "font-face");
    }

    void setFontFamily(String fFamily) {
        super.setAttribute("font-family", fFamily);
    }

    void setFontStyle(String fStyle) {
        super.setAttribute("font-style", fStyle);
    }

    void setFontVariant(String fVariant) {
        super.setAttribute("font-variant", fVariant);
    }

    void setFontWeight(String fWeight) {
        super.setAttribute("font-weight", fWeight);
    }

    void setFontStretch(String fStretch) {
        super.setAttribute("font-stretch", fStretch);
    }

    void setFontSize(String fSize) {
        super.setAttribute("font-size", fSize);
    }

    void setUnicodeRange(String unicodeRange) {
        super.setAttribute("unicode-range", unicodeRange);
    }

    void setUnitsPerEm(String unitsPerEm) {
        super.setAttribute("units-per-em", unitsPerEm);
    }

    void setPanose1(String panose1) {
        super.setAttribute("panose-1", panose1);
    }

    void setStemv(String stemv) {
        super.setAttribute("stemv", stemv);
    }

    void setStemh(String stemh) {
        super.setAttribute("stemh", stemh);
    }

    void setSlope(String slope) {
        super.setAttribute("slope", slope);
    }

    void setCapHeight(String capHeight) {
        super.setAttribute("cap-height", capHeight);
    }

    void setXHeight(String xHeight) {
        super.setAttribute("x-height", xHeight);
    }

    void setAccentHeight(String accentHeight) {
        super.setAttribute("accent-height", accentHeight);
    }

    void setAscent(String ascent) {
        super.setAttribute("ascent", ascent);
    }

    void setDescent(String descent) {
        super.setAttribute("descent", descent);
    }

    void setWidths(String widths) {
        super.setAttribute("widths", widths);
    }

    void setBbox(String bbox) {
        super.setAttribute("bbox", bbox);
    }

    void setIdeographic(String ideographic) {
        super.setAttribute("ideographic", ideographic);
    }

    void setAlphabetic(String alphabetic) {
        super.setAttribute("alphabetic", alphabetic);
    }

    void setMathematical(String mathematical) {
        super.setAttribute("mathematical", mathematical);
    }

    void setHanging(String hanging) {
        super.setAttribute("hanging", hanging);
    }

    void setVIdeographic(String vIdeographic) {
        super.setAttribute("v-ideographic", vIdeographic);
    }

    void setVAlphabetic(String vAlphabetic) {
        super.setAttribute("v-alphabetic", vAlphabetic);
    }

    void setVMathematical(String vMathematical) {
        super.setAttribute("v-mathematical", vMathematical);
    }

    void setVHanging(String vHanging) {
        super.setAttribute("v-hanging", vHanging);
    }

    void setUnderlinePosition(String up) {
        super.setAttribute("underline-position", up);
    }

    void setUnderlineThickness(String ut) {
        super.setAttribute("underline-thickness", ut);
    }

    void setStrikethroughPosition(String sp) {
        super.setAttribute("strikethrough-position", sp);
    }

    void setStrikethroughThickness(String st) {
        super.setAttribute("strikethrou-thickness", st);
    }

    void setOverlinePosition(String op) {
        super.setAttribute("overline-position", op);
    }

    void setOverlineThickness(String ot) {
        super.setAttribute("overline-thickness", ot);
    }
}
