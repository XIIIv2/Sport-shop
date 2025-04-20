package icu.xiii.builder;

import icu.xiii.clothes.Cap;

public interface ICapBuilder extends IClothesBuilder {

    public IClothesBuilder paintItBlack();

    public IClothesBuilder paintItWhite();

    @Override
    public Cap build();
}
