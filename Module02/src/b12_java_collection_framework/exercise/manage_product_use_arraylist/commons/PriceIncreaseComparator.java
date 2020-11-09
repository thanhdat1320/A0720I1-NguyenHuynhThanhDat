package b12_java_collection_framework.exercise.manage_product_use_arraylist.commons;

import b12_java_collection_framework.exercise.manage_product_use_arraylist.models.Product;

import java.util.Comparator;

public class PriceIncreaseComparator implements Comparator<Product> {
    @Override
    public int compare(Product product1, Product product2) {
        return product1.getPrice() - product2.getPrice();
    }
}
