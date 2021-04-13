package com.Ecom;
import com.Ecom.GroceryCart.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        // Create Products
        Product apple = new WeightBasedProduct("APPLE","",1,100);
        Product kiwi = new VariantBasedProduct("KIWI","",new ArrayList<>(
                Arrays.asList(
                        new Variant("500g",80),
                        new Variant("1kg",150)
                )
        ));
        // Add them in a list
        List<Product> products =  new ArrayList<>(
                Arrays.asList(apple,kiwi)
        );
        System.out.println(products);

    }
}
