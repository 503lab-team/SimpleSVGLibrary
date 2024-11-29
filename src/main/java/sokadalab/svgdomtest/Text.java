// <text>要素

package sokadalab.svgdomtest;

import org.w3c.dom.Document;

public class Text extends TextPositioningElement {
    public Text(Document document){
        super(document, "text");
    }
}