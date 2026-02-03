package SESSION08.KiemTraDauGio;

import java.util.Scanner;

public class Main {
    static Scanner sc = new Scanner(System.in);
    static Student[] students;
    static int n;

    static void main(String[] args) {
        int choice;
        do {
            System.out.println("===== QUẢN ẢN LÝ ĐIỂM SINH VIÊN =====");
            System.out.println("1. Nhập danh sách sinh viên");
            System.out.println("2. Hiển thị danh sách sinh viên");
            System.out.println("3. Tìm kiếm sinh viên theo Học lực");
            System.out.println("4. Sắp   xếp theo học lực giảm dần");
            System.out.println("5. Thoát");
            System.out.println("==================================");
            System.out.print("Chọn chức năng:");
            choice = sc.nextInt();
            sc.nextLine();
            switch (choice){
                case 1:
                    inputStudents();
                    break;
                case 2:
                    displayStudents();
                    break;
                case 3:
                    searchByRank();
                    break;
                case 4:
                    sortByScoreDesc();
                    break;
                case 5:
                    System.out.println("Thoat chuong trinh!");
                    break;
                default:
                    System.out.println("Lua chon khong hop le!");
            }
        }while (choice != 5);
    }

    public static void inputStudents(){
        System.out.print("Nhap so luong sinh vien:");
        n = sc.nextInt();
        sc.nextLine();

        students = new Student[n];
        for (int i = 0; i < n; i++) {
            System.out.println("Nhap thong tin sinh vien thu " + (i + 1));
            String id;
            while (true) {
                System.out.print("Ma SV: ");
                id = sc.nextLine();
                if (id.startsWith("SV") && id.length() == 5) {
                    break;
                }
                System.out.println("Ma sinh vien khong hop le!");
            }
            System.out.print("Ho ten: ");
            String name = sc.nextLine();

            System.out.print("Diem trung binh: ");
            double score = sc.nextDouble();
            sc.nextLine();

            students[i] = new Student(id, name, score);
        }
    }
    public static void displayStudents(){
        if (students == null) {
            System.out.println("Danh sach rong!");
            return;
        }
        for (Student s: students){
            System.out.println(s);
        }
    }
    public static void searchByRank(){
        if (students == null) {
            System.out.println("Danh sach rong!");
            return;
        }
        System.out.print("Nhap hoc luc can tim (Gioi/Kha/Trung Binh): ");
        String rank = sc.nextLine();
        boolean found = false;
        for (Student s : students) {
            if (s.getRank().equalsIgnoreCase(rank)) {
                System.out.println(s);
                found = true;
            }
        }

        if (!found) {
            System.out.println("Khong tim thay sinh vien nao!");
        }
    }
    public static void sortByScoreDesc(){
        if (students == null) {
            System.out.println("Danh sach rong!");
            return;
        }
        for (int i = 0; i < students.length-1; i++) {
            for (int j = 1; j < students.length; j++) {
                if (students[i].getScore() < students[j].getScore()) {
                    Student temp = students[i];
                    students[i] = students[j];
                    students[j] = temp;
                }
            }
        }
        System.out.println("Thanh cong!");
    }
}
