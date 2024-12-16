package sokadalab.svgdomtest;

import org.w3c.dom.*;

/**
 * SVGドキュメント
 * SVGの各要素の生成は以下のメソッドを使用する
 */
public class SVGDocument {
    private Document document;
    private SVG rootElement;

    /**
     * コンストラクタ
     * @param var_document ドキュメント
     */
    public SVGDocument(Document var_document) {
        this.document = var_document;
    }

    /**
     * ドキュメントの取得
     * @return ドキュメント
     */
    public Document getDocument() {
        return document;
    }

    /**
     * SVG要素を子要素に追加
     * @param svg SVG要素
     */
    public void appendChild(SVG svg) {
        this.document.appendChild(svg.getElement());
    }
    
    /**
     * a要素の生成
     * @return a要素
     */
    public A createA() {
        return new A(this.document);
    }
    
    /**
     * altGlyph要素の生成
     * @return altGlyph要素
     */
    public AltGlyph createAltGlyph() {
        return new AltGlyph(this.document);
    }
    
    /**
     * altGlyphDef要素の生成
     * @return altGlyphDef要素
     */
    public AltGlyphDef createAltGlyphDef() {
        return new AltGlyphDef(this.document);
    }
    
    /**
     * altGlyphItem要素の生成
     * @return altGlyphItem要素
     */
    public AltGlyphItem createAltGlyphItem() {
        return new AltGlyphItem(this.document);
    }

    /**
     * animate要素の生成
     * @return animate要素
     */
    public Animate createAnimate() {
        return new Animate(this.document);
    }

    /**
     * animateColor要素の生成
     * @return animateColor要素
     */
    public AnimateColor createAnimateColor() {
        return new AnimateColor(this.document);
    }

    /**
     * animateMotion要素の生成
     * @return animateMotion要素
     */
    public AnimateMotion createAnimateMotion() {
        return new AnimateMotion(this.document);
    }

    /**
     * animateTransform要素の生成
     * @return animateTransform要素
     */
    public AnimateTransform createAnimateTransform() {
        return new AnimateTransform(this.document);
    }

    /**
     * circle要素の生成
     * @return circle要素
     */
    public Circle createCircle() {
        return new Circle(this.document);
    }

    /**
     * clipPath要素の生成
     * @return clipPath要素
     */
    public ClipPath createClipPath() {
        return new ClipPath(this.document);
    }

    /**
     * cursor要素の生成
     * @return cursor要素
     */
    public Cursor createCursor() {
        return new Cursor(this.document);
    }
    
    /**
     * defs要素の生成
     * @return defs要素
     */
    public Defs createDefs() {
        return new Defs(this.document);
    }

    /**
     * desc要素の生成
     * @return desc要素
     */
    public Desc createDesc() {
        return new Desc(this.document);
    }

    /**
     * ellipse要素の生成
     * @return ellipse要素
     */
    public Ellipse createEllipse() {
        return new Ellipse(this.document);
    }

    /**
     * filter要素の生成
     * @return filter要素
     */
    public Filter createFilter() {
        return new Filter(this.document);
    }

    /**
     * font要素の生成
     * @return font要素
     */
    public Font createFont() {
        return new Font(this.document);
    }

    /**
     * font-face要素の生成
     * @return font-face要素
     */
    public FontFace createFontFace() {
        return new FontFace(this.document);
    }

    /**
     * font-face-format要素の生成
     * @return font-face-format要素
     */
    public FontFaceFormat createFontFaceFormat() {
        return new FontFaceFormat(this.document);
    }

    /**
     * font-face-name要素の生成
     * @return font-face-name要素
     */
    public FontFaceName createFontFaceName() {
        return new FontFaceName(this.document);
    }

    /**
     * font-face-src要素の生成
     * @return font-face-src要素
     */
    public FontFaceSrc createFontFaceSrc() {
        return new FontFaceSrc(this.document);
    }

    /**
     * font-face-uri要素の生成
     * @return font-face-uri要素
     */
    public FontFaceUri createFontFaceUri() {
        return new FontFaceUri(this.document);
    }

    /**
     * foreignObject要素の生成
     * @return foreignObject要素
     */
    public ForeignObject createForeignObject() {
        return new ForeignObject(this.document);
    }

    /**
     * g要素の生成
     * @return g要素
     */
    public G createG() {
        return new G(this.document);
    }

    /**
     * glyph要素の生成
     * @return glyph要素
     */
    public Glyph createGlyph() {
        return new Glyph(this.document);
    }

    /**
     * glyphRef要素の生成
     * @return glyphRef要素
     */
    public GlyphRef createGlyphRef() {
        return new GlyphRef(this.document);
    }

    /**
     * hkern要素の生成
     * @return hkern要素
     */
    public Hkern createHkern() {
        return new Hkern(this.document);
    }

    /**
     * image要素の生成
     * @return image要素
     */
    public Image createImage() {
        return new Image(this.document);
    }

    /**
     * line要素の生成
     * @return line要素
     */
    public Line createLine() {
        return new Line(this.document);
    }

    /**
     * linearGradient要素の生成
     * @return linearGradient要素
     */
    public LinearGradient createLinearGradient() {
        return new LinearGradient(this.document);
    }

    /**
     * mpath要素の生成
     * @return mpath要素
     */
    public MPath createMPath() {
        return new MPath(this.document);
    }

    /**
     * marker要素の生成
     * @return marker要素
     */
    public Marker createMarker() {
        return new Marker(this.document);
    }

    /**
     * mask要素の生成
     * @return mask要素
     */
    public Mask createMask() {
        return new Mask(this.document);
    }

    /**
     * metadata要素の生成
     * @return metadata要素
     */
    public Metadata createMetadata() {
        return new Metadata(this.document);
    }

    /**
     * missing-glyph要素の生成
     * @return missing-glyph要素
     */
    public MissingGlyph createMissingGlyph() {
        return new MissingGlyph(this.document);
    }

    /**
     * path要素の生成
     * @return path要素
     */
    public Path createPath() {
        return new Path(this.document);
    }

    /**
     * pattern要素の生成
     * @return pattern要素
     */
    public Pattern createPattern() {
        return new Pattern(this.document);
    }

    /**
     * polygon要素の生成
     * @return polygon要素
     */
    public Polygon createPolygon() {
        return new Polygon(this.document);
    }

    /**
     * polyline要素の生成
     * @return polyline要素
     */
    public Polyline createPolyline() {
        return new Polyline(this.document);
    }
            
    /**
     * radialGradient要素の生成
     * @return radialGradient要素
     */
    public RadialGradient createRadialGradient() {
        return new RadialGradient(this.document);
    }
    
    /**
     * rect要素の生成
     * @return rect要素
     */
    public Rect createRect() {
        return new Rect(this.document);
    }

    /**
     * SVG要素の生成
     * @return SVG要素
     */
    public SVG createSVG() {
        this.rootElement = new SVG(this.document);
        return this.rootElement;
    }
    
    /**
     * script要素の生成
     * @return script要素
     */
    public Script createScript() {
        return new Script(this.document);
    }

    /**
     * set要素の生成
     * @return set要素
     */
    public Set createSet() {
        return new Set(this.document);
    }

    /**
     * stop要素の生成
     * @return stop要素
     */
    public Stop createStop() {
        return new Stop(this.document);
    }

    /**
     * style要素の生成
     * @return style要素
     */
    public Style createStyle() {
        return new Style(this.document);
    }

    /**
     * switch要素の生成
     * @return switch要素
     */
    public Switch createSwitch() {
        return new Switch(this.document);
    }

    /**
     * symbol要素の生成
     * @return symbol要素
     */
    public Symbol createSymbol() {
        return new Symbol(this.document);
    }
    
    /**
     * text要素の生成
     * @return text要素
     */
    public Text createText() {
        return new Text(this.document);
    }

    /**
     * textPath要素の生成
     * @return textPath要素
     */
    public TextPath createTextPath() {
        return new TextPath(this.document);
    }  

    /**
     * title要素の生成
     * @return title要素
     */
    public Title createTitle() {
        return new Title(this.document);
    }

    /**
     * tref要素の生成
     * @return tref要素
     */
    public Tref createTref() {
        return new Tref(this.document);
    }    

    /**
     * tspan要素の生成
     * @return tspan要素
     */
    public Tspan createTspan() {
        return new Tspan(this.document);
    }

    /**
     * use要素の生成
     * @return use要素
     */
    public Use createUse() {
        return new Use(this.document);
    }

    /**
     * vkern要素の生成
     * @return vkern要素
     */
    public Vkern createVkern() {
        return new Vkern(this.document);
    }
}
