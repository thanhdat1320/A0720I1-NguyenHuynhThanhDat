package end_module02.commons;

import _12_java_collection_framework.exercise.manage_product_use_arraylist.models.Product;
import end_module02.models.SoTietKiem;
import end_module02.models.SoTietKiemDaiHan;
import end_module02.models.SoTietKiemVoThoiHan;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.Writer;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class DocGhiFile {
    private static final String NEW_LINE_SEPARATOR = "\n";
    private static final String HEADER_DAI_HAN = "maSo,maKhachHang,NgayMoSo,ThoiGainBatDau,SoTieuGui,LaiSuat,KyHan,UuDai";
    private static final String HEADER_VO_THOI_HAN = "maSo,maKhachHang,NgayMoSo,SoTieuGui,kyhan";

    private static final String FILE_DAI_HAN = "src/end_module02/data/SoTietKiemDaiHan.csv";
    private static final String FILE_VO_THOI_HAN = "src/end_module02/data/SoTietKiemVoThoiHan.csv";


    public static void writeFileSoTietKiemDaiHan(List<SoTietKiem> list) {
        FileWriter fileWriter = null;
        try {
            fileWriter = new FileWriter(FILE_DAI_HAN);
            fileWriter.append(HEADER_DAI_HAN);
            fileWriter.append(NEW_LINE_SEPARATOR);

            for (SoTietKiem soTietKiem : list) {
                fileWriter.append(soTietKiem.toString());
                fileWriter.append(NEW_LINE_SEPARATOR);
            }
        } catch (Exception ex) {
            System.out.println("ERROR IN WRITE CUSTOMER TO FILE CSV");
        } finally {
            try {
                fileWriter.flush();
                fileWriter.close();
            } catch (Exception ex) {
                System.out.println("ERROR WHEN FLUSH OR CLOSE FILE CSV");
            }
        }
    }

    public static List<SoTietKiem> readFileDaiHan() {
        BufferedReader brRead = null;
        List<SoTietKiem> list = new ArrayList<>();
        Path path = Paths.get(FILE_DAI_HAN);

        if (!Files.exists(path)){
            try {
                Writer writer = new FileWriter(FILE_DAI_HAN);
            } catch (Exception ex) {
                System.out.println("ABC");
            }
        }

        try {
            brRead = new BufferedReader(new FileReader(FILE_DAI_HAN));
            String line;
            while ((line = brRead.readLine()) != null) {
                String[] splitDta = line.split(",");
                if (splitDta[0].equals("maSo")) {
                    continue;
                }
                SoTietKiemDaiHan soTietKiemDaiHan = new SoTietKiemDaiHan();
                soTietKiemDaiHan.setMaSo(splitDta[0]);
                soTietKiemDaiHan.setMaKhachHang(splitDta[1]);
                soTietKiemDaiHan.setNgayMoSo(splitDta[0]);
                soTietKiemDaiHan.setThoiGianBatDauGui(splitDta[2]);
                soTietKiemDaiHan.setSoTienGui(splitDta[3]);
                soTietKiemDaiHan.setLaiSuat(splitDta[4]);
                soTietKiemDaiHan.setKyHan(splitDta[5]);
                soTietKiemDaiHan.setUuDai(splitDta[6]);
                list.add(soTietKiemDaiHan);
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


    public static void writeFileSoTietKiemVoThoiGian(List<SoTietKiem> list) {
        FileWriter fileWriter = null;
        try {
            fileWriter = new FileWriter(FILE_VO_THOI_HAN);
            fileWriter.append(HEADER_VO_THOI_HAN);
            fileWriter.append(NEW_LINE_SEPARATOR);

            for (SoTietKiem soTietKiem : list) {
                fileWriter.append(soTietKiem.toString());
                fileWriter.append(NEW_LINE_SEPARATOR);
            }
        } catch (Exception ex) {
            System.out.println("ERROR IN WRITE CUSTOMER TO FILE CSV");
        } finally {
            try {
                fileWriter.flush();
                fileWriter.close();
            } catch (Exception ex) {
                System.out.println("ERROR WHEN FLUSH OR CLOSE FILE CSV");
            }
        }
    }

    public static List<SoTietKiem> readFileVoThoiHan() {
        BufferedReader brRead = null;
        List<SoTietKiem> list = new ArrayList<>();
        Path path = Paths.get(FILE_DAI_HAN);

        if (!Files.exists(path)){
            try {
                Writer writer = new FileWriter(FILE_VO_THOI_HAN);
            } catch (Exception ex) {
                System.out.println("ABC");
            }
        }

        try {
            brRead = new BufferedReader(new FileReader(FILE_VO_THOI_HAN));
            String line;
            while ((line = brRead.readLine()) != null) {
                String[] splitDta = line.split(",");
                if (splitDta[0].equals("maSo")) {
                    continue;
                }
                SoTietKiemVoThoiHan soTietKiemVoThoiHan = new SoTietKiemVoThoiHan();
                soTietKiemVoThoiHan.setMaSo(splitDta[0]);
                soTietKiemVoThoiHan.setMaKhachHang(splitDta[1]);
                soTietKiemVoThoiHan.setNgayMoSo(splitDta[2]);
                soTietKiemVoThoiHan.setSoTienGui(splitDta[3]);
                soTietKiemVoThoiHan.setLaiSuat(splitDta[4]);
                list.add(soTietKiemVoThoiHan);
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
