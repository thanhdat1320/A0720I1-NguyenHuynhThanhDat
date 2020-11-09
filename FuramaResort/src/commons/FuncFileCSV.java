package commons;

import models.Villa;

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
    private static final String FILE_HEADER_VILLA = "StandardRoom - AreaPool - Floor - OtherFacilities";
    private static final String FILE_VILLA = "src/data/Villa.csv";

    public static void writeVillaToFileCSV(List<Villa> listVilla) {
        FileWriter fileWriter = null;

        try {
            fileWriter = new FileWriter(FILE_VILLA);
            fileWriter.append(FILE_HEADER_VILLA);
            fileWriter.append(NEW_LINE_SEPARATOR);
            for (Villa villa : listVilla) {
                fileWriter.append(villa.getStandardRoom());
                fileWriter.append(COMMA_DELIMITER);
                fileWriter.append((villa.getAreaPool()));
                fileWriter.append(COMMA_DELIMITER);
                fileWriter.append((villa.getFloor()));
                fileWriter.append(COMMA_DELIMITER);
                fileWriter.append(villa.getOtherFacilities());
                fileWriter.append(NEW_LINE_SEPARATOR);
            }
        } catch (Exception ex) {
            System.out.println("Error in FileWriteCSV ");
        } finally {
            try {
                fileWriter.flush();
                fileWriter.close();
            } catch (Exception ex) {
                System.out.println("Error when Flush or Close");
            }
        }
    }

    public static ArrayList<Villa> readFileToListVilla() {
        // tao biến br de luu file củ
        BufferedReader br = null;
        ArrayList<Villa> listVilla = new ArrayList<>();

//        // Kiem tra file csv co ton tai hay khong
//        Path path = Paths.get(FILE_VILLA);
//        if (!Files.exists(path)) {
//            try {
//                Writer writer = new FileWriter(FILE_VILLA) ;
//                } catch(Exception ex){
//                    System.out.println(ex.getMessage());
//                }
//            }
//        // ------------------------------------------------

        try {
            br = new BufferedReader(new FileReader(FILE_VILLA));
            String line;                              // đọc từng dòng br
            while ((line = br.readLine()) != null) {
                String[] splitData = line.split(",");
                if (splitData[0].equals("StandardRoom")) {
                    continue;
                }
                Villa villa = new Villa();
                villa.setStandardRoom(splitData[0]);
                villa.setAreaPool(splitData[1]);
                villa.setFloor(splitData[2]);
                villa.setOtherFacilities(splitData[3]);
                listVilla.add(villa);
            }
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        } finally {
            try {
                br.close();
            } catch (Exception ex) {
                System.out.println(ex.getMessage());
            }
        }
        return listVilla;
    }
}
