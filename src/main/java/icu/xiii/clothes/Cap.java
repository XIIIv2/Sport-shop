package icu.xiii.clothes;

public class Cap extends Clothes {

    public Cap(ClothesColor color, Brand brand) {
        super(color, brand);
    }

    @Override
    public String toString() {
        return "Cap [color=" + this.getColor().getColorName() + " (" + this.getColor().getHexColor() + ")" +
                ", brand=" + this.getBrand() + "]";
    }
}
