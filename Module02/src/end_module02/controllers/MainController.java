package end_module02.controllers;

import end_module02.Exception.MaSoTietKiemException;
import end_module02.commons.DocGhiFile;
import end_module02.commons.Validate;
import end_module02.models.SoTietKiem;
import end_module02.models.SoTietKiemDaiHan;
import end_module02.models.SoTietKiemVoThoiHan;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MainController {
    static Scanner input = new Scanner(System.in);
    static List<SoTietKiem> listSotietKiemDaiHan = new ArrayList<>();
    static List<SoTietKiem> ListSotietKiemVoThoiHan = new ArrayList<>();
//    static List<SoTietKiem> ListSotietKiemCoThoiGian = new ArrayList<>();

    public static void displayMainMenu() {
        System.out.println("=========== MAIN MENU ===========");
        System.out.println("1. Them moi so tiet kiem");
        System.out.println("2. Xoa so tiet kiem");
        System.out.println("3. Xem danh sach so tiet kiem");
        System.out.println("4. Xem thong tin khach han");
        System.out.println("5. Tim kiem so tiet kiem");
        System.out.println("6. Exit");
        System.out.println("=================================");
        System.out.print("Your choose: ");
        String choose = input.nextLine();

        switch (choose) {
            case "1": {
                themMoiSoTietKiem();
                break;
            }
            case "2": {
                xoaSoTietKiem();
                break;
            }
            case "3": {
                danhSachSoTietKiem();
                break;
            }
            case "4": {
                break;
            }
            case "5": {
                timKiemSotietKiem();
                break;
            }
            case "6": {
                System.exit(0);
                break;
            }
            default: {
                System.out.println("Fail! Please choose again! Enter to continue.");
                input.nextLine();
                displayMainMenu();
            }
        }
    }

    private static void themMoiSoTietKiem() {
        System.out.println("1. Dai Han");
        System.out.println("2. Ngan Han");
        System.out.print("Your choose: ");
        String choose = input.nextLine();
        switch (choose) {
            case "1": {
                themDaiHan();
                break;
            }
            case "2": {
                themVoThoiHan();
                break;
            }
            default: {
                System.out.println("Fail! Please choose again! Enter to continue.");
                input.nextLine();
                themMoiSoTietKiem();
            }
        }
    }

    private static void themDaiHan() {
        SoTietKiemDaiHan soTietKiemDaiHan = new SoTietKiemDaiHan();

        String maSo;
        do {
            System.out.print("Ma so tiet kiem: ");
            maSo = input.nextLine();
        } while (!Validate.checkMaSoTietKiem(maSo));
        soTietKiemDaiHan.setMaSo(maSo);

        String maKhachHang;
        do {
            System.out.print("Ma khach hang (KV-XXX XXX XXX)): ");
            maKhachHang = input.nextLine();
        } while (!Validate.checkMaKhachHang(maKhachHang));
        soTietKiemDaiHan.setMaKhachHang(maKhachHang);

        String soNgay;
        do {
            System.out.print("So ngay mo so: ");
            soNgay = input.nextLine();
        } while (!Validate.checkSoNgay(soNgay));
        soTietKiemDaiHan.setNgayMoSo(soNgay);

        String thoiGian;
        do {
            System.out.print("Thoi gian gui: ");
            thoiGian = input.nextLine();
        } while (!Validate.checkSoNgay(thoiGian));
        soTietKiemDaiHan.setThoiGianBatDauGui(thoiGian);

        String soTienGui;
        do {
            System.out.print("So Tien: ");
            soTienGui = input.nextLine();
        } while (!Validate.checkSoTienGui(soTienGui));
        soTietKiemDaiHan.setSoTienGui(soTienGui);

        String kyHan;
        do {
            System.out.print("Ky Han: ");
            kyHan = input.nextLine();
        } while (!Validate.checkKyHan(kyHan));
        soTietKiemDaiHan.setKyHan(kyHan);

        String laiSuat;
        do {
            System.out.print("lai suat: ");
            laiSuat = input.nextLine();
        } while (!Validate.checkLaiSuat(laiSuat));
        soTietKiemDaiHan.setLaiSuat(laiSuat);

        System.out.print("Uu Dai: ");
        String uuDai = input.nextLine();
        soTietKiemDaiHan.setUuDai(uuDai);

        listSotietKiemDaiHan.add(soTietKiemDaiHan);
        DocGhiFile.writeFileSoTietKiemDaiHan(listSotietKiemDaiHan);
        displayMainMenu();
    }

    private static void themVoThoiHan() {
        SoTietKiemVoThoiHan soTietKiemVoThoiHan = new SoTietKiemVoThoiHan();

        String maSo;
        do {
            System.out.print("Ma so tiet kiem: ");
            maSo = input.nextLine();
        } while (!Validate.checkMaSoTietKiem(maSo));
        soTietKiemVoThoiHan.setMaSo(maSo);

        String maKhachHang;
        do {
            System.out.print("Ma khach hang (KV-XXX XXX XXX)): ");
            maKhachHang = input.nextLine();
        } while (!Validate.checkMaKhachHang(maKhachHang));
        soTietKiemVoThoiHan.setMaKhachHang(maKhachHang);

        String soNgay;
        do {
            System.out.print("Ngay mo so: ");
            soNgay = input.nextLine();
        } while (!Validate.checkSoNgay(soNgay));
        soTietKiemVoThoiHan.setNgayMoSo(soNgay);

        String soTienGui;
        do {
            System.out.print("So Tien: ");
            soTienGui = input.nextLine();
        } while (!Validate.checkSoTienGui(soTienGui));
        soTietKiemVoThoiHan.setSoTienGui(soTienGui);

        String laiSuat;
        do {
            System.out.print("Lai Suat: ");
            laiSuat = input.nextLine();
        } while (!Validate.checkLaiSuat(laiSuat));
        soTietKiemVoThoiHan.setLaiSuat(laiSuat);

        ListSotietKiemVoThoiHan.add(soTietKiemVoThoiHan);
        DocGhiFile.writeFileSoTietKiemVoThoiGian(ListSotietKiemVoThoiHan);
        displayMainMenu();
    }

    private static void danhSachSoTietKiem() {
        System.out.println("1. Dai han");
        System.out.println("2. Ngan han");
        System.out.print("Your choose: ");
        String choose = input.nextLine();
        switch (choose) {
            case "1": {
                for (SoTietKiem soTietKiem : listSotietKiemDaiHan) {
                    System.out.println(soTietKiem.toString());
                }
                break;
            }
            case "2": {
                for (SoTietKiem soTietKiem : ListSotietKiemVoThoiHan) {
                    System.out.println(soTietKiem.toString());
                }
                break;
            }
            default: {
                System.out.println("Fail Enter to continue");
                input.nextLine();
                danhSachSoTietKiem();
            }
        }

        displayMainMenu();
    }

    private static void xoaSoTietKiem() {
        System.out.println("1. Dai Han");
        System.out.println("2. Ngan Han");
        System.out.print("Your choose: ");
        String choose = input.nextLine();
        switch (choose) {
            case "1": {
                for (SoTietKiem soTietKiem : listSotietKiemDaiHan) {
                    System.out.println(soTietKiem.toString());
                }

                String maSo;
                do {
                    System.out.print("Nhap ma so muon xoa: ");
                    maSo = input.nextLine();
                } while (!MaSoTietKiemException.checkMaSo(maSo));

                boolean flag = false;
                for (SoTietKiem soTietKiem : listSotietKiemDaiHan) {
                    if (maSo.equals(soTietKiem.getMaSo())) {
                        listSotietKiemDaiHan.remove(soTietKiem);
                        flag = true;
                        break;
                    }
                }
                if (!flag) {
                    System.out.println("Ma So Ban Nhap Khong Co Trong He Thong");
                    displayMainMenu();
                }
                break;
            }
            case "2": {
                for (SoTietKiem soTietKiem : ListSotietKiemVoThoiHan) {
                    System.out.println(soTietKiem.toString());
                }

                String maSo;
                do {
                    System.out.print("Nhap ma so muon xoa: ");
                    maSo = input.nextLine();
                } while (!MaSoTietKiemException.checkMaSo(maSo));

                boolean flag = false;
                for (SoTietKiem soTietKiem : ListSotietKiemVoThoiHan) {
                    if (maSo.equals(soTietKiem.getMaSo())) {
                        ListSotietKiemVoThoiHan.remove(soTietKiem);
                        flag = true;
                        break;
                    }
                }
                if (!flag) {
                    System.out.println("Ma So Ban Nhap Khong Co Trong He Thong");
                    displayMainMenu();
                }
                break;
            }
            default: {
                System.out.println("Fail!! Enter to continue");
                input.nextLine();
                xoaSoTietKiem();
            }
        }

        DocGhiFile.writeFileSoTietKiemDaiHan(listSotietKiemDaiHan);
        displayMainMenu();
    }

    private static void timKiemSotietKiem() {
        System.out.println("1. Dai Han");
        System.out.println("2. Ngan Han");
        System.out.print("Your choose: ");
        String choose = input.nextLine();

        switch (choose) {
            case "1": {
                String maSo;
                do {
                    System.out.print("Nhap ma so muon xoa: ");
                    maSo = input.nextLine();
                } while (!MaSoTietKiemException.checkMaSo(maSo));

                boolean flag = false;
                for (SoTietKiem soTietKiem : listSotietKiemDaiHan) {
                    if (maSo.equals(soTietKiem.getMaSo())) {
                        System.out.println(soTietKiem.toString());
                        flag = true;
                        break;
                    }
                }
                if (!flag) {
                    System.out.println("Ma So Ban Nhap Khong Co Trong He Thong");
                    displayMainMenu();
                }
                break;
            }
            case "2": {
                String maSo;
                do {
                    System.out.print("Nhap ma so muon xoa: ");
                    maSo = input.nextLine();
                } while (!MaSoTietKiemException.checkMaSo(maSo));

                boolean flag = false;
                for (SoTietKiem soTietKiem : ListSotietKiemVoThoiHan) {
                    if (maSo.equals(soTietKiem.getMaSo())) {
                        System.out.println(soTietKiem.toString());
                        flag = true;
                        break;
                    }
                }
                if (!flag) {
                    System.out.println("Ma So Ban Nhap Khong Co Trong He Thong");
                    displayMainMenu();
                }
                break;
            }
            default: {
                System.out.println("Fail! Enter to continue");
                input.nextLine();
                timKiemSotietKiem();
            }
        }
        displayMainMenu();
    }

    public static void main(String[] args) {
        listSotietKiemDaiHan = DocGhiFile.readFileDaiHan();
        ListSotietKiemVoThoiHan = DocGhiFile.readFileVoThoiHan();
        displayMainMenu();
    }

}

