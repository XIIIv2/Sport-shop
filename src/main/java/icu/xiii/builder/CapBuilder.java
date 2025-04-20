package icu.xiii.builder;

import icu.xiii.clothes.Brand;
import icu.xiii.clothes.Cap;
import icu.xiii.clothes.Clothes;
import icu.xiii.clothes.ClothesColor;

public class CapBuilder implements ICapBuilder {

    private ClothesColor color;
    private Brand brand;

    public CapBuilder() {
        super();
    }

    @Override
    public CapBuilder colorIt(ClothesColor color) {
        this.color = color;
        return this;
    }

    @Override
    public CapBuilder brand(Brand brand) {
        this.brand = brand;
        return this;
    }

    @Override
    //rolling stones!
    public CapBuilder paintItBlack() {
        this.colorIt(ClothesColor.BLACK);
        return this;
    }

    @Override
    public CapBuilder paintItWhite() {
        this.colorIt(ClothesColor.WHITE);
        return this;
    }

    @Override
    public Cap build() throws IncompleteAssemblyException {
        Cap cap = new Cap(color, brand);
        if (cap.checkForDefects()) {
            throw new IncompleteAssemblyException("Cap assembly incomplete! Can't build.");
        }
        return cap;
    }
}
