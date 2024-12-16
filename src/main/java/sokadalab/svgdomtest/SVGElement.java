package sokadalab.svgdomtest;

import org.w3c.dom.*;

/**
 * SVGの各要素に共通する部分<br>
 * https://www.w3.org/TR/SVG11/types.html#InterfaceSVGElement
 */
public class SVGElement {
    private Element element;
    private String id;
    private String xmlbase;
    private String classname;
    private String transform;
    private String href;

    /**
     * 任意の要素の生成
     * @param document ドキュメント
     * @param name 生成する要素の名前
     */
    public SVGElement(Document document, String name) {
        this.element = document.createElement(name);
    }

    /**
     * 要素の取得
     * @return 要素
     */
    public Element getElement() {
        return this.element;
    }

    /**
     * 属性idの取得
     * @return 属性id
     */
    public String getId() {
        return this.id;
    }

    /**
     * 属性xml:baseの取得
     * @return 属性xml:base
     */
    public String getXmlbase() {
        return this.xmlbase;
    }

    /**
     * 属性classの取得
     * @return 属性class
     */
    public String getClassname() {
        return this.classname;
    }

    /**
     * 属性transformの取得
     * @return 属性transform
     */
    public String getTransform() {
        return this.transform;
    }

    /**
     * 属性hrefの取得
     * @return 属性href
     */
    public String getHref() {
        return this.href;
    }

    /**
     * 任意の属性の取得
     * @param name 属性の名前
     * @return nameが指す属性の値
     */
    public String getAttribute(String name) {
        return this.element.getAttribute(name);
    }

    /**
     * 属性idのセット
     * @param id 属性idを表す文字列
     */
    public void setId(String id) {
        this.id = id;
        this.element.setAttribute("id", this.id);
    }

    /**
     * 属性xml:baseのセット
     * @param xmlbase 属性xml:baseを表す文字列
     */
    public void setXmlbase(String xmlbase) {
        this.xmlbase = xmlbase;
        this.element.setAttribute("xml:base", this.xmlbase);
    }

    /**
     * 属性classのセット
     * @param classname 属性classを表す文字列
     */
    public void setClassname(String classname) {
        this.classname = classname;
        this.element.setAttribute("class", this.classname);
    }

    /**
     * 任意の属性のセット
     * @param name 属性の名前
     * @param value nameが指す属性の値
     */
    public void setAttribute(String name, String value) {
        this.element.setAttribute(name, value);
    }

    /**
     * 子要素の追加
     * @param child 子要素
     */
    public void appendChild(SVGElement child) {
        this.element.appendChild(child.getElement());
    }

    /**
     * テキストノードの追加
     * @param document ドキュメント
     * @param textnode 追加したい文字列
     */
    public void setTextNode(Document document, String textnode) {
        Node node = document.createTextNode(textnode);
        this.element.appendChild(node);
    }

    /**
     * 属性transformのセット
     * @param transform 属性transformを表す文字列
     */
    public void setTransform(String transform) {
        this.transform = transform;
        this.setAttribute("transform", this.transform);
    }

    /**
     * 属性hrefのセット
     * @param href 属性hrefに与える値
     */
    public void setHref(String href) {
        this.href = href;
        this.setAttribute("href", this.href);
    }
}
