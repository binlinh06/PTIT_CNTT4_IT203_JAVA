package SESSION06.HW02;

public class SS06_02 {
    // 1. Thuộc tính
    private String username;
    private String password;
    private String email;

    // 2. Constructor
    public SS06_02(String username, String password, String email) {
        this.username = username;
        this.password = password;
        this.email = email;
    }

    // 3. Phương thức đổi mật khẩu
    public void doiMatKhau(String matKhauMoi) {
        this.password = matKhauMoi;
        System.out.println("Đổi mật khẩu thành công!");
    }

    // 4. Phương thức hiển thị thông tin (ẩn mật khẩu)
    public void hienThiThongTin() {
        System.out.println("Username: " + username);
        System.out.println("Email: " + email);
        System.out.println("Password: ******");
        System.out.println("---------------------------");
    }

    // 5. Hàm main
    public static void main(String[] args) {
        // Tạo đối tượng Account
        SS06_02 acc = new SS06_02(
                "linhngoc",
                "123456",
                "linhngoc@gmail.com"
        );

        // Hiển thị thông tin ban đầu
        acc.hienThiThongTin();

        // Đổi mật khẩu
        acc.doiMatKhau("newpassword2026");

        // Hiển thị lại sau khi đổi mật khẩu
        acc.hienThiThongTin();
    }
}

