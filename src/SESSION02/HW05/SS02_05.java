package SESSION02.HW05;

import java.util.Scanner;

public class SS02_05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int total = 100;
        int num;
            System.out.println("--- HE THONG DANG GIA DOC GIA ---");
            System.out.println("(Nhap so ngay tre.Nhap so 999 de ket thuc)");

        while (true){
            System.out.print("So ngay tre cua lan nay:");
            num = sc.nextInt();
            if (num == 999) {
                break;
            }
            if (num > 0) {
                int point = num * 2;
                total -= point;
                System.out.println("->Tra tre "+ num + "ngay: -"+point+" diem");
            }else {
                total += 5;
                System.out.println("->Tra dung han: +5 diem");
            }
        }
        System.out.println("Tong diem uy tin: "+total);
        if(total >120){
            System.out.println("Xep loai:Độc giả Thân thiết");
        } else if(total >= 80 && total <= 120){
            System.out.println("Xep loai:Độc giả Tiêu chuẩn");
        }else {
            System.out.println("Xep loai:Độc giả cần lưu ý");
        }
        sc.close();
    }
}
