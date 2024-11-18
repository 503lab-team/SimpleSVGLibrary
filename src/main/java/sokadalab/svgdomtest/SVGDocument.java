package sokadalab.svgdomtest;

import org.w3c.dom.*;

public class SVGDocument {
    private Document document;
    private SVG rootElement;

    public SVGDocument(Document var_document) {
        this.document = var_document;
    }

    public Document getDocument() {
        return document;
    }

    public void appendChild(SVG svg) {
        this.document.appendChild(svg.getElement());
    }
    
    // A.java
    public A createA() {
        return new A(this.document);
    }
    
    // AltGlyph.java
    public AltGlyph createAltGlyph() {
        return new AltGlyph(this.document);
    }
    
    // AltGlyphDef.java
    public AltGlyphDef createAltGlyphDef() {
        return new AltGlyphDef(this.document);
    }
    
    // AltGlyphItem.java
    public AltGlyphItem createAltGlyphItem() {
        return new AltGlyphItem(this.document);
    }

    // Animate.java
    public Animate createAnimate() {
        return new Animate(this.document);
    }

    // AnimateColor.java
    public AnimateColor createAnimateColor() {
        return new AnimateColor(this.document);
    }

    // Animate.java
    public AnimateMotion createAnimateMotion() {
        return new AnimateMotion(this.document);
    }

    // Animate.java
    public AnimateTransform createAnimateTransform() {
        return new AnimateTransform(this.document);
    }

    // Circle.java
    public Circle createCircle() {
        return new Circle(this.document);
    }

    // ClipPath.java
    public ClipPath createClipPath() {
        return new ClipPath(this.document);
    }

    // Cursor.java
    public Cursor createCursor() {
        return new Cursor(this.document);
    }
    
    // Defs.java
    public Defs createDefs() {
        return new Defs(this.document);
    }

    // Desc.java
    public Desc createDesc() {
        return new Desc(this.document);
    }

    // Ellipse.java
    public Ellipse createEllipse() {
        return new Ellipse(this.document);
    }

    // Filter.java
    public Filter createFilter() {
        return new Filter(this.document);
    }

    // Font.java
    public Font createFont() {
        return new Font(this.document);
    }

    // FontFace.java
    public FontFace createFontFace() {
        return new FontFace(this.document);
    }

    // FontFaceFormat.java
    public FontFaceFormat createFontFaceFormat() {
        return new FontFaceFormat(this.document);
    }

    // FontFaceName.java
    public FontFaceName createFontFaceName() {
        return new FontFaceName(this.document);
    }

    // FontFaceSrc.java
    public FontFaceSrc createFontFaceSrc() {
        return new FontFaceSrc(this.document);
    }

    // FontFaceUri.java
    public FontFaceUri createFontFaceUri() {
        return new FontFaceUri(this.document);
    }

    // ForeignObject.java
    public ForeignObject createForeignObject() {
        return new ForeignObject(this.document);
    }

    // G.java
    public G createG() {
        return new G(this.document);
    }

    // Glyph.java
    public Glyph createGlyph() {
        return new Glyph(this.document);
    }

    // GlyphRef.java
    public GlyphRef createGlyphRef() {
        return new GlyphRef(this.document);
    }

    // Hkern.java
    public Hkern createHkern() {
        return new Hkern(this.document);
    }

    // Image.java
    public Image createImage() {
        return new Image(this.document);
    }

    // Line.java
    public Line createLine() {
        return new Line(this.document);
    }

    // LinearGradient.java
    public LinearGradient createLinearGradient() {
        return new LinearGradient(this.document);
    }

    // Marker.java
    public Marker createMarker() {
        return new Marker(this.document);
    }

    // Mask.java
    public Mask createMask() {
        return new Mask(this.document);
    }

    // Metadata.java
    public Metadata createMetadata() {
        return new Metadata(this.document);
    }

    // MissingGlyph.java
    public MissingGlyph createMissingGlyph() {
        return new MissingGlyph(this.document);
    }

    // Path.java
    public Path createPath() {
        return new Path(this.document);
    }

    // Pattern.java
    public Pattern createPattern() {
        return new Pattern(this.document);
    }

    // Polygon.java
    public Polygon createPolygon() {
        return new Polygon(this.document);
    }

    // Polyline.java
    public Polyline createPolyline() {
        return new Polyline(this.document);
    }
            
    // RadialGradient.java
    public RadialGradient createRadialGradient() {
        return new RadialGradient(this.document);
    }
    
    // Rect.java
    public Rect createRect() {
        return new Rect(this.document);
    }

    // SVG.java
    public SVG createSVG() {
        this.rootElement = new SVG(this.document);
        return this.rootElement;
    }
    
    // Script.java
    public Script createScript() {
        return new Script(this.document);
    }

    // Set.java
    public Set createSet() {
        return new Set(this.document);
    }

    // Stop.java
    public Stop createStop() {
        return new Stop(this.document);
    }

    // Style.java
    public Style createStyle() {
        return new Style(this.document);
    }

    // Switch.java
    public Switch createSwitch() {
        return new Switch(this.document);
    }

    // Symbol.java
    public Symbol createSymbol() {
        return new Symbol(this.document);
    }
    
    // Text.java
    public Text createText() {
        return new Text(this.document);
    }

    // TextPath.java
    public TextPath createTextPath() {
        return new TextPath(this.document);
    }  

    // Title.java
    public Title createTitle() {
        return new Title(this.document);
    }

    // Tref.java
    public Tref createTref() {
        return new Tref(this.document);
    }    

    // Tspan.java
    public Tspan createTspan() {
        return new Tspan(this.document);
    }

    // Use.java
    public Use createUse() {
        return new Use(this.document);
    }

    // Vkern.java
    public Vkern createVkern() {
        return new Vkern(this.document);
    }
}
