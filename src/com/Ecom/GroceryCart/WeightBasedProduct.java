package com.Ecom.GroceryCart;

public class WeightBasedProduct extends Product{
    float minQty , pricePerKg ;

    // Since it is a sub class of Product class , we need to pass the variables of that class also as parameter of this constructor.
    public WeightBasedProduct(String name, String imageURL, float minQty, float pricePerKg) {
        super(name, imageURL); // Parent class Constructor called.
        this.minQty = minQty;
        this.pricePerKg = pricePerKg;
    }

    @Override
    public String toString() {
        return "WeightBasedProduct{" +
                "name='" + name + '\'' +
                ", imageURL='" + imageURL + '\'' +
                ", minQty=" + minQty +
                ", pricePerKg=" + pricePerKg +
                '}';
    }
}
