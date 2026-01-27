package SESSION03.HW01;

import java.util.Scanner;

public class SS03_01 {
    public static int[] addBookToLibraries(int n) {
        Scanner sc = new Scanner(System.in);
        int book[] = new int[n];
        System.out.println("Nhap ma so cho " + n + " cuon sach:");
        for (int i = 0; i < n; i++) {
            System.out.print("Sach thu " + (i + 1) + ": ");
            book[i] = sc.nextInt();
        }
        return book;
    }

    public static void displayLibraries(int[] arr){
        System.out.print("Danh sach ma sach: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
            if (i < arr.length - 1) {
                System.out.print(", ");
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhap so luong sach can quan ly: ");
        int n = sc.nextInt();

        int[] libraries = addBookToLibraries(n);
        System.out.println("\n--- KET QUA ---");
        displayLibraries(libraries);

        sc.close();
    }
}
