package SESSION09.HW01;

public class Student extends Person {
    private String maSV;
    private double diemTB;

    public Student(String fullName,int age,String maSV,double diemTB){
        super(fullName,age);
        this.maSV = maSV;
        this.diemTB = diemTB;
    }
    @Override
    public void display() {
        super.display();
        System.out.println("Mã SV: " + maSV);
        System.out.println("Điểm TB: " + diemTB);
    }
}
