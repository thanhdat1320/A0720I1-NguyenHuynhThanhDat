package furama_resort.commons;

import furama_resort.models.House;
import furama_resort.models.Room;
import furama_resort.models.Services;
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
    private static final String HEADER_VILLA = "VILLA,StandardRoom,AreaPool,Floor,OtherFacilities";
    private static final String HEADER_HOUSE = "HOUSE,StandardRoom,Floor,OtherFacilities";
    private static final String HEADER_ROOM = "ROOM,FreeService";
    private static final String FILE_VILLA = "src/furama_resort/data/Villa.csv";
    private static final String FILE_HOUSE = "src/furama_resort/data/House.csv";
    private static final String FILE_ROOM = "src/furama_resort/data/Room.csv";

    public static <T> void writeFileCSV(List<T> list, String value) {
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

    public static List<Services> readFileCSV(String value) {
        BufferedReader brReader = null;
        List<Services> list = new ArrayList<>();
        String filePath = null;

        if (value.equals("Villa")) {
            filePath = FILE_VILLA;
        } else if (value.equals("House")) {
            filePath = FILE_HOUSE;
        } else if (value.equals("Room")) {
            filePath = FILE_ROOM;
        }
        Path path = Paths.get(filePath);
        if (!Files.exists(path)) {
            try {
                Writer writer = new FileWriter(filePath);
            } catch (Exception ex) {
                System.out.println(ex.getMessage());
            }
        }

        try {
            brReader = new BufferedReader(new FileReader(filePath));
            String line;

            while ((line = brReader.readLine()) != null) {
                String[] splitData = line.split(",");
                if (splitData[0].equals("VILLA") || splitData[0].equals("HOUSE") || splitData[0].equals("ROOM")) {
                    continue;
                }
                switch (value) {
                    case "Villa":
                        Villa villa = new Villa();
                        villa.setStandardRoom(splitData[0]);
                        villa.setAreaPool(splitData[1]);
                        villa.setFloor(splitData[2]);
                        villa.setOtherFacilities(splitData[3]);
                        list.add(villa);
                        break;
                    case "House":
                        House house = new House();
                        house.setStandardRoom(splitData[0]);
                        house.setFloor(splitData[1]);
                        house.setOtherFacilities(splitData[2]);
                        list.add(house);
                        break;
                    case "ROOM":
                        Room room = new Room();
                        room.setFreeService(splitData[0]);
                        list.add(room);
                        break;
                }
            }
        } catch (Exception ex) {
            System.out.println("Error When Read File CSV");
        } finally {
            try {
                brReader.close();
            } catch (Exception ex) {
                System.out.println("Error In Close BufferedReader");
            }
        }
        return list;
    }
}


