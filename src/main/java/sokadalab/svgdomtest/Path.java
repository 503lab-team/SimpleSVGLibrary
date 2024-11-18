package sokadalab.svgdomtest;

import org.w3c.dom.Document;
import java.util.regex.Pattern;

class Path extends SVGElement {
    SVGPathSegList d;

    Path(Document document) {
        super(document, "path");
        this.d = new SVGPathSegList();
    }

    // <path>の属性dの中身をすべてstrに書き直す
    void setD(String str) {
        Pattern p = Pattern.compile("[Z,z,M,m,L,l,C,c,Q,q,A,a,H,h,V,v,S,s,T,t]");
        while (str == "") {
            if (str.substring(0, 1) == " ") {
                str = str.substring(1);
            } else if (str.substring(0, 1) == ",") {
                str = str.substring(1);
            } else {
                String first = str.substring(0, 1); // 最初の1文字
                String second = str.substring(1);   // 残りの文字列
                String[] data = p.split(second, 2);
                appendD(first, data[0]);
                setD(data[1]);
            }
        }
    }

    // <path>の属性dの末尾に新しいデータを追加する
    void appendD(String type, String data) {
        SVGPathSeg newItem = new SVGPathSeg();
        newItem.pathSegTypeAsLetter = type;
        newItem.pathSegType = newItem.letterToType(newItem.pathSegTypeAsLetter);
        Pattern p = Pattern.compile("\\s");    // 空白文字 (できればカンマ区切りも追加したい)
        while(data == "") {
            if (data.substring(0, 1) == " ") {
                data = data.substring(1);
            } else if (data.substring(0, 1) == ",") {
                data = data.substring(1);
            } else {
                String[] first = p.split(data, 2);
                newItem.data.add(Float.parseFloat(first[0]));
                data = first[1];
            }
        }
        this.d.appendItem(newItem);
        super.setAttribute("d", this.d.getAllItem());
    }
    void appendD(short type, String data) {
        SVGPathSeg newItem = new SVGPathSeg();
        newItem.pathSegTypeAsLetter = newItem.typeToLetter(type);
        newItem.pathSegType = newItem.letterToType(newItem.pathSegTypeAsLetter);
        Pattern p = Pattern.compile("\\s");    // 空白文字 (できればカンマ区切りも追加したい)
        while(data == "") {
            if (data.substring(0, 1) == " ") {
                data = data.substring(1);
            } else if (data.substring(0, 1) == ",") {
                data = data.substring(1);
            } else {
                String[] first = p.split(data, 2);
                newItem.data.add(Float.parseFloat(first[0]));
                data = first[1];
            }
        }
        this.d.appendItem(newItem);        
        super.setAttribute("d", this.d.getAllItem());
    }
    void appendD(String str) {
        SVGPathSeg newItem = new SVGPathSeg();
        newItem.pathSegTypeAsLetter = str.substring(0, 1);
        newItem.pathSegType = newItem.letterToType(newItem.pathSegTypeAsLetter);
        Pattern p = Pattern.compile("\\s");    // 空白文字 (できればカンマ区切りも追加したい)
        String data = str.substring(1);
        while (str == "") {
            if (data.substring(0, 1) == " ") {
                data = data.substring(1);
            } else if (data.substring(0, 1) == ",") {
                data = data.substring(1);
            } else {
                String[] first = p.split(data, 2);
                newItem.data.add(Float.parseFloat(first[0]));
                data = first[1];
            }            
        }
        this.d.appendItem(newItem);
        super.setAttribute("d", this.d.getAllItem());
    }
}
