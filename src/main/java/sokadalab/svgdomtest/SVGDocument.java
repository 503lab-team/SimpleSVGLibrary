package sokadalab.svgdomtest;

import org.w3c.dom.*;

public class SVGDocument {
    private Document document;
    private SVG rootElement;

    SVGDocument(Document var_document) {
        this.document = var_document;
    }

    Document getDocument() {
        return document;
    }

    public void appendChild(SVG svg) {
        this.document.appendChild(svg.getElement());
    }
    
    // A.java
    A createA() {
        return new A(this.document);
    }
    
    // AltGlyph.java
    AltGlyph createAltGlyph() {
        return new AltGlyph(this.document);
    }
    
    // AltGlyphDef.java
    AltGlyphDef createAltGlyphDef() {
        return new AltGlyphDef(this.document);
    }
    
    // AltGlyphItem.java
    AltGlyphItem createAltGlyphItem() {
        return new AltGlyphItem(this.document);
    }

    // Animate.java
    Animate createAnimate() {
        return new Animate(this.document);
    }

    // AnimateColor.java
    AnimateColor createAnimateColor() {
        return new AnimateColor(this.document);
    }

    // Animate.java
    AnimateMotion createAnimateMotion() {
        return new AnimateMotion(this.document);
    }

    // Animate.java
    AnimateTransform createAnimateTransform() {
        return new AnimateTransform(this.document);
    }

    // Circle.java
    Circle createCircle() {
        return new Circle(this.document);
    }

    // ClipPath.java
    ClipPath createClipPath() {
        return new ClipPath(this.document);
    }

    // Cursor.java
    Cursor createCursor() {
        return new Cursor(this.document);
    }
    
    // Defs.java
    Defs createDefs() {
        return new Defs(this.document);
    }

    // Desc.java
    Desc createDesc() {
        return new Desc(this.document);
    }

    // Ellipse.java
    Ellipse createEllipse() {
        return new Ellipse(this.document);
    }

    // Filter.java
    Filter createFilter() {
        return new Filter(this.document);
    }

    // Font.java
    Font createFont() {
        return new Font(this.document);
    }

    // FontFace.java
    FontFace createFontFace() {
        return new FontFace(this.document);
    }

    // FontFaceFormat.java
    FontFaceFormat createFontFaceFormat() {
        return new FontFaceFormat(this.document);
    }

    // FontFaceName.java
    FontFaceName createFontFaceName() {
        return new FontFaceName(this.document);
    }

    // FontFaceSrc.java
    FontFaceSrc createFontFaceSrc() {
        return new FontFaceSrc(this.document);
    }

    // FontFaceUri.java
    FontFaceUri createFontFaceUri() {
        return new FontFaceUri(this.document);
    }

    // ForeignObject.java
    ForeignObject createForeignObject() {
        return new ForeignObject(this.document);
    }

    // G.java
    G createG() {
        return new G(this.document);
    }

    // Glyph.java
    Glyph createGlyph() {
        return new Glyph(this.document);
    }

    // GlyphRef.java
    GlyphRef createGlyphRef() {
        return new GlyphRef(this.document);
    }

    // Hkern.java
    Hkern createHkern() {
        return new Hkern(this.document);
    }

    // Image.java
    Image createImage() {
        return new Image(this.document);
    }

    // Line.java
    Line createLine() {
        return new Line(this.document);
    }

    // LinearGradient.java
    LinearGradient createLinearGradient() {
        return new LinearGradient(this.document);
    }

    // Marker.java
    Marker createMarker() {
        return new Marker(this.document);
    }

    // Mask.java
    Mask createMask() {
        return new Mask(this.document);
    }

    // Metadata.java
    Metadata createMetadata() {
        return new Metadata(this.document);
    }

    // MissingGlyph.java
    MissingGlyph createMissingGlyph() {
        return new MissingGlyph(this.document);
    }

    // Path.java
    Path createPath() {
        return new Path(this.document);
    }

    // Pattern.java
    Pattern createPattern() {
        return new Pattern(this.document);
    }

    // Polygon.java
    Polygon createPolygon() {
        return new Polygon(this.document);
    }

    // Polyline.java
    Polyline createPolyline() {
        return new Polyline(this.document);
    }
            
   // RadialGradient.java
    RadialGradient createRadialGradient() {
        return new RadialGradient(this.document);
    }
    
    // Rect.java
    Rect createRect() {
        return new Rect(this.document);
    }

    // SVG.java
    SVG createSVG() {
        this.rootElement = new SVG(this.document);
        return this.rootElement;
    }
    
    // Script.java
    Script createScript() {
        return new Script(this.document);
    }

    // Set.java
    Set createSet() {
        return new Set(this.document);
    }

    // Stop.java
    Stop createStop() {
        return new Stop(this.document);
    }

    // Style.java
    Style createStyle() {
        return new Style(this.document);
    }

    // Switch.java
    Switch createSwitch() {
        return new Switch(this.document);
    }

    // Symbol.java
    Symbol createSymbol() {
        return new Symbol(this.document);
    }
    
    // Text.java
    Text createText() {
        return new Text(this.document);
    }

    // TextPath.java
    TextPath createTextPath() {
        return new TextPath(this.document);
    }  

    // Title.java
    Title createTitle() {
        return new Title(this.document);
    }

    // Tref.java
    Tref createTref() {
        return new Tref(this.document);
    }    

    // Tspan.java
    Tspan createTspan() {
        return new Tspan(this.document);
    }

    // Use.java
    Use createUse() {
        return new Use(this.document);
    }

    // Vkern.java
    Vkern createVkern() {
        return new Vkern(this.document);
    }
}
