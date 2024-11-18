package sokadalab.svgdomtest;

//import java.awt.Dimension;
//import java.awt.Toolkit;

class SVGLength {
    // フィールドunitTypeのリスト
    final static short TYPE_UNKNOWN = 0;    // 単位不明
    final static short TYPE_NUMBER = 1;     // 単位なし
    final static short TYPE_PER = 2;        // %
    final static short TYPE_EM = 3;         // em
    final static short TYPE_EX = 4;         // ex
    final static short TYPE_PX = 5;         // px
    final static short TYPE_CM = 6;         // cm
    final static short TYPE_MM = 7;         // mm
    final static short TYPE_IN = 8;         // in
    final static short TYPE_PT = 9;         // pt
    final static short TYPE_PC = 10;        // pc
    
    private String valueAsString;       // 数値 (単位あり)
    private float valueInSpecifiedUnits;// 数値 (単位なし)
    private float value;                // 数値 (ユーザ単位)
    private short unitType;             // 単位を表す値

    String getValueAsString() {
        return this.valueAsString;
    }

    float getValueInSpecifiedUnits() {
        return this.valueInSpecifiedUnits;
    }

    short getUnitType() {
        return this.unitType;
    }

    // 属性を任意の値にリセット
    void newValueSpecifiedUnit(short unitType, float valueInSpecifiedUnits) {
        this.unitType = unitType;
        this.valueInSpecifiedUnits = valueInSpecifiedUnits;
        this.valueAsString = Float.toString(valueInSpecifiedUnits) + unitTypeToString();
/*        float dpi = getDPI();
        switch(this.unitType) {
            case TYPE_PER :
                str = "%";
                break;
            case TYPE_EM :
                str = "em";
                break;
            case TYPE_EX :
                str = "ex";
                break;
            case TYPE_PX :
                str = "px";
                break;
            case TYPE_CM :
                this.value = this.valueInSpecifiedUnits * dpi / (float)2.54;
                break;
            case TYPE_MM :
                this.value = this.valueInSpecifiedUnits * dpi / (float)25.4;
                break;
            case TYPE_PT :
                str = "pt";
                break;
            case TYPE_PC :
                str = "pc";
                break;
            case TYPE_IN :
                this.value = this.valueInSpecifiedUnits * dpi;
                break;
            default :
                this.value = this.valueInSpecifiedUnits;
        }
*/    }
    void newValueSpecifiedUnit(float value) {
        this.unitType = TYPE_NUMBER;
        this.valueInSpecifiedUnits = value;
        this.valueAsString = Float.toString(value) + unitTypeToString();
        this.value = value;
    }
    void newValueSpecifiedUnit(String valueAsString) {
        // 規定通りの書式であるかを判定
        if (valueAsString.matches("^\\d+\\.?\\d*.*")) {
            String str_type = valueAsString.replaceAll("^\\d+\\.?\\d*", "");
            String str_value = valueAsString.replaceAll(str_type, "");
            this.unitType = stringToUnitType(str_type);
            this.valueInSpecifiedUnits = Float.parseFloat(str_value);
            this.valueAsString = valueAsString;
        }
    }

    /*    // 数値の単位のみを変更する
    void convertToSpecifiedUnits(short unitType) {
        this.unitType = unitType;
        // 解像度に合わせた値に変換したい
        this.valueAsString = String.valueOf(this.value);

    }
*/

    // unitTypeから文字列
    String unitTypeToString() {
        String str;
        switch(this.unitType) {
            case TYPE_PER :
                str = "%";
                break;
            case TYPE_EM :
                str = "em";
                break;
            case TYPE_EX :
                str = "ex";
                break;
            case TYPE_PX :
                str = "px";
                break;
            case TYPE_CM :
                str = "cm";
                break;
            case TYPE_MM :
                str = "mm";
                break;
            case TYPE_IN :
                str = "in";
                break;
            case TYPE_PT :
                str = "pt";
                break;
            case TYPE_PC :
                str = "pc";
                break;
            default:
                str = "";
        }
        return str;
    }

    // 文字列からunitType
    short stringToUnitType(String str) {
        short type;
        switch (str) {
            case "" :
                type = TYPE_NUMBER;
                break;
            case "%" :
                type = TYPE_PER;
                break;
            case "em" :
                type = TYPE_EM;
                break;
            case "ex" :
                type = TYPE_EX;
                break;
            case "px" :
                type = TYPE_PX;
                break;
            case "cm" :
                type = TYPE_CM;
                break;
            case "mm" :
                type = TYPE_MM;
                break;
            case "in" :
                type = TYPE_IN;
                break;
            case "pt" :
                type = TYPE_PT;
                break;
            case "pc" :
                type = TYPE_PC;
                break;
            default :
                type = TYPE_UNKNOWN;
        }
        return type;
    }
    
/*    // dpiを取得
    float getDPI() {
        Dimension size = Toolkit.getDefaultToolkit().getScreenSize();
        double width = (double) size.getWidth();
        double height = (double) size.getHeight();
        float dpi = (float)Math.sqrt(width*width+height*width);
        return dpi;
    }
*/
}
