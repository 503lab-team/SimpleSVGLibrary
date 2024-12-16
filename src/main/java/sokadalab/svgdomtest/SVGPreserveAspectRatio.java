package sokadalab.svgdomtest;

/**
 * 属性preserveAspectRatio<br>
 * 作っただけで使ってない<br>
 * https://www.w3.org/TR/SVG11/coords.html#InterfaceSVGPreserveAspectRatio
 */
public class SVGPreserveAspectRatio {
    // フィールドalignの種類
    public final short PRESERVEASPECTRATIO_UNKNOWN = 0;
    public final short PRESERVEASPECTRATIO_NONE = 1;
    public final short PRESERVEASPECTRATIO_XMINYMIN = 2;
    public final short PRESERVEASPECTRATIO_XMIDYMIN = 3;
    public final short PRESERVEASPECTRATIO_XMAXYMIN = 4;
    public final short PRESERVEASPECTRATIO_XMINYMID = 5;
    public final short PRESERVEASPECTRATIO_XMIDYMID = 6;
    public final short PRESERVEASPECTRATIO_XMAXYMID = 7;
    public final short PRESERVEASPECTRATIO_XMINYMAX = 8;
    public final short PRESERVEASPECTRATIO_XMIDYMAX = 9;
    public final short PRESERVEASPECTRATIO_XMAXYMAX = 10;

    // フィールドmeetOrSliceの種類
    public final short MEETORSLICE_UNKNOWN = 0;
    public final short MEETORSLICE_MEET = 1;
    public final short MEETORSLICE_SLICE = 2;

    private short align;
    private short meetOrSlice;    
}
