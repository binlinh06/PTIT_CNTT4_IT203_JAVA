package SESSION03.HW02;

import java.util.Scanner;

public class SS03_02 {
    public static void main(String[] args) {
        String[] books = {
                "Doraemon",
                "Conan",
                "Harry Potter",
                "Sherlock Holmes",
                "One Piece"
        };
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap ten sach can tim: ");
        String search = sc.nextLine();
        int index = searchBooks(books, search);

        if (index != -1) {
            System.out.println("Tim thay sach '" + search + "' tai vi tri so: " + index);
        } else {
            System.out.println("Sach khong ton tai trong thu vien.");
        }

        sc.close();
    }
    public static int searchBooks(String[] arr, String search){
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].equalsIgnoreCase(search)) {
                return i; // tìm thấy
            }
        }
        return -1; // không tìm thấy
    }
}
