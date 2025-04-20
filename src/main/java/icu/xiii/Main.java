package icu.xiii;

import icu.xiii.builder.CapBuilder;
import icu.xiii.builder.IncompleteAssemblyException;
import icu.xiii.builder.OrderBuilder;
import icu.xiii.builder.TShirtBuilder;
import icu.xiii.clothes.Brand;
import icu.xiii.clothes.Cap;
import icu.xiii.clothes.TShirt;

public class Main {

    public static void main(String[] args) {

        try {
            Brand activeSports = new Brand("Active sports");
            Brand smartCaps = new Brand("Smart caps");

            TShirt redTShirt = new TShirtBuilder()
                    .paintItRed()
                    .brand(activeSports)
                    .build();

            TShirt blueTShirt = new TShirtBuilder()
                    .paintItBlue()
                    .brand(activeSports)
                    .build();

            Cap blackCap = new CapBuilder()
                    .paintItBlack()
                    .brand(smartCaps)
                    .build();

            Cap whiteCap = new CapBuilder()
                    .paintItWhite()
                    .brand(smartCaps)
                    .build();

            Order order1 = new OrderBuilder()
                    .addItem(new Product("Red T-Shirt", redTShirt, 25.48f))
                    .addItem(new Product("White cap", whiteCap, 15.99f))
                    .build();

            Order order2 = new OrderBuilder()
                    .addItem(new Product("Blue T-Shirt", blueTShirt, 22.36f))
                    .addItem(new Product("Black cap", blackCap, 13.42f))
                    .build();

            getOutput(order1);
            getOutput(order2);
        } catch (IncompleteAssemblyException e) {
            getOutput(e.getMessage());
        }
    }

    public static void getOutput(String msg) {
        System.out.println(msg);
    }

    public static void getOutput(Object obj) {
        System.out.println(obj.toString());
    }
}
