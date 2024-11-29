package sokadalab.svgdomtest;

import org.w3c.dom.Document;

public class Symbol extends SVGElement {
    private SVGLengthList viewBox = new SVGLengthList();

    public Symbol(Document document) {
        super(document, "symbol");
    }

    public SVGLengthList getViewBox() {
        return this.viewBox;
    }

    public void setViewBox(SVGLengthList viewBox) {
        this.viewBox = viewBox;
        super.setAttribute("viewBox", this.viewBox.getAllItem());
    }
    public void setViewBox(String viewBox) {
        String[] list = viewBox.split(" ");     // 空白文字で区切ると想定
        for (int i = 0; i < list.length; i++) {
            this.viewBox.appendItem(list[i]);
        }
        super.setAttribute("viewBox", this.viewBox.getAllItem());
    }
}
