package SESSION01.HW04;
import java.util.Scanner;
public class SS01_04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Nhập giá sách (USD)
        System.out.print("Nhập giá sách (USD - kiểu double): ");
        double usdPrice = sc.nextDouble();

        // Nhập tỷ giá
        System.out.print("Nhập tỷ giá (VNĐ/USD - kiểu float): ");
        float rate = sc.nextFloat();

        // Tính giá chính xác (số thực)
        double exactVND = usdPrice * rate;

        // Ép kiểu sang long để thanh toán
        long roundedVND = (long) exactVND;

        // Xuất kết quả
        System.out.println("Giá chính xác (số thực): " + exactVND);
        System.out.println("Giá làm tròn để thanh toán (long): " + roundedVND);

        sc.close();
    }
}
