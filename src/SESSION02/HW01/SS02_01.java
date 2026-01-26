package SESSION02.HW01;

import java.util.Scanner;

public class SS02_01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhap tuoi cua ban:");
        int age = sc.nextInt();

        System.out.print("Nhap so sach dang muon:");
        int book = sc.nextInt();

        if (age >= 18 && book < 3) {
            System.out.println("Ket qua:Ban du dieu kien muon sach quy hiem");
        }else{
            System.out.println("Ket qua:Ko du dieu kien");
        }
        if(age < 18){
            System.out.println("-Ly do:Ban phai tu du 18 tuoi tro len");
        }else if(book >= 3){
            System.out.println("-Ly do:Ban da muon toi da 3 cuon");
        }
        sc.close();
    }
}
