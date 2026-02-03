package SESSION08;

public class StudentManager {
    // --- KHAI BÁO THUỘC TÍNH (Attributes) ---
    private Student[] students;       // Mảng chứa sinh viên
    private int currentCount;         // Biến đếm số lượng hiện tại
    private final int MAX_SIZE = 100; // Hằng số giới hạn mảng

    // --- CONSTRUCTOR ---
    public StudentManager() {
        this.students = new Student[MAX_SIZE];
        this.currentCount = 0;
    }


    // [FR1] Thêm sinh viên mới
    public boolean addStudent(Student s) {
        if (currentCount >= students.length) {
            System.out.println("Danh sách đã đầy");
            return false;
        }

        for (int i = 0; i < currentCount; i++) {
            if (students[i].getStudentId().equalsIgnoreCase(s.getStudentId())) {
                System.out.println("Mã sinh viên đã tồn tại");
                return false;
            }
        }

        students[currentCount++] = s;
        return true;
    }

    // [FR2] Hiển thị danh sách sinh viên
    public void displayAllStudents() {
        if (currentCount == 0) {
            System.out.println("Danh sách sinh viên đang trống!");
            return;
        }

        System.out.println("\n================= DANH SÁCH SINH VIÊN =================");
        System.out.printf("%-8s %-20s %-5s %-10s %-8s %-12s\n",
                "Mã SV", "Họ tên", "Tuổi", "Giới tính", "Điểm TB", "Xếp loại");
        System.out.println("--------------------------------------------------------------");

        for (int i = 0; i < currentCount; i++) {
            Student s = students[i];
            System.out.printf("%-8s %-20s %-5d %-10s %-8.2f %-12s\n",
                    s.getStudentId(),
                    s.getStudentName(),
                    s.getAge(),
                    (s.isSex() ? "Nam" : "Nữ"),
                    s.getAvgScore(),
                    s.getRank());
        }
    }

    // [FR3] Tìm kiếm sinh viên theo Mã
    public Student findById(String maSV) {
        for (int i = 0; i < currentCount; i++) {
            if (students[i].getStudentId().equalsIgnoreCase(maSV))
                return students[i];
        }
        return null;
    }

    // [FR3] Tìm kiếm sinh viên theo Tên
    public void findByName(String keyword) {
        boolean found = false;
        System.out.println("--- KẾT QUẢ TÌM THEO TÊN ---");

        for (int i = 0; i < currentCount; i++) {
            if (students[i].getStudentName().toLowerCase().contains(keyword.toLowerCase())) {
                System.out.println(students[i].toString());
                found = true;
            }
        }
        if (!found) System.out.println("Không tìm thấy sinh viên nào có tên chứa: " + keyword);
    }

    // [FR4] Cập nhật thông tin sinh viên
    public boolean updateStudent(String id, Student newInfo) {
        for (int i = 0; i < currentCount; i++) {
            if (students[i] != null && students[i].getStudentId().trim().equalsIgnoreCase(id.trim())) {
                //Cập nhật thông tin mới
                students[i].setStudentName(newInfo.getStudentName());
                students[i].setAge(newInfo.getAge());
                students[i].setSex(newInfo.isSex());
                students[i].setMathScore(newInfo.getMathScore());
                students[i].setPhysicsScore(newInfo.getPhysicsScore());
                students[i].setChemistryScore(newInfo.getChemistryScore());

                //Tự tính lại điểm trung bình
                students[i].calculateAvgAndRank();

                return true;
            }
        }
        return false;
    }

    // [FR5] Xóa sinh viên
    public boolean deleteStudent(String maSV) {
        for (int i = 0; i < currentCount; i++) {
            if (students[i].getStudentId().equalsIgnoreCase(maSV)) {
                for (int j = i; j < currentCount - 1; j++) {
                    students[j] = students[j + 1];
                }
                students[--currentCount] = null;
                return true;
            }
        }
        return false;
    }

    //[FR6]
    public void calculateAvgAndRankById(String maSV) {
        for (int i = 0; i < currentCount; i++) {
            if (students[i].getStudentId().equalsIgnoreCase(maSV)) {

                students[i].calculateAvgAndRank();

                System.out.println("Điểm trung bình: " + students[i].getAvgScore());
                System.out.println("Xếp loại: " + students[i].getRank());
                return;
            }
        }
        System.out.println("Không tìm thấy sinh viên!");
    }


    // [FR7] Sắp xếp theo Điểm TB giảm dần
    public void sortByAvgDesc() {
        for (int i = 0; i < currentCount - 1; i++) {
            for (int j = 0; j < currentCount - 1 - i; j++) {
                if (students[j].getAvgScore() < students[j + 1].getAvgScore()) {
                    // Hoán đổi
                    Student temp = students[j];
                    students[j] = students[j + 1];
                    students[j + 1] = temp;
                }
            }
        }
        System.out.println("Đã sắp xếp theo điểm trung bình giảm dần (Bubble Sort)!");
    }

    // [FR7] Sắp xếp theo Tên A-Z
    public void sortByName() {
        for (int i = 0; i < currentCount - 1; i++) {
            int minIndex = i;

            for (int j = i + 1; j < currentCount; j++) {
                if (students[j].getStudentName()
                        .compareToIgnoreCase(students[minIndex].getStudentName()) < 0) {
                    minIndex = j;
                }
            }

            // Đổi chỗ nếu tìm được tên nhỏ hơn
            if (minIndex != i) {
                Student temp = students[i];
                students[i] = students[minIndex];
                students[minIndex] = temp;
            }
        }
        System.out.println("Đã sắp xếp theo tên A-Z (Selection Sort)!");
    }

    // [FR7] Hiển thị thông tin khi sắp xếp BẢNG TẠM
    public void showSortedRankTable() {
        if (currentCount == 0) {
            System.out.println("Danh sách trống!");
            return;
        }

        Student[] tempStudents = new Student[currentCount];
        for (int i = 0; i < currentCount; i++) {
            tempStudents[i] = students[i];
        }

        for (int i = 0; i < currentCount - 1; i++) {
            for (int j = 0; j < currentCount - 1 - i; j++) {
                if (tempStudents[j].getAvgScore() < tempStudents[j + 1].getAvgScore()) {
                    // Hoán đổi vị trí trong mảng TEMP
                    Student t = tempStudents[j];
                    tempStudents[j] = tempStudents[j + 1];
                    tempStudents[j + 1] = t;
                }
            }
        }

        System.out.println("\n=== BẢNG XẾP HẠNG (VIEW ONLY) ===");
        System.out.printf("%-10s %-20s %-10s %-15s\n", "Mã SV", "Họ và Tên", "Điểm TB", "Xếp Loại");
        System.out.println("---------------------------------------------------------------");

        for (int i = 0; i < currentCount; i++) {
            System.out.printf("%-10s %-20s %-10.2f %-15s\n",
                    tempStudents[i].getStudentId(),
                    tempStudents[i].getStudentName(),
                    tempStudents[i].getAvgScore(),
                    tempStudents[i].getRank());
        }
        System.out.println("---------------------------------------------------------------");
        System.out.println("(Lưu ý: Danh sách gốc vẫn giữ nguyên thứ tự nhập)");
    }

    // [FR8] Thống kê báo cáo
    public void showStatistics() {
        // Nếu chưa có sinh viên nào thì báo và thoát
        if (currentCount == 0) {
            System.out.println("Hiện tại chưa có sinh viên nào.");
            return;
        }

        // Biến đếm số lượng theo xếp loại
        int xuatSac = 0;
        int gioi    = 0;
        int kha     = 0;
        int trungBinh = 0;
        int yeu     = 0;

        // Theo dõi sinh viên điểm TB cao nhất / thấp nhất
        double maxTB = -1.0;
        Student svMax = null;

        double minTB = 11.0;   // lớn hơn điểm max để so sánh
        Student svMin = null;

        // Duyệt toàn bộ danh sách
        for (int i = 0; i < currentCount; i++) {
            Student s = students[i];
            if (s == null) continue;

            double tb = s.getAvgScore();     // lấy điểm TB
            String loai = s.getRank();       // lấy xếp loại

            // Cập nhật max / min
            if (tb > maxTB) {
                maxTB = tb;
                svMax = s;
            }
            if (tb < minTB) {
                minTB = tb;
                svMin = s;
            }

            // Đếm theo xếp loại
            if (loai.equals("Xuất sắc")) {
                xuatSac++;
            } else if (loai.equals("Giỏi")) {
                gioi++;
            } else if (loai.equals("Khá")) {
                kha++;
            } else if (loai.equals("Trung bình")) {
                trungBinh++;
            } else {
                yeu++;
            }
        }

        // In báo cáo thống kê
        System.out.println("\n===== BÁO CÁO THỐNG KÊ =====");
        System.out.println("Tổng số sinh viên: " + currentCount);
        System.out.println("Theo xếp loại:");
        System.out.println("  - Xuất sắc : " + xuatSac);
        System.out.println("  - Giỏi     : " + gioi);
        System.out.println("  - Khá      : " + kha);
        System.out.println("  - Trung bình : " + trungBinh);
        System.out.println("  - Yếu      : " + yeu);
        System.out.println("-----------------------------");

        // In sinh viên điểm cao nhất
        if (svMax != null) {
            System.out.println("Sinh viên điểm TB cao nhất:");
            System.out.println("  " + svMax.getStudentId() + " - " +
                    svMax.getStudentName() + " → TB: " + String.format("%.2f", maxTB));
        }

        // In sinh viên điểm thấp nhất
        if (svMin != null) {
            System.out.println("Sinh viên điểm TB thấp nhất:");
            System.out.println("  " + svMin.getStudentId() + " - " +
                    svMin.getStudentName() + " → TB: " +String.format("%.2f", minTB));
        }

        System.out.println("=============================");
    }
}