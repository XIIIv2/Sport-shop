package icu.xiii;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Order {

    private final List<Product> items = new ArrayList<>();

    public Order(List<Product> items) {
        this.items.addAll(items);
    }

    public void addItem(Product product) {
        this.items.add(product);
    }

    public float getTotalPrice() {
        return (float) this.items.stream()
                .mapToDouble(Product::getPrice)
                .sum();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Order: ");
        this.items.forEach(item -> {
            sb.append("[name=").append(item.getName())
                    .append(", brand=").append(item.getClothes().getBrand())
                    .append(", price=").append(item.getPrice()).append("], ");
        });
        sb.append("total price=").append(this.getTotalPrice());
        return sb.toString();
    }
}
