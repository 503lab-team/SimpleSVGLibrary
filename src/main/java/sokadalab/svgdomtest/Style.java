package sokadalab.svgdomtest;

import org.w3c.dom.Document;

public class Style extends SVGElement {
    private String type;
    private String media;
    private String title;

    public Style(Document document) {
        super(document, "style");
    }

    public String getType() {
        return this.type;
    }

    public String getMedia() {
        return this.media;
    }

    public String getTitle() {
        return this.title;
    }

    public void setType(String type) {
        this.type = type;
        super.setAttribute("type", this.type);
    }

    public void setMedia(String media) {
        this.media = media;
        super.setAttribute("media", this.media);
    }

    public void setTitle(String title) {
        this.title = title;
        super.setAttribute("title", this.title);
    }
}
