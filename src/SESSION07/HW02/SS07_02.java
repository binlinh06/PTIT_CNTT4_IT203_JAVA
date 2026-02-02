package SESSION07.HW02;

public class SS07_02 {
    static void main(String[] args) {
        // --- 1: BIẾN NGUYÊN THỦY ---
        int a = 10;
        int b = a;

        b = 20;

        System.out.println("Primitive:");
        System.out.println("a = " + a); // 10
        System.out.println("b = " + b); // 20

        System.out.println("----------------------");

        // --- 2: BIẾN THAM CHIẾU ---
        Student s1 = new Student("Nguyen Van A");
        Student s2 = s1;

        s2.name = "Tran Thi B";

        System.out.println("Reference:");
        System.out.println("s1.name = " + s1.name);
        System.out.println("s2.name = " + s2.name);
    }
}
