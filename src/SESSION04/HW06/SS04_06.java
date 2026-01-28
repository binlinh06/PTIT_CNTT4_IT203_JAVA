package SESSION04.HW06;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class SS04_06 {
    public static void main(String[] args) {
        String review = "Cuốn sách này rất tệ, nội dung thật là ngu ngốc và không đáng đọc.";

        // 1. Blacklist
        String[] blacklist = {"tệ", "ngu ngốc", "không đáng đọc"};

        // 2. Tạo regex
        String regex = String.join("|", blacklist);
        Pattern pattern = Pattern.compile(regex, Pattern.CASE_INSENSITIVE);
        Matcher matcher = pattern.matcher(review);

        // 3. Lọc từ nhạy cảm
        StringBuilder filtered = new StringBuilder();
        while (matcher.find()) {
            String stars = "*".repeat(matcher.group().length());
            matcher.appendReplacement(filtered, stars);
        }
        matcher.appendTail(filtered);

        // 4. Rút gọn nếu quá 200 ký tự
        String result = filtered.toString();
        if (result.length() > 200) {
            int cutIndex = result.lastIndexOf(" ", 200);
            if (cutIndex == -1) cutIndex = 200;

            StringBuilder shortReview = new StringBuilder();
            shortReview.append(result.substring(0, cutIndex));
            shortReview.append("...");
            result = shortReview.toString();
        }

        // 5. Kết quả
        System.out.println("Review sau khi xử lý: " + result);
    }
}
