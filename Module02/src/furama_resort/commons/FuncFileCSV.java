package furama_resort.commons;

import furama_resort.models.Villa;

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
    private static final String NEW_LINE_SEPARATOR = "\n";
    private static final String HEADER_VILLA = "StandardRoom - AreaPool - Floor - OtherFacilities";
    private static final String HEADER_HOUSE = "StandardRoom - Floor - OtherFacilities";
    private static final String HEADER_ROOM = "FreeService";
    private static final String FILE_VILLA = "src/furama_resort/data/Villa.csv";
    private static final String FILE_HOUSE = "src/furama_resort/data/House.csv";
    private static final String FILE_ROOM = "src/furama_resort/data/Room.csv";

    public static <T> void writeVillaToFileCSV(List<T> list, String value) {
        FileWriter fileWriter = null;

        try {
            if (value.equals("villa")) {
                fileWriter = new FileWriter(FILE_VILLA);
                fileWriter.append(HEADER_VILLA);
                fileWriter.append(NEW_LINE_SEPARATOR);
            } else if (value.equals("house")) {
                fileWriter = new FileWriter(FILE_HOUSE);
                fileWriter.append(HEADER_HOUSE);
                fileWriter.append(NEW_LINE_SEPARATOR);
            } else {
                fileWriter = new FileWriter(FILE_ROOM);
                fileWriter.append(HEADER_ROOM);
                fileWriter.append(NEW_LINE_SEPARATOR);
            }

            for (T t : list) {
                fileWriter.append(t.toString());
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

    public static List<Villa> readFileToListVilla() {
        BufferedReader br = null;
        List<Villa> listVilla = new ArrayList<>();

        // Kiem tra file csv co ton tai hay khong
        Path path = Paths.get(FILE_VILLA);
        if (!Files.exists(path)) {
            try {
                Writer writer = new FileWriter(FILE_VILLA) ;
                } catch(Exception ex){
                    System.out.println(ex.getMessage());
                }
            }
        // ------------------------------------------------

        try {
            br = new BufferedReader(new FileReader(FILE_VILLA));
            String line;                             
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
