package icu.xiii.clothes;

public abstract class Clothes {

    private ClothesColor color;
    private Brand brand;

    public Clothes() {
        super();
    }

    public Clothes(ClothesColor color, Brand brand) {
        this();
        this.color = color;
        this.brand = brand;
    }

    public ClothesColor getColor() {
        return this.color;
    }

    public void setColor(ClothesColor color) {
        this.color = color;
    }

    public Brand getBrand() {
        return this.brand;
    }

    public void setBrand(Brand brand) {
        this.brand = brand;
    }

    public boolean checkForDefects() {
        return this.brand == null || this.color == null;
    }

    @Override
    public String toString() {
        return "Clothes [color=" + this.color.getColorName() + " (" + this.color.getHexColor() + ")" +
                ", brand=" + this.brand + "]";
    }
}
