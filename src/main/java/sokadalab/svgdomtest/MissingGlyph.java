// <missing-glyph>要素

package sokadalab.svgdomtest;

import org.w3c.dom.Document;
import java.util.regex.Pattern;

public class MissingGlyph extends SVGElement {
    private SVGPathSegList d = new SVGPathSegList();
    private float horizAdvX;
    private float vertOriginX;
    private float vertOriginY;
    private float vertAdvY;

    public MissingGlyph(Document document) {
        super(document, "missing-glyph");
    }

    public SVGPathSegList getD() {
        return this.d;
    }

    public float getHorizAdvX() {
        return this.horizAdvX;
    }

    public float getVertOriginX() {
        return this.vertOriginX;
    }

    public float getVertOriginY() {
        return this.vertOriginY;
    }

    public float getVertAdvY() {
        return this.vertAdvY;
    }

    // 属性dの中身をすべてstrに書き直す
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

    // 属性dの末尾に新しいデータを追加する
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

    public void setHorizAdvX(String hax) {
        this.horizAdvX = Float.parseFloat(hax);
        super.setAttribute("horiz-adv-x", String.valueOf(this.horizAdvX));
    }
    public void setHorizAdvX(float hax) {
        this.horizAdvX = hax;
        super.setAttribute("horiz-adv-x", String.valueOf(this.horizAdvX));
    }

    public void setVertOriginX(String vox) {
        this.vertOriginX = Float.parseFloat(vox);
        super.setAttribute("vert-origin-x", String.valueOf(this.vertOriginX));
    }
    public void setVertOriginX(float vox) {
        this.vertOriginX = vox;
        super.setAttribute("vert-origin-x", String.valueOf(this.vertOriginX));
    }

    public void setVertOriginY(String voy) {
        this.vertOriginY = Float.parseFloat(voy);
        super.setAttribute("vert-origin-y", String.valueOf(this.vertOriginY));
    }
    public void setVertOriginY(float voy) {
        this.vertOriginY = voy;
        super.setAttribute("vert-origin-y", String.valueOf(this.vertOriginY));
    }

    public void setVertAdvY(String vay) {
        this.vertAdvY = Float.parseFloat(vay);
        super.setAttribute("vert-adv-y", String.valueOf(this.vertAdvY));
    }
    public void setVertAdvY(float vay) {
        this.vertAdvY = vay;
        super.setAttribute("vert-adv-y", String.valueOf(this.vertAdvY));
    }
}
