package SESSION08.miniproject;


public class Student {
    // 1. Khai báo thuộc tính (Attributes)
    private String studentId;     // Mã SV
    private String studentName;   // Họ tên
    private int age;              // Tuổi
    private boolean sex;          // Giới tính
    private double mathScore;     // Toán
    private double physicsScore;  // Lý
    private double chemistryScore; // Hóa

    // Hai thuộc tính phụ (tự tính toán)
    private double avgScore;      // Điểm TB [FR6]
    private String rank;          // Xếp loại [FR6]

    // 2. Constructor
    public Student(String studentId, String studentName, int age, boolean sex, double mathScore, double physicsScore, double chemistryScore) {
        this.studentId = studentId;
        this.studentName = studentName;
        this.age = age;
        this.sex = sex;
        this.mathScore = mathScore;
        this.physicsScore = physicsScore;
        this.chemistryScore = chemistryScore;

        //tính toán ngay khi khởi tạo
        setMathScore(mathScore);
        setPhysicsScore(physicsScore);
        setChemistryScore(chemistryScore);

        //Xếp loại + tính điểm trung bình
        classify();
        calculateAvgAndRank();
    }

    // 3. Các phương thức xử lý (Methods)
    //Xếp loại
    private void classify() {
        if (avgScore >= 8 && mathScore >= 6.5 && physicsScore >= 6.5 && chemistryScore >= 6.5) {
            rank = "Giỏi";
        } else if (avgScore >= 6.5 && mathScore >= 5 && physicsScore >= 5 && chemistryScore >= 5) {
            rank = "Khá";
        } else if (avgScore >= 5) {
            rank = "Trung bình";
        } else {
            rank = "Yếu";
        }
    }

    // [FR6] Tính điểm TB và Xếp loại
    public void calculateAvgAndRank() {
        this.avgScore = (mathScore + physicsScore + chemistryScore) / 3;
        classify();
    }

    // Getter & Setter
    public String getStudentId() {
        return studentId;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setSex(boolean sex) {
        this.sex = sex;
    }

    //Set điểm toán
    public void setMathScore(double mathScore) {
        if (mathScore >= 0 && mathScore <= 10) {
            this.mathScore = mathScore;
        } else {
            System.out.println("Lỗi: Điểm Toán phải từ 0 đến 10!");
            this.mathScore = 0;
        }
    }

    // Setter cho điểm Lý
    public void setPhysicsScore(double physicsScore) {
        if (physicsScore >= 0 && physicsScore <= 10) {
            this.physicsScore = physicsScore;
        } else {
            System.out.println("Lỗi: Điểm Lý phải từ 0 đến 10!");
            this.physicsScore = 0;
        }
    }

    // Setter cho điểm Hóa
    public void setChemistryScore(double chemistryScore) {
        if (chemistryScore >= 0 && chemistryScore <= 10) {
            this.chemistryScore = chemistryScore;
        } else {
            System.out.println("Lỗi: Điểm Hóa phải từ 0 đến 10!");
            this.chemistryScore = 0;
        }
    }


    //get AvgScore
    public double getAvgScore() {
        return avgScore;
    }
    //getRank
    public String getRank() {
        return rank;
    }

    public String getStudentName() {
        return studentName;
    }

    public int getAge() {
        return age;
    }

    public boolean isSex() {
        return sex;
    }

    public double getMathScore() {
        return mathScore;
    }

    public double getPhysicsScore() {
        return physicsScore;
    }

    public double getChemistryScore() {
        return chemistryScore;
    }

    @Override
    public String toString() {
        return String.format("ID: %s | Tên: %-15s | Tuổi: %d | GT: %s | Toán: %.1f | Lý: %.1f | Hóa: %.1f | TB: %.2f | Loại: %s",
                studentId, studentName, age, (sex ? "Nam" : "Nữ"),
                mathScore, physicsScore, chemistryScore, avgScore, rank);
    }
}
