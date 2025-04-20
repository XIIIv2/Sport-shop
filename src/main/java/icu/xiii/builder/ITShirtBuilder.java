package icu.xiii.builder;

import icu.xiii.clothes.Cap;
import icu.xiii.clothes.TShirt;

public interface ITShirtBuilder extends IClothesBuilder {

    public IClothesBuilder paintItRed();

    public IClothesBuilder paintItBlue();

    @Override
    public TShirt build();
}
