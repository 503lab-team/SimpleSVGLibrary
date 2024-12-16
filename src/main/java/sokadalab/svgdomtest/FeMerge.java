package sokadalab.svgdomtest;

import org.w3c.dom.Document;

/**
 * feMerge要素<br>
 * https://www.w3.org/TR/SVG11/filters.html#feMergeElement<br>
 * https://www.w3.org/TR/SVG11/filters.html#InterfaceSVGFEMergeElement
 */
public class FeMerge extends FeStandardAttributes {
    public FeMerge(Document document) {
        super(document, "feMerge");
    }
}
