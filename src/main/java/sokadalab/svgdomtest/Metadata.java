package sokadalab.svgdomtest;

import org.w3c.dom.Document;

/**
 * metadata要素
 * https://www.w3.org/TR/SVG11/metadata.html#MetadataElement<br>
 * https://www.w3.org/TR/SVG11/metadata.html#InterfaceSVGMetadataElement
 */
public class Metadata extends SVGLangSpace {
    /**
     * コンストラクタ
     * @param document ドキュメント
     */
    public Metadata(Document document) {
        super(document, "metadata");
    }
}
