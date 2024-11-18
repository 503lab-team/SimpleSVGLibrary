package sokadalab.svgdomtest;

import org.w3c.dom.Document;

class Text extends TextPositioningElement {
    Text(Document document){
        super(document, "text");
    }
}