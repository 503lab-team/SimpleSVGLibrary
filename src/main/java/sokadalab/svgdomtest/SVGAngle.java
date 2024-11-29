package sokadalab.svgdomtest;

public class SVGAngle {
    // フィールドunitTypeのリスト
    public final static short TYPE_UNKNOWN = 0;     // 単位不明
    public final static short TYPE_UNSPECIFIED = 1; // 単位なし
    public final static short TYPE_DEG = 2;         // 度
    public final static short TYPE_RAD = 3;         // ラジアン
    public final static short TYPE_GRAD = 4;        // グラード
    
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
        this.valueAsString = Float.toString(valueInSpecifiedUnits) + unitTypeToString(getUnitType());
    }
    public void newValueSpecifiedUnit(float value) {
        this.unitType = TYPE_UNSPECIFIED;
        this.valueInSpecifiedUnits = value;
        this.valueAsString = Float.toString(value) + unitTypeToString(getUnitType());
    }
    public void newValueSpecifiedUnit(String valueAsString) {
        // 規定通りの書式であるかを判定
        if (valueAsString.matches("^\\d+\\.?\\d*.*")) {
            String str_type = valueAsString.replaceAll("^\\d+\\.?\\d*", "");
            String str_value = valueAsString.replaceAll(str_type, "");
            this.unitType = stringToUnitType(str_type);
            this.valueInSpecifiedUnits = Float.parseFloat(str_value);
            if (this.unitType == TYPE_UNKNOWN) {
                this.valueAsString = String.valueOf(str_value);
            } else {
                this.valueAsString = valueAsString;                
            }
        }
    }

    // unitTypeから文字列
    public static String unitTypeToString(short unitType) {
        String str;
        switch(unitType) {
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
    public static short stringToUnitType(String str) {
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
}

