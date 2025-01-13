package sokadalab.svgdomtest;

import org.w3c.dom.Document;

/**
 * path要素
 * https://www.w3.org/TR/SVG11/paths.html#PathElement<br>
 * https://www.w3.org/TR/SVG11/paths.html#InterfaceSVGPathElement
 */
public class Path extends SVGElement {
    private SVGPathSegList d = new SVGPathSegList();
    private String fill;
    private String stroke;
    private String stroke_width;

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
     * 属性strokeの取得
     * @return 属性stroke
     */
    public String getStroke() {
        return this.stroke;
    }

    /**
     * 属性stroke-widthの取得
     * @return 属性stroke-width
     */
    public String getStrokeWidth() {
        return this.stroke_width;
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
     * 属性fillのセット
     * @param fill 属性fillを表す文字列
     */
    public void setFill(String fill) {
        this.fill = fill;
        this.setAttribute("fill", this.fill);
    }

    /**
     * 属性strokeのセット
     * @param stroke 属性strokeを表す文字列
     */
    public void setStroke(String stroke) {
        this.stroke = stroke;
        this.setAttribute("stroke", this.stroke);
    }

    /**
     * 属性stroke-widthのセット
     * @param stroke_width 属性stroke-widthを表す文字列
     */
    public void setStrokeWidth(String stroke_width) {
        this.stroke_width = stroke_width;
        this.setAttribute("stroke-width", this.stroke_width);
    }
    public void setStrokeWidth(float stroke_width) {
        this.stroke_width = Float.toString(stroke_width);
        this.setAttribute("stroke-width", this.stroke_width);
    }
}
