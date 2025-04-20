package icu.xiii;

import icu.xiii.clothes.Clothes;

public class Product {

    private String name;
    private Clothes clothes;
    private float price;

    public Product() {
        super();
    }

    public Product(String name, Clothes clothes, float price) throws IllegalArgumentException {
        this();
        this.name = name;
        this.clothes = clothes;
        this.setPrice(price);
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Clothes getClothes() {
        return this.clothes;
    }

    public void setClothes(Clothes clothes) {
        this.clothes = clothes;
    }

    public float getPrice() {
        return this.price;
    }

    public void setPrice(float price) throws IllegalArgumentException {
        if (price < 0) {
            throw new IllegalArgumentException("Price cannot be lower than a zero");
        }
        this.price = price;
    }

    @Override
    public String toString() {
        return "Product [name=" + this.name +
                ", price=" + this.price +
                ", clothes=" + this.clothes.toString() + "]";
    }
}
