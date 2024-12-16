package sokadalab.svgdomtest;

import org.w3c.dom.Document;

/**
 * switch要素<br>
 * https://www.w3.org/TR/SVG11/struct.html#SwitchElement<br>
 * https://www.w3.org/TR/SVG11/struct.html#InterfaceSVGSwitchElement<br>
 * https://www.w3.org/TR/SVG11/struct.html#RequiredFeaturesAttribute<br>
 * https://www.w3.org/TR/SVG11/struct.html#RequiredExtensionsAttribute<br>
 * https://www.w3.org/TR/SVG11/struct.html#SystemLanguageAttribute<br>
 * https://www.w3.org/TR/SVG11/struct.html#ExternalResourcesRequired
 */
public class Switch extends SVGLangSpace {
    private String requiredFeatures;
    private String requiredExtensions;
    private String systemLanguage;
    private String externalResourcesRequired;

    /**
     * コンストラクタ
     * @param document ドキュメント
     */
    public Switch(Document document) {
        super(document, "switch");
    }

    /**
     * 属性requiredFeaturesの取得
     * @return 属性requiredFeatures
     */
    public String getRequiredFeatures() {
        return this.requiredFeatures;
    }

    /**
     * 属性requiredExtensionsの取得
     * @return 属性requiredExtensions
     */
    public String getRequiredExtensions() {
        return this.requiredExtensions;
    }

    /**
     * 属性systemLanguageの取得
     * @return 属性systemLanguage
     */
    public String getSystemLanguage() {
        return this.systemLanguage;
    }

    /**
     * 属性externalResourcesRequiredの取得
     * @return 属性externalResourcesRequired
     */
    public String getExternalResourcesRequired() {
        return this.externalResourcesRequired;
    }

    /**
     * 属性requiredFeaturesのセット
     * @param features 属性requiredFeaturesに与える値
     */
    public void setRequiredFeatures(String features) {
        this.requiredFeatures = features;
        super.setAttribute("requiredFeatures", this.requiredFeatures);
    }

    /**
     * 属性requiredExtensionsのセット
     * @param extensions 属性requiredExtensionsに与える値
     */
    public void setRequiredExtensions(String extensions) {
        this.requiredExtensions = extensions;
        super.setAttribute("requiredExtensions", this.requiredExtensions);
    }

    /**
     * 属性systemLanguageのセット
     * @param language 属性systemLanguageに与える値
     */
    public void setSystemLanguage(String language) {
        this.systemLanguage = language;
        super.setAttribute("systemLanguage", this.systemLanguage);
    }

    /**
     * 属性externalResourcesRequiredのセット
     * @param external 属性externalResourcesRequiredに与える値
     */
    public void setExternalResourcesRequired(String external) {
        this.externalResourcesRequired = external;
        super.setAttribute("externalResourcesRequired", this.externalResourcesRequired);
    }
}
