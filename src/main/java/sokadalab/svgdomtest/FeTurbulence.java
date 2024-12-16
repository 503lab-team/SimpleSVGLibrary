package sokadalab.svgdomtest;

import org.w3c.dom.Document;

/**
 * feTurbulence要素<br>
 * https://www.w3.org/TR/SVG11/filters.html#feTurbulenceElement<br>
 * https://www.w3.org/TR/SVG11/filters.html#InterfaceSVGFETurbulenceElement
 */
public class FeTurbulence extends FeStandardAttributes {
    // フィールドstitchTilesの種類
    public static final short STITCH_UNKNOWN = 0;
    public static final short STITCH_STITCH = 1;
    public static final short STITCH_NOSTITCH = 2;

    // フィールドtypeの種類
    public static final short TYPE_UNKNOWN = 0;
    public static final short TYPE_FRACTALNOISE = 1;
    public static final short TYPE_TURBULENCE = 2;

    private int numOctaves;
    private float baseFrequency;
    private float seed;
    private short stitchTiles;
    private short type;

    /**
     * コンストラクタ
     * @param document ドキュメント
     */
    public FeTurbulence(Document document) {
        super(document, "feTurbulence");
    }

    /**
     * 属性numOctavesの取得
     * @return 属性numOctaves
     */
    public int getNumOctaves() {
        return this.numOctaves;
    }

    /**
     * 属性baseFrequencyの取得
     * @return 属性baseFrequency
     */
    public float getBaseFrequency() {
        return this.baseFrequency;
    }

    /**
     * 属性seedの取得
     * @return 属性seed
     */
    public float getSeed() {
        return this.seed;
    }

    /**
     * 属性stitchTilesの取得
     * @return 属性stitchTiles
     */
    public short getStitchTiles() {
        return this.stitchTiles;
    }

    /**
     * 属性typeの取得
     * @return 属性type
     */
    public short getType() {
        return this.type;
    }

    /**
     * 属性numOctavesのセット
     * @param no 属性numOctavesに与える値
     */
    public void setNumOctaves(int no) {
        this.numOctaves = no;
        super.setAttribute("numOctaves", String.valueOf(this.numOctaves));
    }
    public void setNumOctaves(String no) {
        this.numOctaves = Integer.parseInt(no);
        super.setAttribute("numOctaves", String.valueOf(this.numOctaves));
    }

    /**
     * 属性baseFrequencyのセット
     * @param bf 属性baseFrequencyに与える値
     */
    public void setBaseFrequency(float bf) {
        this.baseFrequency = bf;
        super.setAttribute("baseFrequency", String.valueOf(this.baseFrequency));
    }
    public void setBaseFrequency(String bf) {
        this.baseFrequency = Float.parseFloat(bf);
        super.setAttribute("baseFrequency", String.valueOf(this.baseFrequency));
    }

    /**
     * 属性seedのセット
     * @param seed 属性seedに与える値
     */
    public void setSeed(float seed) {
        this.seed = seed;
        super.setAttribute("seed", String.valueOf(this.seed));
    }
    public void setSeed(String seed) {
        this.seed = Float.parseFloat(seed);
        super.setAttribute("seed", String.valueOf(this.seed));
    }

    /**
     * 属性stitchTilesのセット
     * @param tiles 属性stitchTilesに与える値
     */
    public void setStitchTiles(short tiles) {
        this.stitchTiles = tiles;
        super.setAttribute("stitchTiles", stitchTilesToString(this.stitchTiles));
    }
    public void setStitchTiles(String tiles) {
        this.stitchTiles = stringToStitchTiles(tiles);
        super.setAttribute("stitchTiles", stitchTilesToString(this.stitchTiles));
    }

    /**
     * 属性typeのセット
     * @param type 属性typeに与える値
     */
    public void setType(short type) {
        this.type = type;
        super.setAttribute("type", typeToString(this.type));
    }
    public void setType(String type) {
        this.type = stringToType(type);
        super.setAttribute("type", typeToString(this.type));
    }

    /**
     * フィールドstitchTilesが表す数値から文字列への変換
     * @param tiles 変換したい数値
     * @return 対応する文字列
     */
    public static String stitchTilesToString(short tiles) {
        switch(tiles) {
            case STITCH_STITCH :
                return "stitch";
            case STITCH_NOSTITCH :
                return "noStitch";
            default :
                return "";
        }
    }

    /**
     * フィールドstitchTilesが表す文字列から数値への変換
     * @param tiles 変換したい文字列
     * @return 対応する数値
     */
    public static short stringToStitchTiles(String tiles) {
        switch(tiles) {
            case "stitch" :
                return STITCH_STITCH;
            case "noStitch" :
                return STITCH_NOSTITCH;
            default :
                return STITCH_UNKNOWN;
        }
    }

    /**
     * フィールドtypeが表す数値から文字列への変換
     * @param type 変換したい数値
     * @return 対応する文字列
     */
    public static String typeToString(short type) {
        switch(type) {
            case TYPE_FRACTALNOISE :
                return "fractalNoise";
            case TYPE_TURBULENCE :
                return "turbulence";
            default :
                return "";
        }
    }

    /**
     * フィールドtypeが表す文字列から数値への変換
     * @param type 変換したい文字列
     * @return 対応する数値
     */
    public static short stringToType(String type) {
        switch(type) {
            case "fractalNoise" :
                return TYPE_FRACTALNOISE;
            case "turbulence" :
                return TYPE_TURBULENCE;
            default :
                return TYPE_UNKNOWN;
        }
    }
}
