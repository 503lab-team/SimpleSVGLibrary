package sokadalab.svgdomtest;

import org.w3c.dom.Document;

/**
 * text要素<br>
 * https://www.w3.org/TR/SVG11/text.html#TextElement<br>
 * https://www.w3.org/TR/SVG11/text.html#InterfaceSVGTextElement
 */
public class Text extends TextPositioningElement {
    /**
     * コンストラクタ
     * @param document ドキュメント
     */
    public Text(Document document){
        super(document, "text");
    }
}