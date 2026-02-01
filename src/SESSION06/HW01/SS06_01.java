package SESSION06.HW01;

public class SS06_01 {
    // 1. Thuộc tính
    private String maSV;
    private String hoTen;
    private int namSinh;
    private double diemTrungBinh;

    // 2. Constructor có tham số
    public SS06_01(String maSV, String hoTen, int namSinh, double diemTrungBinh) {
        this.maSV = maSV;
        this.hoTen = hoTen;
        this.namSinh = namSinh;
        this.diemTrungBinh = diemTrungBinh;
    }

    // 3. Phương thức hiển thị thông tin
    public void hienThiThongTin() {
        System.out.println("Mã SV: " + maSV);
        System.out.println("Họ tên: " + hoTen);
        System.out.println("Năm sinh: " + namSinh);
        System.out.println("Điểm trung bình: " + diemTrungBinh);
        System.out.println("---------------------------");
    }

    // 4. Hàm main
    public static void main(String[] args) {
        // Khởi tạo đối tượng sinh viên
        SS06_01 sv1 = new SS06_01("SV001", "Nguyễn Văn A", 2004, 8.2);
        SS06_01 sv2 = new SS06_01("SV002", "Trần Thị B", 2003, 7.6);

        // Gọi phương thức hiển thị
        sv1.hienThiThongTin();
        sv2.hienThiThongTin();
    }
}

