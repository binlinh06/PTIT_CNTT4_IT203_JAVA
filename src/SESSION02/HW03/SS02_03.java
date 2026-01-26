package SESSION02.HW03;

import java.util.Scanner;

public class SS02_03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhap so luong sach tra muon:");
        int book = sc.nextInt();

        int total = 0;

        for (int i = 1; i <= book; i++) {
            System.out.printf("Nhap so ngay tre cua cuon thu " +i +":");
            int dayLate = sc.nextInt();

            total += dayLate * 5000;
        }
        System.out.println("\n===> Tong tien phat: " + total + " VND");
    }
}
