package sokadalab.svgdomtest;

import org.w3c.dom.Document;

/**
 * feConvolveMatrix要素<br>
 * https://www.w3.org/TR/SVG11/filters.html#feConvolveMatrixElement<br>
 * https://www.w3.org/TR/SVG11/filters.html#InterfaceSVGFEConvolveMatrixElement
 */
public class FeConvolveMatrix extends FeStandardAttributes {
    // フィールドedgeModeの種類
    public static final short EDGEMODE_UNKNOWN = 0;
    public static final short EDGEMODE_DUPLICATE = 1;
    public static final short EDGEMODE_WRAP = 2;
    public static final short EDGEMODE_NONE = 3;

    short edgeMode;
    String in;
    SVGNumberList kernelMatrix;
    int targetX;
    int targetY;
    int order;              // 仕様書ではorderXとorderYの二つがあるが、ここでは一つの値として処理
    float kernelUnitLength; // 仕様書ではkernelUnitLengthXとkernelUnitLengthYの二つがあるが、ここでは一つの値として処理
    float divisor;
    float bias;
    Boolean preserveAlpha;

    /**
     * コンストラクタ
     * @param document ドキュメント
     */
    public FeConvolveMatrix(Document document) {
        super(document, "feConvolveMatrix");
    }

    /**
     * 属性edgeModeの取得
     * @return 属性edgeMode
     */
    public short getEdgeMode() {
        return this.edgeMode;
    }

    /**
     * 属性inの取得
     * @return 属性in
     */
    public String getIn() {
        return this.in;
    }

    /**
     * 属性kernelMatrixの取得
     * @return 属性kernelMatrix
     */
    public SVGNumberList getKernelMatrix() {
        return this.kernelMatrix;
    }

    /**
     * 属性targetXの取得
     * @return 属性targetX
     */
    public int getTargetX() {
        return this.targetX;
    }

    /**
     * 属性targetYの取得
     * @return 属性targetY
     */
    public int getTargetY() {
        return this.targetY;
    } 

    /**
     * 属性orderの取得
     * @return 属性order
     */
    public int getOrder() {
        return this.order;
    }

    /**
     * 属性kernelUnitLengthの取得
     * @return 属性kernelUnitLength
     */
    public float getKernelUnitLength() {
        return this.kernelUnitLength;
    }

    /**
     * 属性divisorの取得
     * @return 属性divisor
     */
    public float getDivisor() {
        return this.divisor;
    }

    /**
     * 属性biasの取得
     * @return 属性bias
     */
    public float getBias() {
        return this.bias;
    }

    /**
     * 属性preserveAlphaの取得
     * @return 属性preserveAlpha
     */
    public Boolean getPreserveAlpha() {
        return this.preserveAlpha;
    }    

    /**
     * 属性edgeModeのセット
     * @param edgeMode 属性edgeModeに与える値
     */
    public void setEdgeMode(short edgeMode) {
        this.edgeMode = edgeMode;
        super.setAttribute("edgeMode", typeToString(this.edgeMode));
    }
    public void setEdgeMode(String edgeMode) {
        this.edgeMode = stringToType(edgeMode);
        super.setAttribute("edgeMode", typeToString(this.edgeMode));
    }

    /**
     * 属性inのセット
     * @param in 属性inに与える値
     */
    public void setIn(String in) {
        this.in = in;
        super.setAttribute("in", this.in);
    }

    /**
     * 属性kernelMatrixのセット
     * @param matrix 属性kernelMatrixに与える値
     */
    public void setKernelMatrix(SVGNumberList matrix) {
        this.kernelMatrix = matrix;
        super.setAttribute("kernelMatrix", this.kernelMatrix.getAllItem());
    }

    /**
     * 属性targetXのセット
     * @param targetX 属性targetXに与える値
     */
    public void setTargetX(int targetX) {
        this.targetX = targetX;
        super.setAttribute("targetX", String.valueOf(this.targetX));
    }
    public void setTargetX(String targetX) {
        this.targetX = Integer.parseInt(targetX);
        super.setAttribute("targetX", String.valueOf(this.targetX));
    }

    /**
     * 属性targetYのセット
     * @param targetY 属性targetYに与える値
     */
    public void setTargetY(int targetY) {
        this.targetY = targetY;
        super.setAttribute("targetY", String.valueOf(this.targetY));
    }
    public void setTargetY(String targetY) {
        this.targetY = Integer.parseInt(targetY);
        super.setAttribute("targetY", String.valueOf(this.targetY));
    }

    /**
     * 属性orderのセット
     * @param order 属性orderに与える値
     */
    public void setOrder(int order) {
        this.order = order;
        super.setAttribute("order", String.valueOf(order));
    }
    public void setOrder(String order) {
        this.order = Integer.parseInt(order);
        super.setAttribute("order", String.valueOf(order));
    }

    /**
     * 属性kernelUnitLengthのセット
     * @param kul 属性kernelUnitLengthに与える値
     */
    public void setKernelUnitLength(float kul) {
        this.kernelUnitLength = kul;
        super.setAttribute("kernelUnitLength", String.valueOf(this.kernelUnitLength));
    }
    public void setKernelUnitLength(String kul) {
        this.kernelUnitLength = Float.parseFloat(kul);
        super.setAttribute("kernelUnitLength", String.valueOf(this.kernelUnitLength));
    }

    /**
     * 属性divisorのセット
     * @param divisor 属性divisorに与える値
     */
    public void setDivisor(float divisor) {
        this.divisor = divisor;
        super.setAttribute("divisor", String.valueOf(this.divisor));
    }
    public void setDivisor(String divisor) {
        this.divisor = Float.parseFloat(divisor);
        super.setAttribute("divisor", String.valueOf(this.divisor));
    }

    /**
     * 属性biasのセット
     * @param bias 属性biasに与える値
     */
    public void setBias(float bias) {
        this.bias = bias;
        super.setAttribute("bias", String.valueOf(this.bias));
    }
    public void setBias(String bias) {
        this.bias = Float.parseFloat(bias);
        super.setAttribute("bias", String.valueOf(this.bias));
    }

    /**
     * 属性preserveAlphaのセット
     * @param pa 属性preserveAlphaに与える値
     */
    public void setPreserveAlpha(Boolean pa) {
        this.preserveAlpha = pa;
        super.setAttribute("preserveAlpha", this.preserveAlpha.toString());
    }

    /**
     * 数値から文字列への引数typeの変換
     * @param type フィールドtypeを表す値
     * @return 引数typeに対応する文字列
     */
    public static String typeToString(short type) {
        switch(type) {
            case EDGEMODE_DUPLICATE :
                return "duplicate";
            case EDGEMODE_WRAP :
                return "wrap";
            case EDGEMODE_NONE :
                return "none";
            default :
                return "";
        }
    }

    /**
     * 文字列から数値への引数strの変換
     * @param str フィールドtypeを表す文字列
     * @return 引数strに対応する値
     */
    public static short stringToType(String str) {
        switch(str) {
            case "duplicate" :
                return EDGEMODE_DUPLICATE;
            case "wrap" :
                return EDGEMODE_WRAP;
            case "none" :
                return EDGEMODE_NONE;
            default :
                return EDGEMODE_UNKNOWN;
        }
    }
}
