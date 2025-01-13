package sokadalab.svgdomtest;

import org.w3c.dom.Document;

/**
 * missing-glyph要素<br>
 * https://www.w3.org/TR/SVG11/fonts.html#MissingGlyphElement<br>
 * https://www.w3.org/TR/SVG11/fonts.html#InterfaceSVGMissingGlyphElement
 */
public class MissingGlyph extends SVGElement {
    private SVGPathSegList d = new SVGPathSegList();
    private float horizAdvX;
    private float vertOriginX;
    private float vertOriginY;
    private float vertAdvY;

    /**
     * コンストラクタ
     * @param document ドキュメント
     */
    public MissingGlyph(Document document) {
        super(document, "missing-glyph");
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
}
