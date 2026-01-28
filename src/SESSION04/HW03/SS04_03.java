package SESSION04.HW03;

import java.text.SimpleDateFormat;
import java.util.Date;

public class SS04_03 {
    public static void main(String[] args) {
        String[] transactions = {
                "BK001-20/01",
                "BK005-21/01",
                "BK099-22/01"
        };

        String today = new SimpleDateFormat("dd/MM/yyyy").format(new Date());
        /* ================= STRING BUILDER ================= */
        long startSB = System.currentTimeMillis();

        StringBuilder reportSB = new StringBuilder();
        reportSB.append("--- BÁO CÁO MƯỢN SÁCH ---\n");
        reportSB.append("Ngày tạo: ").append(today).append("\n");
        for (String t : transactions){
            reportSB.append("Giao dịch: ").append(t).append("\n");
        }
        long endSB = System.currentTimeMillis();
        /* ================= STRING THƯỜNG ================= */
        long startS = System.currentTimeMillis();

        String reportS = "--- BÁO CÁO MƯỢN SÁCH ---\n";
        reportS += "Ngày tạo: " + today + "\n";

        for (String t : transactions) {
            reportS += "Giao dịch: " + t + "\n";
        }

        long endS = System.currentTimeMillis();

        System.out.println(reportSB.toString());

        System.out.println("Số thời gian thực thi đối với StringBuilder: " + (endSB - startSB));
        System.out.println("Số thời gian thực thi đối với String: " + (endS - startS));
    }
}
