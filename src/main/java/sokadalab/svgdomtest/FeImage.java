package sokadalab.svgdomtest;

import org.w3c.dom.Document;

/**
 * feImage要素<br>
 * https://www.w3.org/TR/SVG11/filters.html#feImageElement<br>
 * https://www.w3.org/TR/SVG11/filters.html#InterfaceSVGFEImageElement
 */
public class FeImage extends FeStandardAttributes {
    private String preserveAspectRatio;
    private String externalResourcesRequired;

    /**
     * コンストラクタ
     * @param document ドキュメント
     */
    public FeImage(Document document) {
        super(document, "feImage");
    }

    /**
     * 属性preserveAspectRatioの取得
     * @return 属性preserveAspectRatio
     */
    public String getPreserveAspectRatio() {
        return this.preserveAspectRatio;
    }

    /**
     * 属性externalResourcesRequiredの取得
     * @return 属性externalResourcesRequired
     */
    public String getExternalResourcesRequired() {
        return this.externalResourcesRequired;
    }

    /**
     * 属性preserveAspectRatioのセット
     * @param par 属性preserveAspectRatioに与える値
     */
    public void setPreserveAspectRatio(String par) {
        this.preserveAspectRatio = par;
        super.setAttribute("preserveAspectRatio", this.preserveAspectRatio);
    }

    /**
     * 属性externalResourcesRequiredのセット
     * @param err 属性externalResourcesRequiredに与える値
     */
    public void setExternalResourcesRequired(String err) {
        this.externalResourcesRequired = err;
        super.setAttribute("externalResourcesRequired", this.externalResourcesRequired);
    }
}
