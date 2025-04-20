package icu.xiii.builder;

import icu.xiii.Order;
import icu.xiii.Product;

import java.util.ArrayList;
import java.util.List;

public class OrderBuilder implements IOrderBuilder {

    private final List<Product> items = new ArrayList<>();

    public IOrderBuilder addItem(Product product) {
        this.items.add(product);
        return this;
    }

    public Order build() {
        return new Order(items);
    }
}
