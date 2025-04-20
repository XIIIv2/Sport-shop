package icu.xiii.builder;

import icu.xiii.clothes.Brand;
import icu.xiii.clothes.Clothes;
import icu.xiii.clothes.ClothesColor;

public interface IClothesBuilder {

    public IClothesBuilder colorIt(ClothesColor color);

    public IClothesBuilder brand(Brand brand);

    public Clothes build() throws IncompleteAssemblyException;
}
