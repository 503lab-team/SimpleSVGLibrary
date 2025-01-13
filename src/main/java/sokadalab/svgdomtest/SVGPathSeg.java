package sokadalab.svgdomtest;

import java.util.ArrayList;
import java.util.List;

/**
 * path要素の属性dのデータリスト<br>
 * https://www.w3.org/TR/SVG11/paths.html#PathData<br>
 * https://www.w3.org/TR/SVG11/paths.html#InterfaceSVGPathSeg<br>
 */
public class SVGPathSeg extends ArrayList {
    // フィールドPathSegTypeの種類
    public final static short PATHSEG_UNKNOWN = 0;
    public final static short PATHSEG_CLOSEPATH = 1;
    public final static short PATHSEG_MOVETO_ABS = 2;
    public final static short PATHSEG_MOVETO_REL = 3;
    public final static short PATHSEG_LINETO_ABS = 4;
    public final static short PATHSEG_LINETO_REL = 5;
    public final static short PATHSEG_CURVETO_CUBIC_ABS = 6;
    public final static short PATHSEG_CURVETO_CUBIC_REL = 7;
    public final static short PATHSEG_CURVETO_QUADRATIC_ABS = 8;
    public final static short PATHSEG_CURVETO_QUADRATIC_REL = 9;
    public final static short PATHSEG_ARC_ABS = 10;
    public final static short PATHSEG_ARC_REL = 11;
    public final static short PATHSEG_LINETO_HORIZONTAL_ABS = 12;
    public final static short PATHSEG_LINETO_HORIZONTAL_REL = 13;
    public final static short PATHSEG_LINETO_VERTICAL_ABS = 14;
    public final static short PATHSEG_LINETO_VERTICAL_REL = 15;
    public final static short PATHSEG_CURVETO_CUBIC_SMOOTH_ABS = 16;
    public final static short PATHSEG_CURVETO_CUBIC_SMOOTH_REL = 17;
    public final static short PATHSEG_CURVETO_QUADRATIC_SMOOTH_ABS = 18;
    public final static short PATHSEG_CURVETO_QUADRATIC_SMOOTH_REL = 19;

    private short pathSegType = PATHSEG_UNKNOWN;        // アルファベット1文字を表す数値
    private String pathSegTypeAsLetter = "";            // アルファベット1文字
    private List<Float> data = new ArrayList<Float>();  // パスの数値リスト

    /**
     * フィールドpathSegTypeの取得
     * @return フィールドpathSegType
     */
    public short getPathSegType() {
        return this.pathSegType;
    }

    /**
     * フィールドpathSegTypeAsLetterの取得
     * @return フィールドpathSegTypeAsLetter
     */
    public String getPathSegTypeAsLetter() {
        return this.pathSegTypeAsLetter;
    }

    /**
     * フィールドdataの取得
     * @return フィールドdata
     */
    public List<Float> getData() {
        return this.data;
    }

    /**
     * フィールドpathSegTypeとフィールドpathSegTypeAsLetterのセット
     * @param type フィールドpathSegTypeおよびpathSegTypeAsLetterに対応する値
     */
    public void setType(short type) {
        this.pathSegType = type;
        this.pathSegTypeAsLetter = typeToLetter(this.pathSegType);
    }
    public void setType(String type) {
        this.pathSegTypeAsLetter = type;
        this.pathSegType = letterToType(this.pathSegTypeAsLetter);
    }

    /**
     * フィールドdataのセット<br>
     * 半角スペースで区切ると想定
     * @param d フィールドdataに与える値
     */
    public void setData(List<Float> d) {
        this.data = d;
    }
    public void setData(String d) {
        this.data = new ArrayList<Float>();
        String[] strlist = d.split(" ");
        for (int i = 0; i < strlist.length; i++) {
            this.data.add(Float.parseFloat(strlist[i]));
        }
    }

    /**
     * フィールドdataの末尾に追加
     * @param d 末尾に追加する値
     */
    public void appendData(String d) {
        this.data.addLast(Float.parseFloat(d));
    }
    public void appendData(float d) {
        this.data.addLast(d);
    }

    @Override
    public void clear() {
        this.data = new ArrayList<Float>();
        this.pathSegType = PATHSEG_UNKNOWN;
        this.pathSegTypeAsLetter = "";
    }

    /**
     * フィールドpathSegTypeが表す数値から文字列への変換
     * @param pathSegType 変換したい数値
     * @return 対応する文字列
     */
    public static String typeToLetter(short pathSegType) {
        switch (pathSegType) {
            case SVGPathSeg.PATHSEG_CLOSEPATH :
                return "Z";
            case SVGPathSeg.PATHSEG_MOVETO_ABS:
                return "M" ;
            case SVGPathSeg.PATHSEG_MOVETO_REL :
                return "m";
            case SVGPathSeg.PATHSEG_LINETO_ABS :
                return "L";
            case SVGPathSeg.PATHSEG_LINETO_REL :
                return "l";
            case SVGPathSeg.PATHSEG_CURVETO_CUBIC_ABS :
                return "C";
            case SVGPathSeg.PATHSEG_CURVETO_CUBIC_REL :
                return "c";
            case SVGPathSeg.PATHSEG_CURVETO_QUADRATIC_ABS :
                return "Q";
            case SVGPathSeg.PATHSEG_CURVETO_QUADRATIC_REL :
                return "q";
            case SVGPathSeg.PATHSEG_ARC_ABS :
                return "A";
            case SVGPathSeg.PATHSEG_ARC_REL :
                return "a";
            case SVGPathSeg.PATHSEG_LINETO_HORIZONTAL_ABS :
                return "H";
            case SVGPathSeg.PATHSEG_LINETO_HORIZONTAL_REL :
                return "h";
            case SVGPathSeg.PATHSEG_LINETO_VERTICAL_ABS :
                return "V";
            case SVGPathSeg.PATHSEG_LINETO_VERTICAL_REL :
                return "v";
            case SVGPathSeg.PATHSEG_CURVETO_CUBIC_SMOOTH_ABS :
                return "S";
            case SVGPathSeg.PATHSEG_CURVETO_CUBIC_SMOOTH_REL :
                return "s";
            case SVGPathSeg.PATHSEG_CURVETO_QUADRATIC_SMOOTH_ABS :
                return "T";
            case SVGPathSeg.PATHSEG_CURVETO_QUADRATIC_SMOOTH_REL :
                return "t";
            default :
                return "";
        }        
    }

    /**
     * フィールドpathSegTypeが表す文字列から数値への変換
     * @param pathSegTypeAsLetter 変換したい文字列
     * @return 対応する数値
     */
    public static short letterToType(String pathSegTypeAsLetter) {
        switch (pathSegTypeAsLetter) {
            case "Z" :
                return SVGPathSeg.PATHSEG_CLOSEPATH;
            case "z" :
                return SVGPathSeg.PATHSEG_CLOSEPATH;
            case "M" :
                return SVGPathSeg.PATHSEG_MOVETO_ABS;
            case "m" :
                return SVGPathSeg.PATHSEG_MOVETO_REL;
            case "L" :
                return SVGPathSeg.PATHSEG_LINETO_ABS;
            case "l" :
                return SVGPathSeg.PATHSEG_LINETO_REL;
            case "C" :
                return SVGPathSeg.PATHSEG_CURVETO_CUBIC_ABS;
            case "c" :
                return SVGPathSeg.PATHSEG_CURVETO_CUBIC_REL;
            case "Q" :
                return SVGPathSeg.PATHSEG_CURVETO_QUADRATIC_ABS;
            case "q" :
                return SVGPathSeg.PATHSEG_CURVETO_QUADRATIC_REL;
            case "A" :
                return SVGPathSeg.PATHSEG_ARC_ABS;
            case "a" :
                return SVGPathSeg.PATHSEG_ARC_REL;
            case "H" :
                return SVGPathSeg.PATHSEG_LINETO_HORIZONTAL_ABS;
            case "h" :
                return SVGPathSeg.PATHSEG_LINETO_HORIZONTAL_REL;
            case "V" :
                return SVGPathSeg.PATHSEG_LINETO_VERTICAL_ABS;
            case "v" :
                return SVGPathSeg.PATHSEG_LINETO_VERTICAL_REL;
            case "S" :
                return SVGPathSeg.PATHSEG_CURVETO_CUBIC_SMOOTH_ABS;
            case "s" :
                return SVGPathSeg.PATHSEG_CURVETO_CUBIC_SMOOTH_REL;
            case "T" :
                return SVGPathSeg.PATHSEG_CURVETO_QUADRATIC_SMOOTH_ABS;
            case "t" :
                return SVGPathSeg.PATHSEG_CURVETO_QUADRATIC_SMOOTH_REL;
            default :
                return SVGPathSeg.PATHSEG_UNKNOWN;
        }
    }
}
