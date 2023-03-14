package Chapter12.Exercise.Exercise_12_08;

public class HexFormatException extends NumberFormatException {
    String hex;

    public HexFormatException(String hex) {
        super(hex + " is not a hex string");
        this.hex = hex;
    }

    public String getHex() {
        return hex;
    }
}
