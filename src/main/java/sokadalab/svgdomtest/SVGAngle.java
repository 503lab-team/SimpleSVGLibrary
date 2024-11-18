package sokadalab.svgdomtest;

class SVGAngle {
    // フィールドunitTypeのリスト
    final static short TYPE_UNKNOWN = 0;     // 単位不明
    final static short TYPE_UNSPECIFIED = 1; // 単位なし
    final static short TYPE_DEG = 2;         // 度
    final static short TYPE_RAD = 3;         // ラジアン
    final static short TYPE_GRAD = 4;        // グラード
    
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
        this.unitType = TYPE_UNSPECIFIED;
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
            case TYPE_DEG :
                str = "度";
                break;
            case TYPE_RAD :
                str = "rad";
                break;
            case TYPE_GRAD :
                str = "grad";
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
                type = TYPE_UNSPECIFIED;
                break;
            case "度" :
                type = TYPE_DEG;
                break;
            case "°" :
                type = TYPE_DEG;
                break;
            case "rad" :
                type = TYPE_RAD;
                break;
            case "grad" :
                type = TYPE_GRAD;
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

