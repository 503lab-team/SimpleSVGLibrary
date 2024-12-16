package sokadalab.svgdomtest;

import org.w3c.dom.Document;
import java.util.regex.Pattern;

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
     * 属性dの中身をすべて書き直す
     * @param str 属性dに与える値
     */
    public void setD(String str) {
        Pattern p = Pattern.compile("[Z,z,M,m,L,l,C,c,Q,q,A,a,H,h,V,v,S,s,T,t]");
        while (str != "") {
            switch (str.substring(0, 1)) {
                case " " :
                    str = str.substring(1);
                case "," :
                    str = str.substring(1);
                default :
                    String first = str.substring(0, 1); // 最初の1文字
                    String second = str.substring(1);   // 残りの文字列
                    String[] data = p.split(second, 2);
                    appendD(first, data[0]);
                    setD(data[1]);
            }
        }
    }

    /**
     * 属性dの末尾に新しいデータを追加する
     * @param type コマンド部分
     * @param data 数値データ部分
     */
    public void appendD(String type, String data) {
        SVGPathSeg newItem = new SVGPathSeg();
        newItem.pathSegTypeAsLetter = type;
        newItem.pathSegType = SVGPathSeg.letterToType(newItem.pathSegTypeAsLetter);
        Pattern p = Pattern.compile("\\s");    // 空白文字 (できればカンマ区切りも追加したい)
        while(data == "") {
            switch (data.substring(0, 1)) {
                case " " :
                    data = data.substring(1);
                case "," :
                    data = data.substring(1);
                default :
                    String[] first = p.split(data, 2);
                    newItem.data.add(Float.parseFloat(first[0]));
                    data = first[1];
            }
        }
        this.d.appendItem(newItem);
        super.setAttribute("d", this.d.getAllItem());
    }
    public void appendD(short type, String data) {
        SVGPathSeg newItem = new SVGPathSeg();
        newItem.pathSegTypeAsLetter = SVGPathSeg.typeToLetter(type);
        newItem.pathSegType = SVGPathSeg.letterToType(newItem.pathSegTypeAsLetter);
        Pattern p = Pattern.compile("\\s");    // 空白文字 (できればカンマ区切りも追加したい)
        while(data == "") {
            switch (data.substring(0, 1)) {
                case " " :
                    data = data.substring(1);
                case "," :
                    data = data.substring(1);
                default :
                    String[] first = p.split(data, 2);
                    newItem.data.add(Float.parseFloat(first[0]));
                    data = first[1];
            }
        }
        this.d.appendItem(newItem);        
        super.setAttribute("d", this.d.getAllItem());
    }
    public void appendD(String str) {
        SVGPathSeg newItem = new SVGPathSeg();
        newItem.pathSegTypeAsLetter = str.substring(0, 1);
        newItem.pathSegType = SVGPathSeg.letterToType(newItem.pathSegTypeAsLetter);
        Pattern p = Pattern.compile("\\s");    // 空白文字 (できればカンマ区切りも追加したい)
        String data = str.substring(1);
        while (str == "") {
            switch (data.substring(0, 1)) {
                case " " :
                    data = data.substring(1);
                case "," :
                    data = data.substring(1);
                default :
                    String[] first = p.split(data, 2);
                    newItem.data.add(Float.parseFloat(first[0]));
                    data = first[1];
            }
        }
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
