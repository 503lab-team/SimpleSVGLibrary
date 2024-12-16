package sokadalab.svgdomtest;

import org.w3c.dom.Document;

/**
 * style要素<br>
 * https://www.w3.org/TR/SVG11/styling.html#StyleElement<br>
 * https://www.w3.org/TR/SVG11/styling.html#InterfaceSVGStyleElement
 */
public class Style extends SVGLangSpace {
    private String type;
    private String media;
    private String title;

    /**
     * コンストラクタ
     * @param document ドキュメント
     */
    public Style(Document document) {
        super(document, "style");
    }

    /**
     * 属性typeの取得
     * @return 属性type
     */
    public String getType() {
        return this.type;
    }

    /**
     * 属性mediaの取得
     * @return 属性media
     */
    public String getMedia() {
        return this.media;
    }

    /**
     * 属性titleの取得
     * @return 属性title
     */
    public String getTitle() {
        return this.title;
    }

    /**
     * 属性typeのセット
     * @param type 属性typeに与える値
     */
    public void setType(String type) {
        this.type = type;
        super.setAttribute("type", this.type);
    }

    /**
     * 属性mediaのセット
     * @param media 属性mediaに与える値
     */
    public void setMedia(String media) {
        this.media = media;
        super.setAttribute("media", this.media);
    }

    /**
     * 属性titleのセット
     * @param title 属性titleに与える値
     */
    public void setTitle(String title) {
        this.title = title;
        super.setAttribute("title", this.title);
    }
}
