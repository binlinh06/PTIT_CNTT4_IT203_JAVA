package SESSION06.HW06;

public class SS06_06 {
    // 1. Thuộc tính (Encapsulation)
    private int id;
    private String username;
    private String password;
    private String email;

    // 2. Constructor
    public SS06_06(int id, String username, String password, String email) {
        this.id = id;
        this.username = username;
        setPassword(password);
        setEmail(email);
    }

    // 3. Getter
    public int getId() {
        return id;
    }

    public String getUsername() {
        return username;
    }

    public String getEmail() {
        return email;
    }

    // 4. Setter
    public void setUsername(String username) {
        this.username = username;
    }

    public void setPassword(String password) {
        if (password != null && !password.trim().isEmpty()) {
            this.password = password;
        } else {
            System.out.println("Password không được rỗng!");
        }
    }

    public void setEmail(String email) {
        if (email != null && email.contains("@")) {
            this.email = email;
        } else {
            System.out.println("Email không hợp lệ!");
        }
    }

    // 5. Phương thức hiển thị thông tin
    public void hienThiThongTin() {
        System.out.println("ID: " + id);
        System.out.println("Username: " + username);
        System.out.println("Email: " + email);
        System.out.println("Password: ******");
        System.out.println("---------------------------");
    }

    // 6. Hàm main
    public static void main(String[] args) {
        // User hợp lệ
        SS06_06 u1 = new SS06_06(1, "linhngoc", "123456", "linhngoc@gmail.com");
        u1.hienThiThongTin();

        // User email sai
        SS06_06 u2 = new SS06_06(2, "user2", "abcdef", "email-sai");
        u2.hienThiThongTin();

        // User password rỗng
        SS06_06 u3 = new SS06_06(3, "user3", "", "user3@gmail.com");
        u3.hienThiThongTin();

        // Thử set lại dữ liệu
        u2.setEmail("user2@gmail.com");
        u3.setPassword("newpass123");

        u2.hienThiThongTin();
        u3.hienThiThongTin();
    }
}

