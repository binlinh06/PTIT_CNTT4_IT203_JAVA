package SESSION07.HW01;

public class Student {
    // 1. Biến instance
    String maSV;
    String tenSV;

    // 2. Biến static
    static int totalStudent = 0;

    // 3. Constructor
    public Student(String maSV, String tenSV) {
        this.maSV = maSV;
        this.tenSV = tenSV;
        totalStudent++;
    }

    // 4. Hiển thị thông tin sinh viên
    public void displayInfo() {
        System.out.println("Mã SV: " + maSV);
        System.out.println("Tên SV: " + tenSV);
        System.out.println("--------------------");
    }

    // 5. Static method
    public static void displayTotalStudent() {
        System.out.println("Tổng số sinh viên đã tạo: " + totalStudent);
    }

}
