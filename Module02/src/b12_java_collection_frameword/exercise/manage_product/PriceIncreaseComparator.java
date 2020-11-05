package b12_java_collection_frameword.exercise.manage_product;

import java.util.Comparator;

public class PriceIncreaseComparator implements Comparator<Product> {
    @Override
    public int compare(Product product1, Product product2) {
        return product1.getPrice() - product2.getPrice();
    }
}
