package SESSION04.HW04;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class SS04_04 {
    static void main(String[] args) {
        String cardID = "TV202312345";
        String regex = "^[A-Z]{2}\\d{4}\\d{5}$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(cardID);
        if (matcher.matches()) {
            System.out.println("Mã thẻ hợp lệ!");
        } else {
            // Kiểm tra chi tiết lỗi
            if (!cardID.matches("^[A-Z]{2}.*")) {
                System.out.println("Lỗi: Thiếu tiền tố chữ cái viết hoa (VD: TV)");
            }
            else if (!cardID.substring(2, 6).matches("\\d{4}")) {
                System.out.println("Lỗi: Năm không hợp lệ (phải gồm 4 chữ số)");
            }
            else if (!cardID.substring(6).matches("\\d{5}")) {
                System.out.println("Lỗi: 5 ký tự cuối phải là số");
            }
            else {
                System.out.println("Lỗi: Định dạng mã thẻ không hợp lệ");
            }
        }
    }
}
