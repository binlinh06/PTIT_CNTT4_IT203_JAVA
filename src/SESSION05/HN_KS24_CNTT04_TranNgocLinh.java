package SESSION05;

import java.util.Scanner;
import java.util.regex.Pattern;

public class HN_KS24_CNTT04_TranNgocLinh {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] mssvList = new String[100];
        int size = 0;
        final String MSSV_REGEX = "^B\\d{7}$";

        int choice;
        do {
            System.out.println("\n===== QUẢN LÝ MSSV =====");
            System.out.println("1. Hiển thị danh sách MSSV");
            System.out.println("2. Thêm MSSV ");
            System.out.println("3. Cập nhật MSSV theo index");
            System.out.println("4. Xóa MSSV");
            System.out.println("5. Tìm kiếm MSSV");
            System.out.println("6. Thoát");
            System.out.println("========================");
            System.out.print("Chọn chức năng: ");
            while (!sc.hasNextInt()){
                System.out.print("Nhập số hợp lệ: ");
                sc.next();
            }
            choice = sc.nextInt();

            switch (choice){
                case 1:
                    if (size == 0) {
                        System.out.println("Danh sách rỗng!");
                        break;
                    }
                    System.out.println("Danh sách MSSV\n");
                    for (int i = 0; i < size; i++) {
                        System.out.println((i+1)+ ". " +mssvList[i]);
                    }
                    break;
                case 2:
                    if (size == 100) {
                        System.out.println("Danh sách full!");
                        return;
                    }
                    String mssv;
                    while (true){
                        System.out.print("Nhập MSSV mới:");
                        mssv = sc.nextLine();
                        if(Pattern.matches(MSSV_REGEX,mssv)){
                            break;
                        } else {
                            System.out.println("MSSV không hợp lệ! (VD: B2101234)");
                        }
                    }
                    mssvList[size++] = mssv;
                    System.out.println("Thêm MSSV thành công!");
                    break;
                case 3:
                    if (size == 0) {
                        System.out.println("Danh sách rỗng!");
                        break;
                    }
                    int index;
                    System.out.print("Nhập index cần sửa (0 → " + (size - 1) + "): ");
                    while (!sc.hasNextInt()){
                        System.out.print("Nhập số hợp lệ: ");
                        sc.next();
                    }
                    index = sc.nextInt();
                    if (index < 0 || index >= size) {
                        System.out.println("Index không hợp lệ!");
                        return;
                    }
                    String newMSSV;
                    while (true) {
                        System.out.print("Nhập MSSV mới: ");
                        newMSSV = sc.nextLine();

                        if (Pattern.matches(MSSV_REGEX, newMSSV)) {
                            break;
                        } else {
                            System.out.println("MSSV không hợp lệ!");
                        }
                    }

                    mssvList[index] = newMSSV;
                    System.out.println("Cập nhật thành công!");
                    break;
                case 4:
                    if (size == 0) {
                        System.out.println("Danh sách rỗng!");
                        return;
                    }

                    System.out.print("Nhập MSSV cần xóa: ");
                    String target = sc.nextLine();

                    for (int i = 0; i < size; i++) {
                        if (mssvList[i].equalsIgnoreCase(target)) {
                            for (int j = i; j < size - 1; j++) {
                                mssvList[j] = mssvList[j + 1];
                            }
                            mssvList[--size] = null;

                            System.out.println("Xóa MSSV thành công!");
                            return;
                        }
                    }
                    System.out.println("Không tìm thấy MSSV cần xóa!");
                    break;
                case 5:
                    if (size == 0) {
                        System.out.println("Danh sách rỗng!");
                        return;
                    }

                    System.out.print("Nhập chuỗi cần tìm: ");
                    String keyword = sc.nextLine().toLowerCase();

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
                    break;
                case 6:
                    System.out.println("Thoát thành công!");
                    break;
                default:
                    System.out.println("ERROR");
            }
        }while (choice != 6);
    }
}
