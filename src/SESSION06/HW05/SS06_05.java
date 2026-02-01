package SESSION06.HW05;

public class SS06_05 {
    // 1. Thuộc tính của đối tượng
    private String maSach;
    private String tenSach;
    private double gia;

    // 2. Constructor (tham số trùng tên)
    public SS06_05(String maSach, String tenSach, double gia) {
        this.maSach = maSach;
        this.tenSach = tenSach;
        this.gia = gia;
    }

    // 3. Phương thức hiển thị thông tin
    public void hienThiThongTin() {
        System.out.println("Mã sách: " + this.maSach);
        System.out.println("Tên sách: " + this.tenSach);
        System.out.println("Giá: " + this.gia);
        System.out.println("---------------------------");
    }

    // 4. Hàm main
    public static void main(String[] args) {
        SS06_05 b1 = new SS06_05("S01", "Lập trình Java cơ bản", 120000);
        SS06_05 b2 = new SS06_05("S02", "OOP từ A đến Z", 150000);

        b1.hienThiThongTin();
        b2.hienThiThongTin();
    }
}

