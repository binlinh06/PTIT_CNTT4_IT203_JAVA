package SESSION01.HW01;
import java.util.Scanner;
public class SS01_01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Nhập dữ liệu
        System.out.print("Nhập mã sách: ");
        String bookID = sc.nextLine();

        System.out.print("Nhập tên sách: ");
        String bookName = sc.nextLine();

        System.out.print("Nhập năm xuất bản: ");
        int publishYear = sc.nextInt();

        System.out.print("Nhập giá bán: ");
        double price = sc.nextDouble();

        System.out.print("Sách còn không? (true/false): ");
        boolean isAvailable = sc.nextBoolean();

        // Xử lý
        int age = 2026 - publishYear;
        String status = isAvailable ? "Còn sách" : "Đã mượn";

        // In phiếu thông tin
        System.out.println("\n--- PHIẾU THÔNG TIN SÁCH ---");
        System.out.println("Tên sách: " + bookName.toUpperCase());
        System.out.println("Mã số: " + bookID + " | Tuổi thọ: " + age + " năm");
        System.out.printf("Giá bán: %.2f VND\n", price);
        System.out.println("Tình trạng: " + status);

        sc.close();
    }
}
    