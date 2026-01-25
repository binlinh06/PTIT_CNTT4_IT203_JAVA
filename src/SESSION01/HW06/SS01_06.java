package SESSION01.HW06;
import java.util.Scanner;
public class SS01_06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhập số thứ tự của sách trong hệ thống: ");
        int stt = sc.nextInt();

        // Xác định kệ sách (mỗi kệ 25 cuốn)
        int shelf = (stt - 1) / 25 + 1;

        // Xác định vị trí trên kệ (1 → 25)
        int position = (stt - 1) % 25 + 1;

        // Xác định khu vực bằng toán tử điều kiện
        String area = (shelf <= 10) ? "Khu Cận (Gần cửa)" : "Khu Viễn";

        // Xuất thông tin
        System.out.println("\n--- THÔNG TIN ĐỊNH VỊ ---");
        System.out.println("Sách số: " + stt);
        System.out.println("Địa chỉ: Kệ " + shelf + " - Vị trí " + position);
        System.out.println("Phân khu: " + area);

        sc.close();
    }
}
