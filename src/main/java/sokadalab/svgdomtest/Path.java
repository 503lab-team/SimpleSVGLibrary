package sokadalab.svgdomtest;

import org.w3c.dom.Document;
import java.util.regex.Pattern;

/**
 * path要素
 * https://www.w3.org/TR/SVG11/paths.html#PathElement<br>
 * https://www.w3.org/TR/SVG11/paths.html#InterfaceSVGPathElement
 */
public class Path extends SVGElement {
    private SVGPathSegList d = new SVGPathSegList();
    private String fill;

    /**
     * コンストラクタ
     * @param document ドキュメント
     */
    public Path(Document document) {
        super(document, "path");
    }

    /**
     * 属性dの取得
     * @return 
     */
    public SVGPathSegList getD() {
        return this.d;
    }

    /**
     * 属性fillの取得
     * @return 属性fill
     */
    public String getFill() {
        return this.fill;
    }

    /**
     * 属性dの中身をすべて書き直す
     * @param d 属性dに与える値
     */
    public void setD(String d) {
        Pattern p = Pattern.compile("[Z,z,M,m,L,l,C,c,Q,q,A,a,H,h,V,v,S,s,T,t]");
        while (d != "") {
            switch (d.substring(0, 1)) {
                case " " :
                    d = d.substring(1);
                case "," :
                    d = d.substring(1);
                default :
                    String first = d.substring(0, 1); // 最初の1文字
                    String second = d.substring(1);   // 残りの文字列
                    String[] data = p.split(second, 2);
                    appendD(first, data[0]);
                    setD(data[1]);
            }
        }
    }
    public void setD(SVGPathSegList d) {
        this.d = d;
    }

    /**
     * 属性dの末尾に新しいデータを追加する
     * @param type コマンド部分
     * @param data 数値データ部分
     */
    public void appendD(String type, String data) {
        SVGPathSeg newItem = new SVGPathSeg();
        newItem.pathSegTypeAsLetter = type;
        newItem.pathSegType = newItem.letterToType(newItem.pathSegTypeAsLetter);
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
     * 属性fillのセット
     * @param fill 属性fillを表す文字列
     */
    public void setFill(String fill) {
        this.fill = fill;
        this.setAttribute("fill", this.fill);
    }
}
