package com.Ecom.GroceryCart;


import java.util.List;

public class VariantBasedProduct extends Product {
    List<Variant> variants; // List of objects of Variant class.

    // Since it is a sub class of Product class , we need to pass the variables of that class also as parameter of this constructor.
    public VariantBasedProduct(String name, String imageURL, List<Variant> variants) {
        super(name, imageURL); // Parent class Constructor called.
        this.variants = variants;
    }

    @Override
    public String toString() {
        return "VariantBasedProduct{" +
                "name='" + name + '\'' +
                ", imageURL='" + imageURL + '\'' +
                ", variants=" + variants +
                '}';
    }
}
