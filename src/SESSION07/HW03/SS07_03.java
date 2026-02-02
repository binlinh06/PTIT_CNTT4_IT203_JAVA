package SESSION07.HW03;

public class SS07_03 {
    public static void main(String[] args) {

        double[] scores = {6.5, 8.0, 4.5};

        System.out.println("Danh sách điểm: 6.5, 8.0, 4.5\n");

        // Tính điểm trung bình
        double avg = ScoreUtils.calculateAverage(scores);
        System.out.println(">> Kết quả xử lý:");
        System.out.printf("- Điểm trung bình cả lớp: %.2f\n", avg);

        // Kiểm tra từng điểm
        for (double score : scores) {
            if (ScoreUtils.checkPass(score)) {
                System.out.println("- Điểm " + score + ": Đạt");
            } else {
                System.out.println("- Điểm " + score + ": Trượt");
            }
        }
    }
}
