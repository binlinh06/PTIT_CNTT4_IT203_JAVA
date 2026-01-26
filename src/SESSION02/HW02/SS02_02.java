package SESSION02.HW02;

import java.util.Scanner;

public class SS02_02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhap ma khu vuc (A,B,C,D):");
        String code = sc.nextLine();
        switch (code){
            case "A":
                System.out.println("Vi tri:Tầng 1: Sách Văn học");
                break;
            case "B":
                System.out.println("Vi tri:Tầng 2: Sách Khoa học");
                break;
            case "C":
                System.out.println("Vi tri:Tầng 3: Sách Ngoại ngữ");
                break;
            case "D":
                System.out.println("Vi tri:Tầng 4: Sách Tin học");
                break;
            default:
                System.out.println("Loi:Ma khu vuc ko hop le!");
        }
        sc.close();
    }
}
