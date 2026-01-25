package SESSION01.HW03;

public class SS01_03 {
    public static void main(String[] args) {

        // Hai biến tham chiếu trên STACK
        String book1 = "Java Basic";
        String book2 = "Python Intro";

        System.out.println("Trước khi hoán đổi:");
        System.out.println("Book1 = " + book1 + ", Book2 = " + book2);

        /*
         * STACK:
         * book1 --> tham chiếu tới object "Java Basic" trên HEAP
         * book2 --> tham chiếu tới object "Python Intro" trên HEAP
         */

        // Biến tạm temp cũng là biến tham chiếu trên STACK
        String temp = book1;

        book1 = book2;
        book2 = temp;

        System.out.println("\nSau khi hoán đổi:");
        System.out.println("Book1 = " + book1 + ", Book2 = " + book2);
    }
}
