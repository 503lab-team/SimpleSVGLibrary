package sokadalab.svgdomtest;

class SVGPreserveAspectRatio {
    // align Types
    final short PRESERVEASPECTRATIO_UNKNOWN = 0;
    final short PRESERVEASPECTRATIO_NONE = 1;
    final short PRESERVEASPECTRATIO_XMINYMIN = 2;
    final short PRESERVEASPECTRATIO_XMIDYMIN = 3;
    final short PRESERVEASPECTRATIO_XMAXYMIN = 4;
    final short PRESERVEASPECTRATIO_XMINYMID = 5;
    final short PRESERVEASPECTRATIO_XMIDYMID = 6;
    final short PRESERVEASPECTRATIO_XMAXYMID = 7;
    final short PRESERVEASPECTRATIO_XMINYMAX = 8;
    final short PRESERVEASPECTRATIO_XMIDYMAX = 9;
    final short PRESERVEASPECTRATIO_XMAXYMAX = 10;

    // meet-or-slice Types
    final short MEETORSLICE_UNKNOWN = 0;
    final short MEETORSLICE_MEET = 1;
    final short MEETORSLICE_SLICE = 2;

    short align;
    short meetOrSlice;    
}
