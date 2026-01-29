package SESSION05;
import java.util.Scanner;
import java.util.regex.Pattern;

public class MSSVManager {

    static Scanner scanner = new Scanner(System.in);
    static String[] mssvList = new String[100]; // mảng tối đa 100 MSSV
    static int size = 0; // số MSSV hiện có

    static final String MSSV_REGEX = "^B\\d{7}$";

    public static void main(String[] args) {
        int choice;

        do {
            showMenu();
            System.out.print("Chọn chức năng: ");
            choice = readInt();

            switch (choice) {
                case 1:
                    display();
                    break;
                case 2:
                    addMSSV();
                    break;
                case 3:
                    updateMSSV();
                    break;
                case 4:
                    deleteMSSV();
                    break;
                case 5:
                    searchMSSV();
                    break;
                case 6:
                    System.out.println("👋 Thoát chương trình!");
                    break;
                default:
                    System.out.println("❌ Lựa chọn không hợp lệ!");
            }

        } while (choice != 6);
    }

    // ================= MENU =================
    static void showMenu() {
        System.out.println("\n===== QUẢN LÝ MSSV =====");
        System.out.println("1. Hiển thị danh sách MSSV");
        System.out.println("2. Thêm MSSV (Regex)");
        System.out.println("3. Cập nhật MSSV theo index");
        System.out.println("4. Xóa MSSV (dồn mảng)");
        System.out.println("5. Tìm kiếm MSSV (Regex)");
        System.out.println("6. Thoát");
        System.out.println("========================");
    }

    // ================= 1. HIỂN THỊ =================
    static void display() {
        if (size == 0) {
            System.out.println("Danh sách MSSV rỗng!");
            return;
        }

        System.out.println("Danh sách MSSV:");
        for (int i = 0; i < size; i++) {
            System.out.println((i + 1) + ". " + mssvList[i]);
        }
    }

    // ================= 2. THÊM =================
    static void addMSSV() {
        if (size == 100) {
            System.out.println("Mảng đã đầy (100 MSSV)!");
            return;
        }

        String mssv;
        while (true) {
            System.out.print("Nhập MSSV mới: ");
            mssv = scanner.nextLine();

            if (Pattern.matches(MSSV_REGEX, mssv)) {
                break;
            } else {
                System.out.println("❌ MSSV không hợp lệ! (VD: B2101234)");
            }
        }

        mssvList[size++] = mssv;
        System.out.println("✅ Thêm MSSV thành công!");
    }

    // ================= 3. CẬP NHẬT =================
    static void updateMSSV() {
        if (size == 0) {
            System.out.println("Danh sách rỗng!");
            return;
        }

        System.out.print("Nhập index cần sửa (0 → " + (size - 1) + "): ");
        int index = readInt();

        if (index < 0 || index >= size) {
            System.out.println("❌ Index không hợp lệ!");
            return;
        }

        String newMSSV;
        while (true) {
            System.out.print("Nhập MSSV mới: ");
            newMSSV = scanner.nextLine();

            if (Pattern.matches(MSSV_REGEX, newMSSV)) {
                break;
            } else {
                System.out.println("❌ MSSV không hợp lệ!");
            }
        }

        mssvList[index] = newMSSV;
        System.out.println("✅ Cập nhật thành công!");
    }

    // ================= 4. XÓA (DỒN MẢNG) =================
    static void deleteMSSV() {
        if (size == 0) {
            System.out.println("Danh sách rỗng!");
            return;
        }

        System.out.print("Nhập MSSV cần xóa: ");
        String target = scanner.nextLine();

        for (int i = 0; i < size; i++) {
            if (mssvList[i].equalsIgnoreCase(target)) {

                // Dồn mảng
                for (int j = i; j < size - 1; j++) {
                    mssvList[j] = mssvList[j + 1];
                }
                mssvList[--size] = null;

                System.out.println("✅ Xóa MSSV thành công!");
                return;
            }
        }

        System.out.println("❌ Không tìm thấy MSSV cần xóa!");
    }

    // ================= 5. TÌM KIẾM =================
    static void searchMSSV() {
        if (size == 0) {
            System.out.println("Danh sách rỗng!");
            return;
        }

        System.out.print("Nhập chuỗi cần tìm: ");
        String keyword = scanner.nextLine().toLowerCase();

        boolean found = false;
        System.out.println("Kết quả tìm kiếm:");

        for (int i = 0; i < size; i++) {
            if (mssvList[i].toLowerCase().contains(keyword)) {
                System.out.println((i + 1) + ". " + mssvList[i]);
                found = true;
            }
        }

        if (!found) {
            System.out.println("Không có MSSV phù hợp!");
        }
    }

    // ================= TIỆN ÍCH =================
    static int readInt() {
        while (!scanner.hasNextInt()) {
            System.out.print("Nhập số hợp lệ: ");
            scanner.next();
        }
        int value = scanner.nextInt();
        scanner.nextLine(); // clear buffer
        return value;
    }
}
