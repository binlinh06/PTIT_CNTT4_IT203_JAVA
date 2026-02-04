package SESSION08.miniproject;

import java.util.Scanner;

public class MainApp {
    public static void main(String[] args) {
        StudentManager manager = new StudentManager();
        Scanner sc = new Scanner(System.in);
        int choice;

        do {
            printMenu();
            System.out.print("Mời bạn chọn chức năng (1-9): ");
            choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1: //THÊM SINH VIÊN MỚI
                    System.out.println("--- THÊM SINH VIÊN MỚI ---");
                    //Nhập thông tin Student
                    System.out.print("Nhập mã SV: ");
                    String id = sc.nextLine();
                    System.out.print("Nhập tên: ");
                    String name = sc.nextLine();
                    System.out.print("Nhập tuổi: ");
                    int age = sc.nextInt();
                    sc.nextLine();

                    System.out.print("Giới tính (true: Nam, false: Nữ): ");
                    boolean sex = sc.nextBoolean();

                    double m = inputScore(sc, "Toán");
                    double p = inputScore(sc, "Lý");
                    double c = inputScore(sc, "Hóa");
                    sc.nextLine();

                    //Tạo đối tượng
                    Student newStudent = new Student(id, name, age, sex, m, p, c);
                    if (manager.addStudent(newStudent)) {
                        System.out.println("Thêm thành công!");
                    } else {
                        System.out.println("Thêm thất bại (Trùng mã hoặc đầy bộ nhớ)!");
                    }
                    break;

                case 2: //HIỂN THỊ THÔNG TIN SINH VIÊN
                    manager.displayAllStudents();
                    break;

                case 3: //TÌM KIẾM SINH VIÊN THEO MÃ | TÊN
                    System.out.println("--- TÌM KIẾM SINH VIÊN ---");
                    System.out.print("Nhập từ khóa (Mã SV hoặc Tên): ");
                    String keyword = sc.nextLine().trim();

                    Student foundById = manager.findById(keyword);

                    if (foundById != null) {
                        System.out.println("Tìm thấy sinh viên theo Mã ID:");
                        System.out.println(foundById.toString());
                    } else {
                        //Tìm sinh viên theo Name
                        manager.findByName(keyword);
                    }
                    break;

                case 4: //CẬP NHẬT THÔNG TIN
                    System.out.println("--- CẬP NHẬT THÔNG TIN ---");
                    //Nhập ID cần sửa
                    System.out.print("Nhập ID sinh viên cần sửa: ");
                    String idUpdate = sc.nextLine();
                    Student existingStudent = manager.findById(idUpdate);
                    if (existingStudent == null) {
                        System.out.println("Không tìm thấy ID!!");
                    } else {
                        //Nhập thông tin mới
                        System.out.print("Nhập Tên mới: ");
                        String newName = sc.nextLine();

                        System.out.print("Nhập Tuổi mới: ");
                        int newAge = sc.nextInt();
                        sc.nextLine();

                        System.out.print("Nhập Giới tính (true: Nam, false: Nữ): ");
                        boolean newSex = sc.nextBoolean();

                        //Nhập điểm toán lý hóa
                        double newMath = inputScore(sc, "Toán");
                        double newPhys = inputScore(sc, "Lý");
                        double newChem = inputScore(sc, "Hóa");
                        sc.nextLine();

                        Student newInfo = new Student(idUpdate, newName, newAge, newSex, newMath, newPhys, newChem);

                        boolean check = manager.updateStudent(idUpdate, newInfo);

                        if (check) {
                            System.out.println("Cập nhật thành công!");
                        } else {
                            System.out.println("Thất bại: Không tìm thấy mã SV này.");
                        }
                    }
                    break;

                case 5: //XÓA SINH VIÊN
                    System.out.print("Nhập mã SV cần xóa: ");
                    String idDelete = sc.nextLine();
                    if (manager.deleteStudent(idDelete))
                        System.out.println("Xóa sinh viên thành công!");
                    else
                        System.out.println("Không tìm thấy sinh viên!");
                    break;

                case 6:
                    System.out.print("Nhập mã sinh viên: ");
                    String maSV = sc.nextLine();

                    manager.calculateAvgAndRankById(maSV);
                    break;

                case 7:
                    System.out.println("\n--- TÙY CHỌN SẮP XẾP ---");
                    System.out.println("1. Xem Bảng xếp hạng theo Điểm TB (Giảm dần)");
                    System.out.println("2. Xem Danh sách theo Tên (A-Z)");
                    System.out.print("Bạn chọn (1 hoặc 2): ");

                    int sortChoice = 0;
                    if (sc.hasNextInt()) {
                        sortChoice = sc.nextInt();
                        sc.nextLine();
                    } else {
                        sc.nextLine();
                    }

                    if (sortChoice == 1) {
                        manager.showSortedRankTable();
                    } else if (sortChoice == 2) {
                        manager.sortByName();
                        manager.displayAllStudents();

                    } else {
                        System.out.println("Lựa chọn không hợp lệ!");
                    }
                    break;
                case 8:
                    System.out.println("\n=== THỐNG KÊ ===");
                    manager.showStatistics();
                    break;
                case 9:
                    System.out.println("Kết thúc chương trình!");
                    break;
                default:
                    System.out.println("Chức năng không tồn tại. Vui lòng chọn lại!");
            }
        } while (choice != 9);
    }

    private static void printMenu() {
        System.out.println("\n================ QUẢN LÝ SINH VIÊN ================");
        System.out.println("| 1. Thêm sinh viên mới                           |");
        System.out.println("| 2. Hiển thị tất cả sinh viên                    |");
        System.out.println("| 3. Tìm kiếm sinh viên                           |");
        System.out.println("| 4. Cập nhật thông tin sinh viên                 |");
        System.out.println("| 5. Xóa sinh viên                                |");
        System.out.println("| 6. Tính điểm trung bình và xếp loại (Tự động)   |");
        System.out.println("| 7. Sắp xếp sinh viên                            |");
        System.out.println("| 8. Thống kê                                     |");
        System.out.println("| 9. Thoát                                        |");
        System.out.println("===================================================");
    }

    private static double inputScore(Scanner sc, String subjectName) {
        double score;
        while (true) {
            System.out.print("Nhập điểm " + subjectName + " (0-10): ");
            score = sc.nextDouble();
            if (score >= 0 && score <= 10) {
                break;
            }
            System.out.println("Lỗi nhập điểm, điểm số môn từ 0-10!!");
        }
        return score;
    }
}