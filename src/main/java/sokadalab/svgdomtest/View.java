package sokadalab.svgdomtest;

import org.w3c.dom.Document;

/**
 * view要素<br>
 * https://www.w3.org/TR/SVG11/linking.html#ViewElement<br>
 * https://www.w3.org/TR/SVG11/linking.html#InterfaceSVGViewElement
 */
public class View extends SVGElement {
    private String externalResourcesRequired;
    private SVGLengthList viewBox = new SVGLengthList();
    private SVGStringList viewTarget = new SVGStringList();

    public View(Document document) {
        super(document, "view");
    }

    /**
     * 属性externalResourcesRequiredの取得
     * @return 属性externalResourcesRequired
     */
    public String getExternalResourcesRequired() {
        return this.externalResourcesRequired;
    }

    /**
     * 属性viewBoxの取得
     * @return 属性viewBox
     */
    public SVGLengthList getViewBox() {
        return this.viewBox;
    }

    /**
     * 属性viewTargetの取得
     * @return 属性viewTarget
     */
    public SVGStringList getViewTarget() {
        return this.viewTarget;
    }

    /**
     * 属性externalResourcesRequiredのセット
     * @param external 属性externalResourcesRequiredに与える値
     */
    public void setExternalResourcesRequired(String external) {
        this.externalResourcesRequired = external;
        super.setAttribute("externalResourcesRequired", this.externalResourcesRequired);
    }

    /**
     * 属性viewBoxのセット
     * @param viewBox 属性viewBoxに与える値
     */
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

    /**
     * 属性viewTargetのセット
     * @param viewTarget 属性viewTargetに与える値
     */
    public void setViewTarget(SVGStringList viewTarget) {
        this.viewTarget = viewTarget;
        super.setAttribute("viewTarget", this.viewTarget.getAllItem());
    }
    public void setViewTarget(String viewTarget) {
        this.viewTarget.appendItem(viewTarget);
        super.setAttribute("viewTarget", this.viewTarget.getAllItem());
    }
}
