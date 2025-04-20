package icu.xiii.builder;

import icu.xiii.clothes.Brand;
import icu.xiii.clothes.ClothesColor;
import icu.xiii.clothes.TShirt;

public class TShirtBuilder implements ITShirtBuilder {

    private ClothesColor color;
    private Brand brand;

    public TShirtBuilder() {
        super();
    }

    @Override
    public TShirtBuilder colorIt(ClothesColor color) {
        this.color = color;
        return this;
    }

    @Override
    public TShirtBuilder brand(Brand brand) {
        this.brand = brand;
        return this;
    }

    @Override
    public TShirtBuilder paintItRed() {
        this.colorIt(ClothesColor.RED);
        return this;
    }

    @Override
    public TShirtBuilder paintItBlue() {
        this.colorIt(ClothesColor.BLUE);
        return this;
    }

    @Override
    public TShirt build() throws IncompleteAssemblyException {
        TShirt tShirt = new TShirt(color, brand);
        if (tShirt.checkForDefects()) {
            throw new IncompleteAssemblyException("T-Shirt assembly incomplete! Can't build.");
        }
        return tShirt;
    }
}
