package sokadalab.svgdomtest;

import org.w3c.dom.Document;

/**
 * font-face要素<br>
 * https://www.w3.org/TR/SVG11/fonts.html#FontFaceElement<br>
 * https://www.w3.org/TR/SVG11/fonts.html#InterfaceSVGFontFaceElement
 */
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
    private float strikethroughThickness;
    private float overlinePosition;
    private float overlineThickness;

    /**
     * コンストラクタ
     * @param document ドキュメント
     */
    public FontFace(Document document) {
        super(document, "font-face");
    }

    /**
     * 属性font-familyの取得
     * @return 属性font-family
     */
    public String getFontFamily() {
        return this.fontFamily;
    }

    /**
     * 属性font-styleの取得
     * @return 属性font-style
     */
    public String getFontStyle() {
        return this.fontStyle;
    }

    /**
     * 属性font-variantの取得
     * @return 属性font-variant
     */
    public String getFontVariant() {
        return this.fontVariant;
    }

    /**
     * 属性font-weightの取得
     * @return 属性font-weight
     */
    public String getFontWeight() {
        return this.fontWeight;
    }

    /**
     * 属性font-stretchの取得
     * @return 属性font-stretch
     */
    public String getFontStretch() {
        return this.fontStretch;
    }

    /**
     * 属性font-sizeの取得
     * @return 属性font-size
     */
    public String getFontSize() {
        return this.fontSize;
    }

    /**
     * 属性unicode-rangeの取得
     * @return 属性unicode-range
     */
    public String getUnicodeRange() {
        return this.unicodeRange;
    }

    /**
     * 属性units-per-emの取得
     * @return 属性units-per-em
     */
    public float getUnitsPerEm() {
        return this.unitsPerEm;
    }

    /**
     * 属性panose-1の取得
     * @return 属性panose-1
     */
    public int getPanose1() {
        return this.panose1;
    }

    /**
     * 属性stemvの取得
     * @return 属性stemv
     */
    public float getStemv() {
        return this.stemv;
    }

    /**
     * 属性stemhの取得
     * @return 属性stemh
     */
    public float getStemh() {
        return this.stemh;
    }

    /**
     * 属性slopeの取得
     * @return 属性slope
     */
    public float getSlope() {
        return this.slope;
    }

    /**
     * 属性cap-heightの取得
     * @return 属性cap-height
     */
    public float getCapHeight() {
        return this.capHeight;
    }

    /**
     * 属性x-heightの取得
     * @return 属性x-height
     */
    public float getXHeight() {
        return this.xHeight;
    }

    /**
     * 属性accent-heightの取得
     * @return 属性accent-height
     */
    public float getAccentHeight() {
        return this.accentHeight;
    }

    /**
     * 属性ascentの取得
     * @return 属性ascent
     */
    public float getAscent() {
        return this.ascent;
    }

    /**
     * 属性descentの取得
     * @return 属性descent
     */
    public float getDescent() {
        return this.descent;
    }

    /**
     * 属性widthsの取得
     * @return 属性widths
     */
    public String getWidths() {
        return this.widths;
    }

    /**
     * 属性bboxの取得
     * @return 属性bbox
     */
    public String getBbox() {
        return this.bbox;
    }

    /**
     * 属性ideographicの取得
     * @return 属性ideographic
     */
    public float getIdeographic() {
        return this.ideographic;
    }

    /**
     * 属性alphabeticの取得
     * @return 属性alphabetic
     */
    public float getAlphabetic() {
        return this.alphabetic;
    }

    /**
     * 属性mathematicalの取得
     * @return 属性mathematical
     */
    public float getMathematical() {
        return this.mathematical;
    }

    /**
     * 属性hangingの取得
     * @return 属性hanging
     */
    public float getHanging() {
        return this.hanging;
    }

    /**
     * 属性v-ideographicの取得
     * @return 属性v-ideographic
     */
    public float getVIdeographic() {
        return this.vIdeographic;
    }

    /**
     * 属性v-alphabeticの取得
     * @return 属性v-alphabetic
     */
    public float getVAlphabetic() {
        return this.vAlphabetic;
    }

    /**
     * 属性v-mathematicalの取得
     * @return 属性v-mathematical
     */
    public float getVMathematical() {
        return this.vMathematical;
    }

    /**
     * 属性v-hangingの取得
     * @return 属性v-hanging
     */
    public float getVHanging() {
        return this.vHanging;
    }

    /**
     * 属性underline-positionの取得
     * @return 属性underline-position
     */
    public float getUnderlinePosition() {
        return this.underlinePosition;
    }

    /**
     * 属性underline-thicknessの取得
     * @return 属性underline-thickness
     */
    public float getUnderlineThickness() {
        return this.underlineThickness;
    }

    /**
     * 属性strikethrough-positionの取得
     * @return 属性strikethrough-position
     */
    public float getStrikethroughPosition() {
        return this.strikethroughPosition;
    }

    /**
     * 属性strikethrough-thicknessの取得
     * @return 属性strikethrough-thickness
     */
    public float getStrikethroughThickness() {
        return this.strikethroughThickness;
    }

    /**
     * 属性overline-positionの取得
     * @return 属性overline-position
     */
    public float getOverlinePosition() {
        return this.overlinePosition;
    }

    /**
     * 属性overline-thicknessの取得
     * @return 属性overline-thickness
     */
    public float getOverlineThickness() {
        return this.overlineThickness;
    }

    /**
     * 属性font-familyのセット
     * @param fFamily 属性font-familyに与える値
     */
    public void setFontFamily(String fFamily) {
        this.fontFamily = fFamily;
        super.setAttribute("font-family", this.fontFamily);
    }
    public void setFontFamily(float fFamily) {
        this.fontFamily = String.valueOf(fFamily);
        super.setAttribute("font-family", this.fontFamily);
    }

    /**
     * 属性font-styleのセット
     * @param fStyle 属性font-styleに与える値
     */
    public void setFontStyle(String fStyle) {
        this.fontStyle = fStyle;
        super.setAttribute("font-style", this.fontStyle);
    }
    public void setFontStyle(float fStyle) {
        this.fontStyle = String.valueOf(fStyle);
        super.setAttribute("font-style", this.fontStyle);
    }

    /**
     * 属性font-variantのセット
     * @param fVariant 属性font-variantに与える値
     */
    public void setFontVariant(String fVariant) {
        this.fontVariant = fVariant;
        super.setAttribute("font-variant", this.fontVariant);
    }
    public void setFontVariant(float fVariant) {
        this.fontVariant = String.valueOf(fVariant);
        super.setAttribute("font-variant", this.fontVariant);
    }

    /**
     * 属性font-weightのセット
     * @param fWeight 属性font-weightに与える値
     */
    public void setFontWeight(String fWeight) {
        this.fontWeight = fWeight;
        super.setAttribute("font-weight", this.fontWeight);
    }
    public void setFontWeight(float fWeight) {
        this.fontWeight = String.valueOf(fWeight);
        super.setAttribute("font-weight", this.fontWeight);
    }

    /**
     * 属性font-stretchのセット
     * @param fStretch 属性font-stretchに与える値
     */
    public void setFontStretch(String fStretch) {
        this.fontStretch = fStretch;
        super.setAttribute("font-stretch", this.fontStretch);
    }
    public void setFontStretch(float fStretch) {
        this.fontStretch = String.valueOf(fStretch);
        super.setAttribute("font-stretch", this.fontStretch);
    }

    /**
     * 属性font-sizeのセット
     * @param fSize 属性font-sizeに与える値
     */
    public void setFontSize(String fSize) {
        this.fontSize = fSize;
        super.setAttribute("font-size", this.fontSize);
    }
    public void setFontSize(float fSize) {
        this.fontSize = String.valueOf(fSize);
        super.setAttribute("font-size", this.fontSize);
    }

    /**
     * 属性unicode-rangeのセット
     * @param unicodeRange 属性unicode-rangeに与える値
     */
    public void setUnicodeRange(String unicodeRange) {
        this.unicodeRange = unicodeRange;
        super.setAttribute("unicode-range", this.unicodeRange);
    }
    public void setUnicodeRange(float unicodeRange) {
        this.unicodeRange = String.valueOf(unicodeRange);
        super.setAttribute("unicode-range", this.unicodeRange);
    }

    /**
     * 属性units-per-emのセット
     * @param unitsPerEm 属性units-per-emに与える値
     */
    public void setUnitsPerEm(String unitsPerEm) {
        this.unitsPerEm = Float.parseFloat(unitsPerEm);
        super.setAttribute("units-per-em", String.valueOf(this.unitsPerEm));
    }
    public void setUnitsPerEm(float unitsPerEm) {
        this.unitsPerEm = unitsPerEm;
        super.setAttribute("units-per-em", String.valueOf(this.unitsPerEm));
    }

    /**
     * 属性panose-1のセット
     * @param panose1 属性panose-1に与える値
     */
    public void setPanose1(String panose1) {
        this.panose1 = Integer.parseInt(panose1);
        super.setAttribute("panose-1", String.valueOf(this.panose1));
    }
    public void setPanose1(int panose1) {
        this.panose1 = panose1;
        super.setAttribute("panose-1", String.valueOf(this.panose1));
    }

    /**
     * 属性stemvのセット
     * @param stemv 属性stemvに与える値
     */
    public void setStemv(String stemv) {
        this.stemv = Float.parseFloat(stemv);
        super.setAttribute("stemv", String.valueOf(this.stemv));
    }
    public void setStemv(float stemv) {
        this.stemv = stemv;
        super.setAttribute("stemv", String.valueOf(this.stemv));
    }

    /**
     * 属性stemhのセット
     * @param stemh 属性stemhに与える値
     */
    public void setStemh(String stemh) {
        this.stemh = Float.parseFloat(stemh);
        super.setAttribute("stemh", String.valueOf(this.stemh));
    }
    public void setStemh(float stemh) {
        this.stemh = stemh;
        super.setAttribute("stemh", String.valueOf(this.stemh));
    }

    /**
     * 属性slopeのセット
     * @param slope 属性slopeに与える値
     */
    public void setSlope(String slope) {
        this.slope = Float.parseFloat(slope);
        super.setAttribute("slope", String.valueOf(this.slope));
    }
    public void setSlope(float slope) {
        this.slope = slope;
        super.setAttribute("slope", String.valueOf(this.slope));
    }

    /**
     * 属性cap-heightのセット
     * @param capHeight 属性cap-heightに与える値
     */
    public void setCapHeight(String capHeight) {
        this.capHeight = Float.parseFloat(capHeight);
        super.setAttribute("cap-height", String.valueOf(this.capHeight));
    }
    public void setCapHeight(float capHeight) {
        this.capHeight = capHeight;
        super.setAttribute("cap-height", String.valueOf(this.capHeight));
    }

    /**
     * 属性x-heightのセット
     * @param xHeight 属性x-heightに与える値
     */
    public void setXHeight(String xHeight) {
        this.xHeight = Float.parseFloat(xHeight);
        super.setAttribute("x-height", String.valueOf(this.xHeight));
    }
    public void setXHeight(float xHeight) {
        this.xHeight = xHeight;
        super.setAttribute("x-height", String.valueOf(this.xHeight));
    }

    /**
     * 属性accent-heightのセット
     * @param accentHeight 属性accent-heightに与える値
     */
    public void setAccentHeight(String accentHeight) {
        this.accentHeight = Float.parseFloat(accentHeight);
        super.setAttribute("accent-height", String.valueOf(this.accentHeight));
    }
    public void setAccentHeight(float accentHeight) {
        this.accentHeight = accentHeight;
        super.setAttribute("accent-height", String.valueOf(this.accentHeight));
    }

    /**
     * 属性ascentのセット
     * @param ascent 属性ascentに与える値
     */
    public void setAscent(String ascent) {
        this.ascent = Float.parseFloat(ascent);
        super.setAttribute("ascent", String.valueOf(this.ascent));
    }
    public void setAscent(float ascent) {
        this.ascent = ascent;
        super.setAttribute("ascent", String.valueOf(this.ascent));
    }

    /**
     * 属性descentのセット
     * @param descent 属性descentに与える値
     */
    public void setDescent(String descent) {
        this.descent = Float.parseFloat(descent);
        super.setAttribute("descent", String.valueOf(this.descent));
    }
    public void setDescent(float descent) {
        this.descent = descent;
        super.setAttribute("descent", String.valueOf(this.descent));
    }

    /**
     * 属性widthsのセット
     * @param widths 属性widthに与える値
     */
    public void setWidths(String widths) {
        this.widths = widths;
        super.setAttribute("widths", this.widths);
    }
    public void setWidths(float widths) {
        this.widths = String.valueOf(widths);
        super.setAttribute("widths", this.widths);
    }

    /**
     * 属性bboxのセット
     * @param bbox 属性bboxに与える値
     */
    public void setBbox(String bbox) {
        this.bbox = bbox;
        super.setAttribute("bbox", this.bbox);
    }
    public void setBbox(float bbox) {
        this.bbox = String.valueOf(bbox);
        super.setAttribute("bbox", this.bbox);
    }

    /**
     * 属性ideographicのセット
     * @param ideographic 属性ideographicに与える値
     */
    public void setIdeographic(String ideographic) {
        this.ideographic = Float.parseFloat(ideographic);
        super.setAttribute("ideographic", String.valueOf(this.ideographic));
    }
    public void setIdeographic(float ideographic) {
        this.ideographic = ideographic;
        super.setAttribute("ideographic", String.valueOf(this.ideographic));
    }

    /**
     * 属性alphabeticのセット
     * @param alphabetic 属性alphabeticに与える値
     */
    public void setAlphabetic(String alphabetic) {
        this.alphabetic = Float.parseFloat(alphabetic);
        super.setAttribute("alphabetic", String.valueOf(this.alphabetic));
    }
    public void setAlphabetic(float alphabetic) {
        this.alphabetic = alphabetic;
        super.setAttribute("alphabetic", String.valueOf(this.alphabetic));
    }

    /**
     * 属性mathematicalのセット
     * @param mathematical 属性mathematicalに与える値
     */
    public void setMathematical(String mathematical) {
        this.mathematical = Float.parseFloat(mathematical);
        super.setAttribute("mathematical", String.valueOf(this.mathematical));
    }
    public void setMathematical(float mathematical) {
        this.mathematical = mathematical;
        super.setAttribute("mathematical", String.valueOf(this.mathematical));
    }

    /**
     * 属性hangingのセット
     * @param hanging 属性hangingに与える値
     */
    public void setHanging(String hanging) {
        this.hanging = Float.parseFloat(hanging);
        super.setAttribute("hanging", String.valueOf(this.hanging));
    }
    public void setHanging(float hanging) {
        this.hanging = hanging;
        super.setAttribute("hanging", String.valueOf(this.hanging));
    }

    /**
     * 属性v-ideographicのセット
     * @param vIdeographic 属性v-ideographicに与える値
     */
    public void setVIdeographic(String vIdeographic) {
        this.vIdeographic = Float.parseFloat(vIdeographic);
        super.setAttribute("v-ideographic", String.valueOf(this.vIdeographic));
    }
    public void setVIdeographic(float vIdeographic) {
        this.vIdeographic = vIdeographic;
        super.setAttribute("v-ideographic", String.valueOf(this.vIdeographic));
    }

    /**
     * 属性v-alphabeticのセット
     * @param vAlphabetic 属性v-alphabeticに与える値
     */
    public void setVAlphabetic(String vAlphabetic) {
        this.vAlphabetic = Float.parseFloat(vAlphabetic);
        super.setAttribute("v-alphabetic", String.valueOf(this.vAlphabetic));
    }
    public void setVAlphabetic(float vAlphabetic) {
        this.vAlphabetic = vAlphabetic;
        super.setAttribute("v-alphabetic", String.valueOf(this.vAlphabetic));
    }

    /**
     * 属性v-mathematicalのセット
     * @param vMathematical 属性v-mathematicalに与える値
     */
    public void setVMathematical(String vMathematical) {
        this.vMathematical = Float.parseFloat(vMathematical);
        super.setAttribute("v-mathematical", String.valueOf(this.vMathematical));
    }
    public void setVMathematical(float vMathematical) {
        this.vMathematical = vMathematical;
        super.setAttribute("v-mathematical", String.valueOf(this.vMathematical));
    }

    /**
     * 属性v-hangingのセット
     * @param vHanging 属性v-hangingに与える値
     */
    public void setVHanging(String vHanging) {
        this.vHanging = Float.parseFloat(vHanging);
        super.setAttribute("v-hanging", String.valueOf(this.vHanging));
    }
    public void setVHanging(float vHanging) {
        this.vHanging = vHanging;
        super.setAttribute("v-hanging", String.valueOf(this.vHanging));
    }

    /**
     * 属性underline-positionのセット
     * @param up 属性underline-positionに与える値
     */
    public void setUnderlinePosition(String up) {
        this.underlinePosition = Float.parseFloat(up);
        super.setAttribute("underline-position", String.valueOf(this.underlinePosition));
    }
    public void setUnderlinePosition(float up) {
        this.underlinePosition = up;
        super.setAttribute("underline-position", String.valueOf(this.underlinePosition));
    }

    /**
     * 属性underline-thicknessのセット
     * @param ut 属性underline-thicknessに与える値
     */
    public void setUnderlineThickness(String ut) {
        this.underlineThickness = Float.parseFloat(ut);
        super.setAttribute("underline-thickness", String.valueOf(this.underlineThickness));
    }
    public void setUnderlineThickness(float ut) {
        this.underlineThickness = ut;
        super.setAttribute("underline-thickness", String.valueOf(this.underlineThickness));
    }

    /**
     * 属性strikethrough-positionのセット
     * @param sp 属性strikethrough-positionに与える値
     */
    public void setStrikethroughPosition(String sp) {
        this.strikethroughPosition = Float.parseFloat(sp);
        super.setAttribute("strikethrough-position", String.valueOf(this.strikethroughPosition));
    }
    public void setStrikethroughPosition(float sp) {
        this.strikethroughPosition = sp;
        super.setAttribute("strikethrough-position", String.valueOf(this.strikethroughPosition));
    }

    /**
     * 属性strikethrough-thicknessのセット
     * @param st 属性strikethrough-thicknessに与える値
     */
    public void setStrikethroughThickness(String st) {
        this.strikethroughThickness = Float.parseFloat(st);
        super.setAttribute("strikethrough-thickness", String.valueOf(this.strikethroughThickness));
    }
    public void setStrikethroughThickness(float st) {
        this.strikethroughThickness = st;
        super.setAttribute("strikethrough-thickness", String.valueOf(this.strikethroughThickness));
    }

    /**
     * 属性overline-positionのセット
     * @param op 属性overline-positionに与える値
     */
    public void setOverlinePosition(String op) {
        this.overlinePosition = Float.parseFloat(op);
        super.setAttribute("overline-position", String.valueOf(this.overlinePosition));
    }
    public void setOverlinePosition(float op) {
        this.overlinePosition = op;
        super.setAttribute("overline-position", String.valueOf(this.overlinePosition));
    }

    /**
     * 属性overline-thicknessのセット
     * @param ot 属性overline-thicknessに与える値
     */
    public void setOverlineThickness(String ot) {
        this.overlineThickness = Float.parseFloat(ot);
        super.setAttribute("overline-thickness", String.valueOf(this.overlineThickness));
    }
    public void setOverlineThickness(float ot) {
        this.overlineThickness = ot;
        super.setAttribute("overline-thickness", String.valueOf(this.overlineThickness));
    }
}
