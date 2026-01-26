package SESSION02.HW06;
import java.util.Scanner;
public class SS02_06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int max = -1;
        int min = Integer.MAX_VALUE;
        int sum = 0;
        int count = 0;

        String[] days = {
                "Thu 2", "Thu 3", "Thu 4",
                "Thu 5", "Thu 6", "Thu 7", "Chu Nhat"
        };

        for (int i = 0; i < 7; i++) {
            System.out.print("Nhap luot muon ngay " + days[i] + ": ");
            int luotMuon = sc.nextInt();

            if (luotMuon == 0) {
                continue; // thư viện đóng cửa
            }

            // cập nhật max
            if (luotMuon > max) {
                max = luotMuon;
            }

            // cập nhật min
            if (luotMuon < min) {
                min = luotMuon;
            }

            sum += luotMuon;
            count++;
        }

        System.out.println("\n--- KET QUA THONG KE ---");
        System.out.println("Luot muon cao nhat: " + max);
        System.out.println("Luot muon thap nhat: " + min);
        System.out.println("Trung binh luot muon/ngay: " + (double) sum / count);

        sc.close();
    }
}
