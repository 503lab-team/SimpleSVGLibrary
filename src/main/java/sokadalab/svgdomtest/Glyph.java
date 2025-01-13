package sokadalab.svgdomtest;

import org.w3c.dom.Document;

/**
 * glyph要素<br>
 * https://www.w3.org/TR/SVG11/fonts.html#GlyphElement<br>
 * https://www.w3.org/TR/SVG11/fonts.html#InterfaceSVGGlyphElement
 */
public class Glyph extends SVGElement {
    private SVGPathSegList d = new SVGPathSegList();
    private float horizAdvX;
    private float vertOriginX;
    private float vertOriginY;
    private float vertAdvY;
    private String unicode;
    private String glyphName;
    private String orientation;
    private String arabicForm;
    private String lang;

    /**
     * コンストラクタ
     * @param document ドキュメント
     */
    public Glyph(Document document) {
        super(document, "glyph");
    }

    /**
     * 属性dの取得
     * @return 属性d
     */
    public SVGPathSegList getD() {
        return this.d;
    }

    /**
     * 属性horiz-adv-xの取得
     * @return 属性horiz-adv-x
     */
    public float getHorizAdvX() {
        return this.horizAdvX;
    }

    /**
     * 属性vert-origin-xの取得
     * @return 属性vert-origin-x
     */
    public float getVertOriginX() {
        return this.vertOriginX;
    }

    /**
     * 属性vert-origin-yの取得
     * @return 属性vert-origin-y
     */
    public float getVertOriginY() {
        return this.vertOriginY;
    }

    /**
     * 属性vert-adv-yの取得
     * @return 属性vert-adv-y
     */
    public float getVertAdvY() {
        return this.vertAdvY;
    }

    /**
     * 属性unicodeの取得
     * @return 属性unicode
     */
    public String getUnicode() {
        return this.unicode;
    }

    /**
     * 属性glyph-nameの取得
     * @return 属性glyph-name
     */
    public String getGlyphName() {
        return this.glyphName;
    }

    /**
     * 属性orientationの取得
     * @return 属性orientation
     */
    public String getOrientation() {
        return this.orientation;
    }

    /**
     * 属性arabic-formの取得
     * @return 属性arabic-form
     */
    public String getArabicForm() {
        return this.arabicForm;
    }

    /**
     * 属性langの取得
     * @return 属性lang
     */
    public String getLang() {
        return this.lang;
    }

    /**
     * 属性dの中身をすべて書き直す<br>
     * 区切り文字は半角スペースで統一すること
     * @param d 属性dに与える値
     */
    public void setD(String d) {
        int i;
        String[] dlist = d.split(" ");      // 引数dを半角スペースで区切ったリスト
        SVGPathSeg newItem = new SVGPathSeg();
        for (i = 0; i < dlist.length; i++) {
            if (SVGPathSeg.letterToType(dlist[i]) != SVGPathSeg.PATHSEG_UNKNOWN) {  // コマンドの場合
                if (newItem.getPathSegType() != SVGPathSeg.PATHSEG_UNKNOWN) {
                    this.d.appendItem(newItem);
                    newItem = new SVGPathSeg();
                }
                newItem.setType(dlist[i]);
            } else {                                    // 数値の場合
                newItem.appendData(dlist[i]);
            }
        }
        this.d.appendItem(newItem);
        super.setAttribute("d", this.d.getAllItem());
    }
    public void setD(SVGPathSegList d) {
        this.d = d;
        super.setAttribute("d", this.d.getAllItem());        
    }

    /**
     * 属性dの末尾に新しいデータを追加する<br>
     * @param type コマンド部分
     * @param data 数値データ部分
     */
    public void appendD(short type, String data) {
        SVGPathSeg newItem = new SVGPathSeg();
        newItem.setType(type);
        String[] datalist = data.split(" ");
        for (int i = 0; i < datalist.length; i++) {
            newItem.appendData(datalist[i]);
        }
        this.d.appendItem(newItem);        
        super.setAttribute("d", this.d.getAllItem());
    }
    public void appendD(String str) {
        SVGPathSeg newItem = new SVGPathSeg();
        String[] strlist = str.split(" ");  // 引数dを半角スペースで区切ったリスト
        for (int i = 0; i < strlist.length; i++) {
            if (SVGPathSeg.letterToType(strlist[i]) != SVGPathSeg.PATHSEG_UNKNOWN) {  // コマンドの場合
                newItem.setType(strlist[i]);
            } else {                                    // 数値の場合
                newItem.appendData(strlist[i]);
            }
        }
        this.d.appendItem(newItem);
        super.setAttribute("d", this.d.getAllItem());
    }
    public void appendD(short type) {
        SVGPathSeg newItem = new SVGPathSeg();
        newItem.setType(type);
        this.d.appendItem(newItem);
        super.setAttribute("d", this.d.getAllItem());
    }

    /**
     * 属性horiz-adv-xのセット
     * @param hax 属性horiz-adv-xに与える値
     */
    public void setHorizAdvX(String hax) {
        this.horizAdvX = Float.parseFloat(hax);
        super.setAttribute("horiz-adv-x", String.valueOf(this.horizAdvX));
    }
    public void setHorizAdvX(float hax) {
        this.horizAdvX = hax;
        super.setAttribute("horiz-adv-x", String.valueOf(this.horizAdvX));
    }

    /**
     * 属性vert-origin-xのセット
     * @param vox 属性vert-origin-xに与える値
     */
    public void setVertOriginX(String vox) {
        this.vertOriginX = Float.parseFloat(vox);
        super.setAttribute("vert-origin-x", String.valueOf(this.vertOriginX));
    }
    public void setVertOriginX(float vox) {
        this.vertOriginX = vox;
        super.setAttribute("vert-origin-x", String.valueOf(this.vertOriginX));
    }

    /**
     * 属性vert-origin-yのセット
     * @param voy 属性vert-origin-yに与える値
     */
    public void setVertOriginY(String voy) {
        this.vertOriginY = Float.parseFloat(voy);
        super.setAttribute("vert-origin-y", String.valueOf(this.vertOriginY));
    }
    public void setVertOriginY(float voy) {
        this.vertOriginY = voy;
        super.setAttribute("vert-origin-y", String.valueOf(this.vertOriginY));
    }

    /**
     * 属性vert-adv-yのセット
     * @param vay 属性vert-adv-yに与える値
     */
    public void setVertAdvY(String vay) {
        this.vertAdvY = Float.parseFloat(vay);
        super.setAttribute("vert-adv-y", String.valueOf(this.vertAdvY));
    }
    public void setVertAdvY(float vay) {
        this.vertAdvY = vay;
        super.setAttribute("vert-adv-y", String.valueOf(this.vertAdvY));
    }

    /**
     * 属性unicodeのセット
     * @param unicode 属性unicodeに与える値
     */
    public void setUnicode(String unicode) {
        this.unicode = unicode;
        super.setAttribute("unicode", this.unicode);
    }

    /**
     * 属性glyph-nameのセット
     * @param glyphName 属性glyph-nameに与える値
     */
    public void setGlyphName(String glyphName) {
        this.glyphName = glyphName;
        super.setAttribute("glyph-name", this.glyphName);
    }

    /**
     * 属性orientationのセット
     * @param orientation 属性orientationに与える値
     */
    public void setOrientation(String orientation) {
        this.orientation = orientation;
        super.setAttribute("orientation", this.orientation);
    }

    /**
     * 属性arabic-formのセット
     * @param arabicForm 属性arabic-formに与える値
     */
    public void setArabicForm(String arabicForm) {
        this.arabicForm = arabicForm;
        super.setAttribute("arabic-form", this.arabicForm);
    }

    /**
     * 属性langのセット
     * @param lang 属性langに与える値
     */
    public void setLang(String lang) {
        this.lang = lang;
        super.setAttribute("lang", this.lang);
    }
}
