package b12_java_collection_framework.exercise.manage_product_use_arraylist.commons;

import b12_java_collection_framework.exercise.manage_product_use_arraylist.models.Product;

import java.io.FileWriter;
import java.util.List;

public class FuncFileCSV {
    private static final String COMMA_DELIMITER = ",";
    private static final String NEW_LINE_SEPARATOR = "\n";
    private static final String FILE_HEADER_PRODUCT = "Name - ID - Price";
    private static final String FILE_PRODUCT = "src/b12_java_collection_framework/exercise/manage_product_use_arraylist/data/Product.csv";

    public static void writeProductToFileCSV(List<Product> listProduct) {
        FileWriter fileWriter = null;

        try {
            fileWriter = new FileWriter(FILE_PRODUCT);
            fileWriter.append(FILE_HEADER_PRODUCT);
            fileWriter.append(NEW_LINE_SEPARATOR);
            for (Product product : listProduct) {
                fileWriter.append(product.getName());
                fileWriter.append(COMMA_DELIMITER);
                fileWriter.append((char) product.getId());
                fileWriter.append(COMMA_DELIMITER);
                fileWriter.append((char) product.getPrice());
                fileWriter.append(NEW_LINE_SEPARATOR);
            }
        } catch (Exception ex) {
            System.out.println("ERROR in FileWriteCSV");
        } finally {
            try {
                fileWriter.flush();
                fileWriter.close();
            } catch (Exception ex) {
                System.out.println("ERROR when Flush or Close");
            }
        }
    }
}
