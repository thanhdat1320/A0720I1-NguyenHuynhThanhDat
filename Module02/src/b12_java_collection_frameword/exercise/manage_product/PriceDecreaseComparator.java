package b12_java_collection_frameword.exercise.manage_product;

import java.util.Comparator;

public class PriceDecreaseComparator implements Comparator<Product> {
    @Override
    public int compare(Product product1, Product product2) {
        return product2.getPrice() - product1.getPrice();
    }
}
