package SESSION06.HW04;

public class SS06_04 {
    // 1. Thuộc tính
    private String maNV;
    private String tenNV;
    private double luong;

    // 2. Constructor không tham số
    public SS06_04() {
        this.maNV = "Chưa có";
        this.tenNV = "Chưa có";
        this.luong = 0;
    }

    // 3. Constructor có mã và tên
    public SS06_04(String maNV, String tenNV) {
        this.maNV = maNV;
        this.tenNV = tenNV;
        this.luong = 0;
    }

    // 4. Constructor đầy đủ thông tin
    public SS06_04(String maNV, String tenNV, double luong) {
        this.maNV = maNV;
        this.tenNV = tenNV;
        this.luong = luong;
    }

    // 5. Phương thức hiển thị thông tin
    public void hienThiThongTin() {
        System.out.println("Mã NV: " + maNV);
        System.out.println("Tên NV: " + tenNV);
        System.out.println("Lương: " + luong);
        System.out.println("---------------------------");
    }

    // 6. Hàm main
    public static void main(String[] args) {
        // Tạo nhân viên bằng constructor khác nhau
        SS06_04 nv1 = new SS06_04();
        SS06_04 nv2 = new SS06_04("NV01", "Nguyễn Văn A");
        SS06_04 nv3 = new SS06_04("NV02", "Trần Thị B", 15000000);

        // Hiển thị thông tin
        nv1.hienThiThongTin();
        nv2.hienThiThongTin();
        nv3.hienThiThongTin();
    }
}

