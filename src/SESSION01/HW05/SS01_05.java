package SESSION01.HW05;
import java.util.Scanner;
public class SS01_05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhập mã sách (4 chữ số): ");
        int code = sc.nextInt();

        // Tách từng chữ số bằng toán tử số học
        int thousands = code / 1000;
        int hundreds  = (code / 100) % 10;
        int dozens    = (code / 10) % 10;
        int units     = code % 10;

        // Tính chữ số kiểm tra
        int sumOfFirstThreeNumber = thousands + hundreds + dozens;
        int expectedCheckDigit = sumOfFirstThreeNumber % 10;

        // Kiểm tra hợp lệ
        boolean isValid = expectedCheckDigit == units;

        // Xuất kết quả
        System.out.println("Chữ số kiểm tra kỳ vọng: " + expectedCheckDigit);

        if (isValid) {
            System.out.println("Kết quả kiểm tra mã sách: HỢP LỆ");
        } else {
            System.out.println("Kết quả kiểm tra mã sách: SAI MÃ");
        }

        sc.close();
    }
}
