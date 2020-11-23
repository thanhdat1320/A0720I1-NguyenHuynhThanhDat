package _12_java_collection_framework.exercise.manage_product_use_arraylist.commons;

import _12_java_collection_framework.exercise.manage_product_use_arraylist.models.Product;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.Writer;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class FuncFileCSV {
    private static final String COMMA_DELIMITER = ",";
    private static final String NEW_LINE_SEPARATOR = "\n";
    private static final String FILE_HEADER_PRODUCT = "Name,ID,Price";
    private static final String FILE_PRODUCT = "src/_12_java_collection_framework/exercise/manage_product_use_arraylist/data/Product.csv";


    public static void writeProductToFileCSV(List<Product> listProduct) {
        FileWriter fileWriter = null;

        try {
            fileWriter = new FileWriter(FILE_PRODUCT);
            fileWriter.append(FILE_HEADER_PRODUCT);
            fileWriter.append(NEW_LINE_SEPARATOR);
            for (Product product : listProduct) {
                fileWriter.append(product.getName());
                fileWriter.append(COMMA_DELIMITER);
                fileWriter.append(String.valueOf(product.getId()));
                fileWriter.append(COMMA_DELIMITER);
                fileWriter.append(String.valueOf(product.getPrice()));
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

    public static List<Product> readFileCSVProduct() {
        BufferedReader brRead = null;
        List<Product> list = new ArrayList<>();
        Path path = Paths.get(FILE_PRODUCT);

        if (!Files.exists(path)){
            try {
                Writer writer = new FileWriter(FILE_PRODUCT);
            } catch (Exception ex) {
                System.out.println("ABC");
            }
        }

        try {
            brRead = new BufferedReader(new FileReader(FILE_PRODUCT));
            String line;
            while ((line = brRead.readLine()) != null) {
                String[] splitDta = line.split(",");
                if (splitDta[0].equals("Name")) {
                    continue;
                }
                Product product = new Product();
                product.setName(splitDta[0]);
                product.setId(Integer.parseInt(splitDta[1]));
                product.setPrice(Integer.parseInt(splitDta[2]));
                list.add(product);
            }
        } catch (Exception ex) {
        } finally {
            try {
                brRead.close();
            } catch (Exception ex)  {
                System.out.println(ex.getMessage());
            }
        }
        return list;
    }
}
