package SESSION01.HW02;
import java.util.Scanner;
public class SS01_02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhập số ngày chậm trễ: ");
        int n = sc.nextInt();

        System.out.print("Nhập số lượng sách mượn: ");
        int m = sc.nextInt();

        double total = n * m * 5000;

        // Gán mặc định
        double totals = total;

        if (n > 7 && m >= 3) {
            totals = total * 1.2;
        }

        boolean lockCard = totals > 50000;

        System.out.printf("Tiền phạt gốc: %.0f VND\n", total);
        System.out.printf("Tổng tiền phạt: %.0f VND\n", totals);
        System.out.println("Yêu cầu khóa thẻ: " + lockCard);

        sc.close();
    }
}
