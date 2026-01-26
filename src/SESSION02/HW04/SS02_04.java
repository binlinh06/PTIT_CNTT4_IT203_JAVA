package SESSION02.HW04;

import java.util.Scanner;

public class SS02_04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int ID;
        do {
            System.out.print("Nhap ma ID sach moi(phai>0):");
            ID = sc.nextInt();
            if(ID > 0){
                System.out.println("Xac nhan:Ma sach "+ID + " da duoc ghi nhan");
            }else {
                System.out.println("Loi:ID phai la so duong.Moi nhap lai");
            }
        }while (ID <= 0);
        sc.close();
    }
}
