package SESSION06.HW03;

public class SS06_03 {
    // 1. Thuộc tính (private - đóng gói)
    private String maSP;
    private String tenSP;
    private double giaBan;

    // 2. Constructor
    public SS06_03(String maSP, String tenSP, double giaBan) {
        this.maSP = maSP;
        this.tenSP = tenSP;
        setGiaBan(giaBan); // dùng setter để kiểm soát
    }

    // 3. Getter
    public String getMaSP() {
        return maSP;
    }

    public String getTenSP() {
        return tenSP;
    }

    public double getGiaBan() {
        return giaBan;
    }

    // 4. Setter
    public void setMaSP(String maSP) {
        this.maSP = maSP;
    }

    public void setTenSP(String tenSP) {
        this.tenSP = tenSP;
    }

    public void setGiaBan(double giaBan) {
        if (giaBan > 0) {
            this.giaBan = giaBan;
        } else {
            System.out.println("Giá bán không hợp lệ! Giá phải > 0");
        }
    }

    // 5. Phương thức hiển thị thông tin
    public void hienThiThongTin() {
        System.out.println("Mã SP: " + maSP);
        System.out.println("Tên SP: " + tenSP);
        System.out.println("Giá bán: " + giaBan);
        System.out.println("---------------------------");
    }

    // 6. Hàm main
    public static void main(String[] args) {
        SS06_03 p = new SS06_03("SP01", "Bàn phím cơ", 1500000);

        // Hiển thị ban đầu
        p.hienThiThongTin();

        // Thử set giá không hợp lệ
        p.setGiaBan(-500000);

        // Giá không đổi
        p.hienThiThongTin();

        // Set giá hợp lệ
        p.setGiaBan(1300000);
        p.hienThiThongTin();
    }
}
