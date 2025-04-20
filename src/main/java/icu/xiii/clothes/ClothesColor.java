package icu.xiii.clothes;

public enum ClothesColor {
    RED("red", "#FF0000"),
    BLUE("blue", "#0000FF"),
    BLACK("black", "#000000"),
    WHITE("white", "#FFFFFF");

    private final String colorName;
    private final String hexColor;

    private ClothesColor(String colorName, String hexColor) {
        this.colorName = colorName;
        this.hexColor = hexColor;
    }

    public String getColorName() {
        return this.colorName;
    }

    public String getHexColor() {
        return this.hexColor;
    }
}
