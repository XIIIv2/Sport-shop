package icu.xiii.clothes;

public class TShirt extends Clothes {

    public TShirt(ClothesColor color, Brand brand) {
        super(color, brand);
    }

    @Override
    public String toString() {
        return "T-Shirt [color=" + this.getColor().getColorName() + " (" + this.getColor().getHexColor() + ")" +
                ", brand=" + this.getBrand() + "]";
    }
}
