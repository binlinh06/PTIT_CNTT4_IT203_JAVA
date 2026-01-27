package SESSION03.HW05;

import java.util.Scanner;

public class SS03_05 {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] arr = {101, 102, 103, 104, 105};
        int n = arr.length;
         while (n > 0) {
             displayBooks(arr, n);

             System.out.print("Nhap ma sach can xoa (0 de thoat): ");
             int bookId = sc.nextInt();

             if (bookId == 0) {
                 break;
             }

             n = deleteBook(arr, n, bookId);
         }

         System.out.println("Ket thuc chuong trinh.");
         sc.close();
    }

    public static int  deleteBook(int[] arr, int n, int bookId) {
         int index = -1;
        for (int i = 0; i < n; i++) {
            if (arr[i] == bookId) {
                index = i;
            }
        }
        if (index == -1) {
            System.out.println("Khong tim thay sach ma " + bookId);
            return n;
        }
        for (int i = index; i < n - 1; i++) {
            arr[i] = arr[i + 1];
        }

        System.out.println("Da xoa sach ma " + bookId);
        return n - 1;
    }
    public static void displayBooks(int[] arr, int n) {
        System.out.print("Kho sach hien tai (" + n + " cuon): [ ");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println("]");
    }
}
