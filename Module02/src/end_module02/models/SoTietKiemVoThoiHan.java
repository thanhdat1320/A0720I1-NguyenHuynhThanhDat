package end_module02.models;

public class SoTietKiemVoThoiHan extends SoTietKiem {

    public SoTietKiemVoThoiHan(String maSo, String maKhachHang, String ngayMoSo, String thoiGianBatDauGui, String soTienGui, String laiSuat) {
        super(maSo, maKhachHang, ngayMoSo, thoiGianBatDauGui, soTienGui, laiSuat);
    }

    public SoTietKiemVoThoiHan() {

    }

    @Override
    public String toString() {
        return getMaSo() + "," + getMaKhachHang() + "," + getNgayMoSo() + "," + getSoTienGui() + "," + getLaiSuat();
    }
}
