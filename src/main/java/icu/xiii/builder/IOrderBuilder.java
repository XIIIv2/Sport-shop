package icu.xiii.builder;

import icu.xiii.Order;
import icu.xiii.Product;

public interface IOrderBuilder {

    public IOrderBuilder addItem(Product product);

    public Order build();
}
