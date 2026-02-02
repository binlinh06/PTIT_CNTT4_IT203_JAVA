package SESSION07.HW03;

public class ScoreUtils {
    public static boolean checkPass(double score){
        return score >= 5.0;
    }
    public static double calculateAverage(double[] scores){
        double sum = 0;
        for(double s:scores){
            sum += s;
        }
        return sum/scores.length;
    }
}
