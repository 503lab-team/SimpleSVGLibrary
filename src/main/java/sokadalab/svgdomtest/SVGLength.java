package sokadalab.svgdomtest;

public class SVGLength {
    // フィールドunitTypeのリスト
    public final static short TYPE_UNKNOWN = 0;    // 単位不明
    public final static short TYPE_NUMBER = 1;     // 単位なし
    public final static short TYPE_PER = 2;        // %
    public final static short TYPE_EM = 3;         // em
    public final static short TYPE_EX = 4;         // ex
    public final static short TYPE_PX = 5;         // px
    public final static short TYPE_CM = 6;         // cm
    public final static short TYPE_MM = 7;         // mm
    public final static short TYPE_IN = 8;         // in
    public final static short TYPE_PT = 9;         // pt
    public final static short TYPE_PC = 10;        // pc
    
    private String valueAsString;       // 数値 (単位あり)
    private float valueInSpecifiedUnits;// 数値 (単位なし)
    private short unitType;             // 単位を表す値

    public String getValueAsString() {
        return this.valueAsString;
    }

    public float getValueInSpecifiedUnits() {
        return this.valueInSpecifiedUnits;
    }

    public short getUnitType() {
        return this.unitType;
    }

    // 属性を任意の値にリセット
    public void newValueSpecifiedUnit(short unitType, float valueInSpecifiedUnits) {
        this.unitType = unitType;
        this.valueInSpecifiedUnits = valueInSpecifiedUnits;
        this.valueAsString = Float.toString(this.valueInSpecifiedUnits) + unitTypeToString(this.unitType);
    }
    public void newValueSpecifiedUnit(float value) {
        this.unitType = TYPE_NUMBER;
        this.valueInSpecifiedUnits = value;
        this.valueAsString = Float.toString(this.valueInSpecifiedUnits);
    }
    public void newValueSpecifiedUnit(int value) {
        this.unitType = TYPE_NUMBER;
        this.valueInSpecifiedUnits = value;
        this.valueAsString = Float.toString(this.valueInSpecifiedUnits);
    }
    public void newValueSpecifiedUnit(String valueAsString) {
        // 規定通りの書式であるかを判定
        if (valueAsString.matches("\\d+\\.?\\d*.*")) {
            String str_type = valueAsString.replaceAll("\\d+\\.?\\d*", "");
            String str_value = valueAsString.replaceAll(str_type, "");
            this.unitType = stringToUnitType(str_type);
            this.valueInSpecifiedUnits = Float.parseFloat(str_value);
            if (this.unitType == TYPE_UNKNOWN) {
                this.valueAsString = str_value;
            } else {
                this.valueAsString = valueAsString;
            }
        }
    }

    public static String unitTypeToString(short type) {
        String str;
        switch(type) {
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

    public static short stringToUnitType(String str) {
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
}
