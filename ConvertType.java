public enum ConvertType {
    CELSIUM_TO_FAHRENHEIT (1),
    FAHRENHEIT_TO_CELSIUM (2),
    CELSIUM_TO_KELVIN (3),
    KELVIN_TO_CELSIUM (4);

    private final int convertTypeCode;

    public int getConvertTypeCode() {
        return convertTypeCode;
    }

    ConvertType(int convertTypeCode) {
        this.convertTypeCode = convertTypeCode;
    }

    public static ConvertType getConvertTypeByCode(int code) {
        for (ConvertType convertType : values()) {
            if (convertType.getConvertTypeCode() ==code) {
                return convertType;
            }
        }
        throw new IllegalArgumentException("No enum found with url: [" + code + "]");
    }
}
